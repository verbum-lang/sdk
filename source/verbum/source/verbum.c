
#include "verbum.h"

#include "../../library/global.h"
#include "../../library/debug.h"
#include "../../library/application.h"
#include "../../library/connection.h"
#include "../../library/datetime.h"
#include "../../library/debug.h"
#include "../../library/file.h"
#include "../../library/ini_file.h"
#include "../../library/memory.h"
#include "../../library/process.h"

#include "../../verbum-node/node.h"
#include "../../verbum-node-mapper/node-mapper.h"

#define VERBUM_LANGUAGE_VERSION "1.0.0"

static void prepare_settings (int argc, char *argv[]);
static void set_default_options (void);
static void check_params (int argc, char *argv[]);
static void usage (void);

static void *check_and_open_fork_controller (void *_param);
static void *start_fork_controller (void *_param);
static int open_fork_controller_process (void);
static int fork_controller (void);
static void *node_mapper_monitor_th (void *_param);
static void open_node_mapper (void);
static void *start_verbum_node_mapper (void *param);
static int create_verbum_node (void);
static void *create_verbum_node_th (void *_param);
static void *start_new_node (void *_param);

typedef struct {
	int node_mapper_port;
} nm_param_t;

int initialization (int argc, char *argv[]) 
{
    say("Verbum started.");

    prepare_settings(argc, argv);

    print("Node ID.........: %s", global.configuration.node.id);
    print("Node Mapper ID..: %s", global.configuration.node_mapper.id);
    print("Node Mapper port: %d", global.configuration.node_mapper.server_port);

	return 0;

	// Start fork controller.
	pthread_t tid1;
	pthread_create(&tid1, NULL, check_and_open_fork_controller, NULL);

	// Create new node.
	pthread_t tid2;
	nm_param_t *param = (nm_param_t *) malloc (sizeof(nm_param_t));

	param->node_mapper_port = global.configuration.node_mapper.server_port;
	pthread_create(&tid2, NULL, start_new_node, param);

	infinite_loop();
    return 0;
}

static void *check_and_open_fork_controller (void *_param)
{
	char address []= LOCALHOST;
	int sock = -1, status = 0;
	char *response = NULL;
	char message[]= "no-data:" VERBUM_EOH;
	pthread_t tid1;

	say("Checking Fork Controller connection.");

	sock = check_protocol(address, VERBUM_FORK_CONTROLLER_PORT, 1, 1);

	if (sock != -1) {
		response = send_raw_data(sock, message);
		if (response) {
			status = 1;
			mem_sfree(response);
		}

		close(sock);
	} 

	if (!status) 
		pthread_create(&tid1, NULL, start_fork_controller, NULL);

	say("Fork Controller OK.");
}

static void *start_fork_controller (void *_param)
{
	say("Open new Fork Controller connection.");
	open_fork_controller_process();
}

static int open_fork_controller_process (void)
{
    int fd, fd_limit;
    pid_t pid;

    say("Opening via fork(), application: Fork Controller");

    pid = fork();

    if (pid < 0)
        say_ret(0, "error open fork() 1.");    
    if (pid > 0)
       return 0;

    if (setsid() < 0)
        say_ret(0, "error setsid.");       

    pid = fork();

    if (pid < 0)
        say_exit("error open fork() 2.");
    if (pid > 0) 
        say_exit("fork() 2.");

    // Close all file descriptors.
    fd_limit = (int) sysconf(_SC_OPEN_MAX);

    for (int fd = STDERR_FILENO + 1; fd < fd_limit; fd++) {
#ifndef BLOCK_FORK_STDOUT
        if (fd != 1)
#endif
        close(fd);
    }

    stdin  = fopen("/dev/null", "r" );
    stderr = fopen("/dev/null", "w+");
    
#ifndef BLOCK_FORK_STDOUT
    stdout = fopen("/dev/null", "w+");
#endif

    // Ignore child and tty signals.
    signal(SIGCHLD, SIG_IGN);
    signal(SIGTSTP, SIG_IGN);
    signal(SIGTTOU, SIG_IGN);
    signal(SIGTTIN, SIG_IGN);

    say("Opened via fork(), application: Fork Controller");

	fork_controller();
}

static int fork_controller (void)
{
    struct sockaddr_in address, client;
    socklen_t client_size;
	struct timeval tms;
    int ssock = -1, nsock = -1;
    const int enable = 1;
	pthread_t tid1;
	char *response = NULL;
	char success_message []= VERBUM_DEFAULT_SUCCESS VERBUM_EOH;

    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family      = AF_INET;
    address.sin_port        = htons(VERBUM_FORK_CONTROLLER_PORT);

    if (setsockopt(ssock, SOL_SOCKET, SO_REUSEADDR, &enable, sizeof(int)) < 0)
        say_ret(0, "Setsockopt (SO_REUSEADDR) failed.");

    if (bind(ssock, (struct sockaddr*) &address, sizeof(address)) != 0)
        say_exit("Error bind server.");

    if (listen(ssock, SERVERS_MAX_CONNECTION) != 0) 
        say_exit("Error listen server.");

    say("Fork controller server: %d", VERBUM_FORK_CONTROLLER_PORT);

	// Open Node Mapper monitor.
	nm_param_t *param = (nm_param_t *) malloc (sizeof(nm_param_t));
	param->node_mapper_port = global.configuration.node_mapper.server_port;
	pthread_create(&tid1, NULL, node_mapper_monitor_th, param);

	// Process server connections.
    while (1) {
		client_size = sizeof(client);
        nsock = accept(ssock, (struct sockaddr*) &client, &client_size);

        if (nsock != -1) {
			say("Fork Controller connection accepted!");

            // Configure socket.
            tms.tv_sec  = CONNECTION_TIMEOUT_RECV;
            tms.tv_usec = 0;
            setsockopt(nsock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));

			// Send header.
			send_handshake(nsock, 
				"Verbum Node Fork Controller - v1.0.0 - I Love Jesus <3\r\n\r\n");

			// Communication.
			response = get_recv_content(nsock);
			if (response) {

    			if (strstr(response, "create-verbum-node:")) {
					create_verbum_node();
					usleep(100000);
				}

				send(nsock, success_message, strlen(success_message), VERBUM_SEND_FLAGS);
				mem_sfree(response);
			}

            close(nsock);
        } else
            say("Error accept client - fork controller.");
    }
}

static void *node_mapper_monitor_th (void *_param)
{
	nm_param_t *param = (nm_param_t *) _param;
	char address [] = LOCALHOST;
	int sock = -1, status = 0;
	char *response = NULL;
	char message[]= "no-data:" VERBUM_EOH;

	say("Node Mapper monitor started!");
	say("Node Mapper server port: %d", param->node_mapper_port);

	while (1) {
		status = 0;
		sock   = check_protocol(address, param->node_mapper_port, 1, 1);

		if (sock != -1) {
			response = send_raw_data(sock, message);
			if (response) {
				status = 1;
				mem_sfree(response);
			}

			close(sock);
		}

		if (!status)
			open_node_mapper();

		sleep(1);
	}
	
	return NULL;
}

static void open_node_mapper (void)
{
    pthread_t tid;
    pthread_create(&tid, NULL, start_verbum_node_mapper, NULL);
}

static void *start_verbum_node_mapper (void *param)
{
    open_application(VERBUM_NODE_MAPPER_APPLICATION);
}

static int create_verbum_node (void)
{
	pthread_t tid1;
	pthread_create(&tid1, NULL, create_verbum_node_th, NULL);

	return 0;
}

static void *create_verbum_node_th (void *_param)
{
	open_application(VERBUM_NODE_APPLICATION);
	return NULL;
}

static void *start_new_node (void *_param)
{
	nm_param_t *param = (nm_param_t *) _param;
	char address []= LOCALHOST;

	say("Creating new node by Verbum...");
	say("NM port: %d", param->node_mapper_port);

	while (1) {
		if (process_create_node(address, param->node_mapper_port))
			break;
		else
			say("Error creating new node by Verbum.");
	}

	say("New node created by Verbum.");
	exit(0);
}

static void prepare_settings (int argc, char *argv[])
{
	global.configuration.node.id = NULL;
	global.configuration.node_mapper.id = NULL;
	global.configuration.node_mapper.server_port = 0;

	check_params(argc, argv);
	set_default_options();
}

static void set_default_options (void)
{
	char node_mapper_id []= VERBUM_DEFAULT_NODE_MAPPER_ID;

	if (!global.configuration.node_mapper.server_port)
		global.configuration.node_mapper.server_port = VERBUM_DEFAULT_NODE_MAPPER_S_PORT;
	
	if (!global.configuration.node_mapper.id)
		mem_salloc_scopy(node_mapper_id, global.configuration.node_mapper.id);
}

static void check_params (int argc, char *argv[])
{
	char *option = NULL;
	char *value  = NULL;
	
	for (int a=1; a < argc; a++) {
		option = argv[a];

		if (strcmp(option, "--help") == 0 ||
			strcmp(option, "-h")     == 0  )
			usage();

		if ( (a+1) < argc ) {
			value = argv[a+1];

			if (strcmp(option, "--node-id") == 0) 
				mem_salloc_scopy(value, global.configuration.node.id);
			
			else if (strcmp(option, "--node-mapper-id") == 0) 
				mem_salloc_scopy(value, global.configuration.node_mapper.id);
			
			else if (strcmp(option, "--node-mapper-port") == 0) 
				global.configuration.node_mapper.server_port = atoi(value);
			
			a++;
		}
	}
}

static void usage (void)
{
	print("\nVerbum Programming Language - v" VERBUM_LANGUAGE_VERSION "\n");

	print("Options:");
	print("\t--node-id            - Custom Node ID.");
	print("\t--node-mapper-id     - Custom Node Mapper ID.");
	print("\t--node-mapper-port   - Custom Node Mapper server port.\n");

	print("Examples:");
	print("\tverbum");
	print("\tverbum --node-id IESUS --node-mapper-id IHS --node-mapper-port 3333\n");

	exit(0);
}



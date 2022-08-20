
#include "global.h"
#include "configuration.h"

void open_verbum_node_mapper     (void);
void open_verbum_fault_tolerance (void);

int initialization (int argc, char *argv[]) 
{
    say("Verbum Network - started!");

    global.instance.argc = argc;
    global.instance.argv = argv;
    global.instance.path = get_relative_path();

    configutation_check();
    configutation_read();

    //
    // Posteriormente: montar arquivo de configuração
    // padrão, caso o mesmo não seja especificado. Mas
    // por enquanto, utilizar obrigatoriamente arquivo
    // de configuração passado via linha de comando.
    //

    open_verbum_node_mapper();
    open_verbum_fault_tolerance();

    return 0;
}

void open_verbum_node_mapper (void)
{
    system_execution("verbum-node-mapper -c \"%s\" &", global.configuration.path);
}

void open_verbum_fault_tolerance (void)
{
    system_execution("verbum-fault-tolerance -c \"%s\" &", global.configuration.path);
}



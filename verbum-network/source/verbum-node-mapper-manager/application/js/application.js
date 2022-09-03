
/**
 * Startup actions.
 */

// Settings.
var reconnect_timeout = 333;

// Global.
var wk = null;
var auto_auth = true;
var nm_address = null, nm_port = null;

// Initialization.
$(document).ready(() => {
    console.log("Verbum Node Mapper Manager started - Jesus <3");
    
    // General.
    $('#nm-address').focus();

    // Prepare worker.
    if (typeof(Worker) !== "undefined") {
        wk = new Worker("./js/worker.js");
        wk.onmessage = process_worker;
    } else 
        alert('Sorry, no Web Worker support.');

    // Auto auth.
    if (auto_auth == true)
        nm_auth();
});

/**
 * Control of auth area.
 */

$(document).ready(() => {
    $('#nm-connect').on('click', ()=> {
        nm_auth();
    });

    $('#nm-address,#nm-port,#nm-connect').keypress(function (e) {
        if (e.which == 13) {
            nm_auth();
          return false;
        }
    });
});

function nm_auth ()
{
    // Validation.
    var address = $('#nm-address').val().toString().trim();
    var port    = $('#nm-port').val().toString().trim();

    if (address.length <= 0 || port.length <= 0) {
        show_status_connect_message('Invalid address or port number.', true);
        return false;
    }

    // Connect.
    show_status_connect_message('Connecting...', false);
    check_node_mapper_connection(address, port);
}

function show_status_connect_message (msg, tmo = false)
{
    $('#nm-connect-status').text(msg);

    if (tmo == true) {
        setTimeout(() => {
            $('#nm-connect-status').text('');
        }, 3333);
    }
}

function check_node_mapper_connection (address, port)
{
    send_request({
        cmd: 'check-connection',
        address: address,
        port: port
    });
}

function process_success_connect (request)
{
    nm_address = request.address;
    nm_port    = request.port;

    show_status_connect_message('', false);

    $('.area-auth').addClass('hide-el');
    $('.area-general-content').removeClass('hide-el');

    update_network_viewer();
}

/**
 * Control of content area.
 */

// Node list control.
var run_gnl = false;
var nodes = [];

$(document).ready(() => {

    setInterval(() => {
        if (run_gnl == false) {
            run_gnl = true;

            if (nm_address != null && nm_port != null) {
                send_request({
                    cmd: 'get-node-list',
                    address: nm_address,
                    port: nm_port
                });
            }
        }
    }, reconnect_timeout);

});

function process_node_list (nds = [])
{
    console.log(nds);

    // Nodes not found.
    if (nds.length == 0) {
        nodes = nds;
        render_all_nodes();
    }

    // Check nodes...
    else {
        var found = false;
        var action = 1;

        for (var a=0; a<nds.length; a++) {
            var item = nds[a];

            // Search node.
            found = false;

            for (var b=0; b<nodes.length; b++) {
                if (nodes[b].id == item.id) {
                    found = true;
                    break;
                }
            }

            if (nds.length > nodes.length)
                found = false;

            // Re-render.
            if (found == false) {
                action = 0;
                break;
            }
        }

        nodes = nds;

        if (action == 0)
            render_all_nodes();
        else
            render_information_nodes();
    }
    
    // Enable do re-check.
    run_gnl = false;
}

// Buttons.
$(document).ready(() => {
    $('#btn-open-dev-tools').on('click', ()=> {
        window.interface.toggle_dev_tools();
    });

    $('#btn-log-out').on('click', ()=> {
        window.interface.restart_application();
    });
})

/**
 * Process worker requests - response.
 */

function process_worker (ev)
{
    var request = ev.data;

    /**
     * Node Mapper connect.
     */

    if (request.cmd == 'check-connection') {
        if (request.status == false) 
            show_status_connect_message('Error connecting to the server.', true);
        else
            process_success_connect(request);
    }

    /**
     * Get node list.
     */
    else if (request.cmd == 'get-node-list') {
        process_node_list(request.nodes);
    }
}

function send_request (request)
{
    wk.postMessage(request);
}

/**
 * Networtk graph control.
 */

function update_network_viewer ()
{
    prepare_network_graph();
    show_network_graph();
}

var gData = [];

$(document).ready(() => {
    prepare_network_graph();
    show_network_graph();
})

function prepare_network_graph ()
{
    var limit = Math.floor(Math.random() * 11);

    if (limit < 3)
        limit = 3;
    
    for (var a=0; a<limit; a++) {
        gData.push({
            data: { 
                id: 'id-'+ a, 
                name: 'node '+ a, 
                value: '00000000'+ a
            }
        });
    }

    for (var a=0; a<limit; a++) {
        var target = (a+1);

        if (target == limit)
            target = 0;

            gData.push({
            data: {
                id: 'v-'+ a,
                source: 'id-'+ a,
                target: 'id-'+ target
            }
        });
    }
}

function show_network_graph ()
{
    var cy = cytoscape({
        container: document.getElementById('area-network-graph'),
        boxSelectionEnabled: false,
        autounselectify: true,
        layout: { name: 'cola' },
        elements: gData,
        
        style: [{
            selector: 'node',
            style: {
                'content': 'data(value)',
                'text-valign': 'center',
                'color': 'white',
                'font-size': '10px',
                'text-outline-width': 1,
                'text-outline-color': '#888',
            }
        }]
    });
}

/**
 * HTML generation functions.
 */

function render_all_nodes ()
{
    var html = `
        <table class="table table-dark table-borderless">
            <tbody>
    `;

    for (var a=0; a<nodes.length; a++) {
        var node = nodes[a];
        var prefix = 'cls-'+ node.id;

        html += `
            <tr>
                <th>
                    <table class="table table-dark table-borderless table-results-sec-1">
                        <tbody>
                            <tr>
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Node</div>
                                        <div class="sub-2">`+ node.node +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Identification</div>
                                        <div class="sub-2" style="text-transform: lowercase;" >`+ node.id +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Interface Port</div>
                                        <div class="sub-2 `+ prefix +`-port ">`+ node.port +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Last connection date</div>
                                        <div class="sub-2 `+ prefix +`-last-con-date ">`+ node.last_connection_date +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <button class='btn btn-warning btn-3 btn-fix-1' onclick='javascript:delete_node("`+ node.id +`");' >
                                            <i class="feather-size-a" data-feather="x"></i>
                                            Delete node
                                        </button> 

                                        <br>

                                        <button class='btn btn-primary btn-3 btn-fix-1' style="margin-top:3px" >
                                            <i class="feather-size-a" data-feather="plus"></i>
                                            Create connection
                                        </button>
                                    </div>
                                </th>

                            </tr>
                        </tbody>
                    </table>

                    <table class="table table-dark table-borderless table-results-sec-2">
                        <tbody>
                            <tr>
                                <th>
                                    `+ generate_connections_area_html(prefix) +`
                                </th>
                            </tr>
                        </tbody>
                    </table>

                    <hr>
                </th>
            </tr>
        `;
    }

    html += `
        </tbody>
        </table>
    `;

    $('#node-list-results').html(html);
    feather.replace();
}

function render_information_nodes ()
{
    for (var a=0; a<nodes.length; a++) {
        var node = nodes[a];
        var prefix = 'cls-'+ node.id;

        $('.'+ prefix +'-port').text(node.port);
        $('.'+ prefix +'-last-con-date').text(node.last_connection_date);
    }
}

function generate_connections_area_html (prefix)
{
    var html = `
        <table class="table table-dark table-borderless table-results-sec-3">
            <thead>
            </thead>
            <tbody>
                <tr>
                    <th colspan='6' class="th-header-top con-th-1" >INPUT</th>
                </tr>

                <tr>
                    <th scope="col" class="th-header" >Source ID</th>
                    <th scope="col" class="th-header" >NM host</th>
                    <th scope="col" class="th-header" >NM port</th>
                    <th scope="col" class="th-header" >NM direct</th>
                    <th scope="col" class="th-header" >Ping</th>
                    <th scope="col" class="th-header" style="text-align:right;" >Manager</th>
                </tr>

                <tr>
                    <th>verbum-node-2409308923</th>
                    <th>127.0.0.1</th>
                    <th>3333</th>
                    <th>YES</th>
                    <th>
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
                <tr>
                    <th>verbum-node-2409308923</th>
                    <th>127.0.0.1</th>
                    <th>3333</th>
                    <th>NO</th>
                    <th>
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
                
                <tr>
                    <th colspan='6' class="th-header-top con-th-1" >OUTPUT</th>
                </tr>

                <tr>
                    <th scope="col" class="th-header" >Destination ID</th>
                    <th scope="col" class="th-header" >NM host</th>
                    <th scope="col" class="th-header" >NM port</th>
                    <th scope="col" class="th-header" ></th>
                    <th scope="col" class="th-header" >Ping</th>
                    <th scope="col" class="th-header" style="text-align:right;" >Manager</th>
                </tr>

                <tr>
                    <th>verbum-node-2409308923</th>
                    <th>127.0.0.1</th>
                    <th>3333</th>
                    <th></th>
                    <th>
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
                <tr>
                    <th>verbum-node-2409308923</th>
                    <th>127.0.0.1</th>
                    <th>3333</th>
                    <th></th>
                    <th>
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
            </tbody>
        </table>
    `;

    return html;
}


/*
var interface            = window.interface;
var started              = false;
var node_mapper_hostname = '127.0.0.1';
var node_mapper_hostport = 3333;
var debug                = false;
var status_use           = false;
var updating_counter     = 1;
var connection_running   = false;

$(document).ready(() => {
    console.log("Verbum Node Mapper Manager started - Jesus <3");

    get_node_list(node_mapper_hostname, node_mapper_hostport);
});

function get_node_list (hostname, hostport) 
{
    if (connection_running == false) {
        connection_running = true;

        if (status_use == false)
            $('.area-status').text('Updating node list... ['+ updating_counter +']');
        updating_counter++;
        
        interface.get_node_list(hostname, hostport, (response) => {
            var error = false;
            var nnf   = false;

            if (response.indexOf('nodes not found') != -1) {
                console.log('nodes not found.');
                error = true;
                nnf   = true;
            } else if (response == 'error') {
                error = true;
            }
            
            if (error == false) {
                if (started == false) {
                    started = true;
                    $('.area-initialization').addClass('hide-el');
                    $('.area-results').removeClass('hide-el');
                }

                render_all_nodes();
                process_node_list(response);
            }

            if (nnf == true) {
                if (started == false) {
                    started = true;
                    $('.area-initialization').addClass('hide-el');
                    $('.area-results').removeClass('hide-el');
                }

                nodes = [];
                render_all_nodes();
            }

            setTimeout(()=>{
                connection_running = false;
                get_node_list(hostname, hostport);    
            }, 500)
        });
    }
}

function process_node_list (response) 
{
    var parts = response.split('\n\n');
    var node_items = [];

    if (debug)
        console.log(response);

    for (var a=1; a<parts.length; a++) {
        var item  = parts[a].toString().trim();

        if (item.length <= 0)
            continue;

        var lines = item.split("\n");
        var node  = -1;
        var id    = '';
        var port  = -1;
        var date  = '';

        for (var b=0; b<lines.length; b++) {
            var iitem = lines[b].toString().trim();
            if (iitem.length <= 0)
                continue;

            var iparts = iitem.split(': ');
            var name   = iparts[0].toString().trim();
            var value  = iparts[1].toString().trim();
            
            if (name.length > 0 && value.length > 0) {
                if (name == 'node')
                    node = value;
                else if (name == 'id')
                    id = value;
                else if (name == 'port')
                    port = value;
                else if (name == 'last connection date')
                    date = value;
            }
        }

        if (node != -1    && port != -1      &&
            id.length > 0 && date.length > 0  )
        {
            node_items.push({
                node: node,
                id: id,
                port: port,
                last_connection_date: date
            });
        }
    }

    update_node_list_information(node_items);
}

var nodes = [];

function update_node_list_information (node_items) 
{
    var found = false;
    var action = 1;

    for (var a=0; a<node_items.length; a++) {
        var item = node_items[a];

        // Search node.
        found = false;

        for (var b=0; b<nodes.length; b++) {
            if (nodes[b].id == item.id) {
                found = true;
                break;
            }
        }

        if (node_items.length > nodes.length)
            found = false;

        // Re-render.
        if (found == false) {
            action = 0;
            break;
        }
    }

    nodes = node_items;

    if (action == 0)
        render_all_nodes();
    else
        render_information_nodes();
}

function render_information_nodes ()
{
    if (debug)
        console.log("update all node informations - render_information_nodes()");

    for (var a=0; a<nodes.length; a++) {
        var node = nodes[a];
        var prefix = 'cls-'+ node.id;

        $('.'+ prefix +'-port').text(node.port);
        $('.'+ prefix +'-last-con-date').text(node.last_connection_date);
    }
}

function render_all_nodes ()
{
    if (debug)
        console.log("update all nodes - render_all_nodes()");

    var html = generate_general_options_html() + `
        <table class="table table-dark table-borderless">
            <tbody>
    `;

    for (var a=0; a<nodes.length; a++) {
        var node = nodes[a];
        var prefix = 'cls-'+ node.id;

        html += `
            <tr>
                <th>
                    <table class="table table-dark table-borderless table-results-sec-1">
                        <tbody>
                            <tr>
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Node</div>
                                        <div class="sub-2">`+ node.node +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Identification</div>
                                        <div class="sub-2" style="text-transform: lowercase;" >`+ node.id +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Interface Port</div>
                                        <div class="sub-2 `+ prefix +`-port ">`+ node.port +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Last connection date</div>
                                        <div class="sub-2 `+ prefix +`-last-con-date ">`+ node.last_connection_date +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <button class='btn btn-warning btn-3' onclick='javascript:delete_node("`+ node.id +`");' >
                                            <i class="feather-size-a" data-feather="x"></i>
                                            Delete node
                                        </button> 

                                        <br>

                                        <button class='btn btn-primary btn-3' style="margin-top:3px" >
                                            <i class="feather-size-a" data-feather="plus"></i>
                                            Create connection
                                        </button>
                                    </div>
                                </th>

                            </tr>
                        </tbody>
                    </table>

                    <table class="table table-dark table-borderless table-results-sec-2">
                        <tbody>
                            <tr>
                                <th>
                                    `+ generate_connections_area_html(prefix) +`
                                </th>
                            </tr>
                        </tbody>
                    </table>

                    <hr>
                </th>
            </tr>
        `;
    }

    html += `
        </tbody>
        </table>
    `;

    $('.area-results').html(html);
    feather.replace();
}

function generate_general_options_html ()
{
    var html = '';

    html += `
        <button class='btn btn-primary' onclick='javascript:create_node();' >
            <i class="feather-size-a" data-feather="plus"></i>
            Create node
        </button>

        <button class='btn btn-primary' >
            <i class="feather-size-a" data-feather="check-circle"></i>
            Check node
        </button>

        <button class='btn btn-primary' >
            <i class="feather-size-a" data-feather="share-2"></i>
            Send data
        </button>

        <span class='area-status' >
            
        </span>

        <button class='btn btn-light btn-4' onclick='javascript:toggle_dev_tools();' >
            <i class="feather-size-a" data-feather="tool"></i>
        </button>

        <button class='btn btn-light btn-4' onclick='javascript:restart_application();' >
            <i class="feather-size-a" data-feather="refresh-cw"></i>
        </button>

        <br>
        <br>
    `;

    return html;
}

function generate_connections_area_html (prefix)
{
    var html = '';

    html += `
        <div class="connections-title" >
            Connections
        </div>

        <table class="table table-dark table-borderless table-results-sec-3">
            <thead>
                <tr>
                    <th scope="col" class="th-header con-th-1" style="width:50%" >INPUT</th>
                    <th scope="col" style="width:30px" ></th>
                    <th scope="col" class="th-header con-th-2" style="width:50%" >OUTPUT</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th class="con-th-fix-1" >
                        <table class="table table-dark table-borderless table-results-sec-4">
                            <thead>
                                <tr>
                                    <th scope="col" class="th-header" >Source ID</th>
                                    <th scope="col" class="th-header" >NM host</th>
                                    <th scope="col" class="th-header" >NM port</th>
                                    <th scope="col" class="th-header" >NM direct</th>
                                    <th scope="col" class="th-header" >Ping</th>
                                    <th scope="col" class="th-header" >Manager</th>
                                </tr>
                            </thead>    
                            <tbody>
                                <tr>
                                    <th>verbum-node-2409308923</th>
                                    <th>127.0.0.1</th>
                                    <th>3333</th>
                                    <th>YES</th>
                                    <th>
                                        <div class="item-sub-1">
                                            31-07-2022<br>18-21-19
                                        </div>
                                    </th>
                                    <th style="text-align:right;" >
                                        <button class='btn btn-2 btn-danger' >
                                            <i class="feather-size-a" data-feather="x"></i>
                                        </button>
                                    </th>
                                </tr>
                                <tr>
                                    <th>verbum-node-2409308923</th>
                                    <th>127.0.0.1</th>
                                    <th>3333</th>
                                    <th>NO</th>
                                    <th>
                                        <div class="item-sub-1">
                                            31-07-2022<br>18-21-19
                                        </div>
                                    </th>
                                    <th style="text-align:right;" >
                                        <button class='btn btn-2 btn-danger' >
                                            <i class="feather-size-a" data-feather="x"></i>
                                        </button>
                                    </th>
                                </tr>
                            </tbody>
                        </table>
                    </th>

                    <th>
                        &nbsp;
                    </th>
                    
                    <th class="con-th-fix-1" >
                        <table class="table table-dark table-borderless table-results-sec-4">
                            <thead>
                                <tr>
                                    <th scope="col" class="th-header" >Destination ID</th>
                                    <th scope="col" class="th-header" >NM host</th>
                                    <th scope="col" class="th-header" >NM port</th>
                                    <th scope="col" class="th-header" >Ping</th>
                                    <th scope="col" class="th-header" >Manager</th>
                                </tr>
                            </thead>    
                            <tbody>
                                <tr>
                                    <th>verbum-node-2409308923</th>
                                    <th>127.0.0.1</th>
                                    <th>3333</th>
                                    <th>
                                        <div class="item-sub-1">
                                            31-07-2022<br>18-21-19
                                        </div>
                                    </th>
                                    <th style="text-align:right;" >
                                        <button class='btn btn-2 btn-danger' >
                                            <i class="feather-size-a" data-feather="x"></i>
                                        </button>
                                    </th>
                                </tr>
                                <tr>
                                    <th>verbum-node-2409308923</th>
                                    <th>127.0.0.1</th>
                                    <th>3333</th>
                                    <th>
                                        <div class="item-sub-1">
                                            31-07-2022<br>18-21-19
                                        </div>
                                    </th>
                                    <th style="text-align:right;" >
                                        <button class='btn btn-2 btn-danger' >
                                            <i class="feather-size-a" data-feather="x"></i>
                                        </button>
                                    </th>
                                </tr>
                            </tbody>
                        </table>
                    </th>
                </tr>
                
            </tbody>
        </table>
    `;

    return html;
}

function restart_application ()
{
    window.interface.restart_application();
}

function toggle_dev_tools ()
{
    window.interface.toggle_dev_tools();
}

function create_node ()
{
    status_use = true;
    $('.area-status').text('Creating node...');

    window.interface.create_node(
        node_mapper_hostname, node_mapper_hostport, (response) => {
        console.log(response);

        if (response.indexOf('verbum-node-ok') != -1) {
            $('.area-status').text('Node creation order sent successfully.');

            setTimeout(() => {
                $('.area-status').text('Updating node list.');

                setTimeout(() => {
                    $('.area-status').text('');
                    status_use = false;
                }, 1000 * 3);
            }, 1000 * 2);
        }
    });

    // Request time limit.
    setTimeout(() => {
        $('.area-status').text('');
        status_use = false;
    }, 1000 * 10);
}

function delete_node (node_id)
{
    status_use = true;
    $('.area-status').text('Deleting node...');

    window.interface.delete_node(
        node_mapper_hostname, node_mapper_hostport, node_id, (response) => {
        console.log(response);

        if (response.indexOf('verbum-node-ok') != -1) {
            $('.area-status').text('Node deletion order sent successfully.');

            setTimeout(() => {
                $('.area-status').text('Updating node list.');

                setTimeout(() => {
                    $('.area-status').text('');
                    status_use = false;
                }, 1000 * 3);
            }, 1000 * 2);
        }
    });

    // Request time limit.
    setTimeout(() => {
        $('.area-status').text('');
        status_use = false;
    }, 1000 * 10);
}
*/



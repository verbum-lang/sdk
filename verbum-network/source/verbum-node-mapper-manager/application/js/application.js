
/**
 * Startup actions.
 */

// Settings.
var reconnect_timeout = 333;
var auto_auth = true;

// Global.
var wk = null;
var nm_address = null, nm_port = null;
var status_use = false;

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
}

/**
 * Control of content area.
 */

// Node list control.
var run_gnl        = false;
var nodes          = [];
var lastNodeLength = 0;

$(document).ready(() => {

    setInterval(() => {
        if (run_gnl == false) {
            run_gnl = true;

            if (nm_address != null && nm_port != null) {
                send_request({
                    cmd: 'get-verbum-node-list',
                    address: nm_address,
                    port: nm_port
                });
            } else
                run_gnl = false;
        }
    }, reconnect_timeout);

});

// Buttons.
$(document).ready(() => {
    $('#btn-open-dev-tools').on('click', ()=> {
        window.interface.toggle_dev_tools();
    });

    $('#btn-log-out').on('click', ()=> {
        window.interface.restart_application();
    });
});

function create_node ()
{
    status_use = true;
    set_status('Creating node...', false);
    $('.btn-create-node').prop('disabled', true);

    send_request({
        cmd: 'create-verbum-node',
        address: nm_address,
        port: nm_port
    });
}

function delete_node (node_id)
{
    status_use = true;
    set_status('Deleting node...', false);
    $('.btn-delete-node').prop('disabled', true);

    send_request({
        cmd: 'delete-verbum-node',
        address: nm_address,
        port: nm_port,
        node_id: node_id
    });
}

/**
 * Add connection control.
 */

var dbg_ac     = false;
var ac_node_id = null;

$(document).ready(() => {
    $('.btn-close-modal').on('click', () => {
        ac_close_modal();
    });

    $('#btn-add-con').on('click', ()=> {
        ac_add_new_connection();
    });

    // Default connection type.
    $('#ac-con-type').val('output');
    ac_change_con_type();
});

function ac_close_modal ()
{
    ac_node_id = null;
    $('#modal-add-connection').modal('hide');
}

function add_connection (node_id)
{
    ac_node_id = node_id;
    ac_update_node_list();

    $('#ac-src-node').val(node_id);
    $('#modal-add-connection').modal('show');

    // Select first node.
    for (var a=0; a<nodes.length; a++) {
        if (nodes[a].id != node_id) {
            $('#ac-dst-node').val(nodes[a].id);
            break;
        }
    }

    if (dbg_ac == true) {
        // Select first node.
        for (var a=0; a<nodes.length; a++) {
            if (nodes[a].id != node_id) {
                $('#ac-dst-node').val(nodes[a].id);
                break;
            }
        }

        // Auto-send data.
        ac_add_new_connection();
    }
}

function ac_update_node_list ()
{
    var html = `
        <div class='row' >

            <div class='col-md-12 ac-col-item ac-col-header' >
                <div class='row' >

                    <div  class='col-md-5' >Node ID</div>
                    <div  class='col-md-3' >
                        C. PORT | S. PORT
                    </div>
                    <div  class='col-md-4' >Last connection</div>
            
                </div>
            </div>
    `;

    for (var a=0,b=''; a<nodes.length; a++) {
        if (nodes[a].id != ac_node_id) {
            html += `
                <div class='col-md-12 ac-col-item `+ b +`' onclick='javascript:ac_change_dst_node("`+ nodes[a].id +`");' >
                    <div class='row' >

                        <div  class='col-md-5' >`+ nodes[a].id +`</div>
                        <div  class='col-md-3' >
                            `+ nodes[a].core_port +` |
                            `+ nodes[a].server_port +`
                        </div>
                        <div  class='col-md-4' >`+ nodes[a].last_connection_date +`</div>
                
                    </div>
                </div>
            `;

            if (b == '')
                b = 'ac-col-item-bg';
            else
                b = '';
        }
    }

    html += `
        </div>
    `;

    $('.ac-node-list').html(html);
}

function ac_change_dst_node (node_id) 
{
    $('#ac-dst-node').val(node_id);
}

function ac_change_con_type () 
{
    var value = $('#ac-con-type').val();

    if (value == 'input') {
        $('#ac-nm-id').prop('disabled', false)
        $('#ac-nm-address').prop('disabled', true)
        $('#ac-nm-port').prop('disabled', true)
        $('#ac-nm-address').val('')
        $('#ac-nm-port').val('')
    } else {
        $('#ac-nm-id').prop('disabled', true)
        $('#ac-nm-address').prop('disabled', false)
        $('#ac-nm-port').prop('disabled', false)
        $('#ac-nm-id').val('')
    }
}

function ac_add_new_connection ()
{
    var src_node_id             = 'false';
    var dst_node_id             = 'false';
    var dst_node_mapper_id      = 'false';
    var dst_node_mapper_address = 'false';
    var dst_node_mapper_port    = 'false';

    // Validations.
    var type = $('#ac-con-type').val();

    if ($('#ac-src-node').val().length <= 0) {
        alert('Invalid source Verbum Node ID.');
        $('#ac-src-node').focus();
        return false;
    } else if ($('#ac-dst-node').val().length <= 0) {
        alert('Invalid target Verbum Node ID.');
        $('#ac-dst-node').focus();
        return false;
    }

    src_node_id = $('#ac-src-node').val();
    dst_node_id = $('#ac-dst-node').val();

    if (type == 'input') {
        if ($('#ac-nm-id').val().length <= 0) {
            alert('Invalid Verbum Node Mapper ID.');
            $('#ac-nm-id').focus();
            return false;
        }

        dst_node_mapper_id = $('#ac-nm-id').val();
    } else {
        if ($('#ac-nm-address').val().length <= 0) {
            alert('Invalid Verbum Node Mapper address.');
            $('#ac-nm-address').focus();
            return false;
        } else if ($('#ac-nm-port').val().length <= 0) {
            alert('Invalid Verbum Node Mapper port.');
            $('#ac-nm-port').focus();
            return false;
        }

        dst_node_mapper_address = $('#ac-nm-address').val();
        dst_node_mapper_port    = $('#ac-nm-port').val();
    }

    var information = {
        type: type,
        src_node_id: src_node_id,
        dst_node_id: dst_node_id,
        dst_node_mapper_id: dst_node_mapper_id,
        dst_node_mapper_address: dst_node_mapper_address,
        dst_node_mapper_port: dst_node_mapper_port
    };

    $('#btn-add-con').prop('disabled', true);

    $('.ac-con-response-area').html(`
        <div class='inner' >
            Creating new connection...
        </div>
    `);

    send_request({
        cmd: 'create-verbum-node-connection',
        address: nm_address,
        port: nm_port,
        information: information
    });
}

/**
 * Status area control.
 */

function set_status (msg, tmo = false) 
{
    $('.area-status').text(msg);

    if (tmo == true) {
        setTimeout(()=>{
            $('.area-status').text('');
            status_use = false; // Enable node update - status.
        }, 3333);
    }
}

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
        if (request.status == false) {
            show_status_connect_message('Error connecting to the server.', true);

            // Auto auth.
            if (auto_auth == true) {
                setTimeout(()=> {
                    nm_auth();
                }, 4000)
            }
        } else
            process_success_connect(request);
    }

    /**
     * Get node list.
     */
    else if (request.cmd == 'get-verbum-node-list') {
        if (request.error_disconnect == true) 
            window.interface.restart_application();
        else 
            process_informations(request);
    }

    /**
     * Create node.
     */
     else if (request.cmd == 'create-verbum-node') {
        if (request.status == false) 
            set_status('Error creating node.', true);
        else 
            set_status('Node created successfully.', true);
        
        $('.btn-create-node').prop('disabled', false);
    }

    /**
     * Delete node.
     */
    else if (request.cmd == 'delete-verbum-node') {
        if (request.status == false) 
            set_status('Error deleting node.', true);
        else {
            set_status('Node deleted successfully.', true);
            process_delete_node(request);
        }

        $('.btn-delete-node').prop('disabled', false);
    }

    /**
     * Add connection.
     */
    else if (request.cmd == 'create-verbum-node-connection') {
        if (request.status == false) {
            $('.ac-con-response-area').html(`
                <div class='inner' >
                    Error creating connection.
                </div>
            `);
        } else {
            $('.ac-con-response-area').html(`
                <div class='inner' >
                    Connection created successfully!
                </div>
            `);
        }

        setTimeout(()=>{
            $('.ac-con-response-area').text('');
            $('#btn-add-con').prop('disabled', false);
        }, 1000);
    }
}

function send_request (request)
{
    wk.postMessage(request);
}

/**
 * Networtk graph control.
 */

var gdata = [];
var viewer_running = false;

function process_network_viewer (request)
{
    if (viewer_running == false) {
        viewer_running = true;

        // Prepare nodes and connections.
        var pnodes = nodes;
        var pconnections = [];
        var cons = request.connections;

        for (var a=0; a<cons.length; a++) {
            if (cons[a].type == 'output')
                for (var b=0; b<pnodes.length; b++)
                    if (cons[a].dst_node_id == pnodes[b].id)
                        pconnections.push(cons[a]);
        }

        // Process network viewer.
        var connections = pconnections;
        var update = false;
        var nsize  = 0;
        var csize1 = 0;
        var csize2 = 0;

        // Nodes.
        for (var a=0; a<pnodes.length; a++) {
            var node  = pnodes[a];
            var found = false;

            for (var b=0; b<gdata.length; b++) {
                if (gdata[b].data.type == 0) {
                    if (gdata[b].data.id == node.id) {
                        found = true;
                        break;
                    }
                }
            }

            if (found == false) {
                update = true;
                break;
            }
        }

        // Check nodes length.
        for (var b=0; b<gdata.length; b++) {
            if (gdata[b].data.type == 0)
                nsize++;
        }

        if (nsize != pnodes.length)
            update = true;

        // Connections.
        for (var a=0; a<connections.length; a++) {
            var connection = connections[a];
            var found      = false;
            
            if (connection.type == 'output') {
                for (var b=0; b<gdata.length; b++) {
                    if (gdata[b].data.type == 1) {
                        if (gdata[b].data.source == connection.src_node_id &&
                            gdata[b].data.target == connection.dst_node_id  )
                        {
                            found = true;
                            break;
                        }
                    }
                }

                if (found == false) {
                    update = true;
                    break;
                }
            }
        }

        // Check connections length.
        for (var a=0; a<connections.length; a++) {
            if (connections[a].type == 'output') 
                csize1++;
        }

        for (var b=0; b<gdata.length; b++) {
            if (gdata[b].data.type == 1) 
                csize2++;
        }

        if (csize1 != csize2)
            update = true;

        // Update network.
        if (update == true) {
            gdata = [];

            // Nodes.
            for (var a=0; a<pnodes.length; a++) {
                var node  = pnodes[a];
                var parts = node.id.toString().split('verbum-node-');
                var label = 'no name';

                if (parts[1]) 
                    label = parts[1].toString().trim();
                
                gdata.push({
                    data: { 
                        type: 0,
                        id: node.id,
                        label: label,
                        disconnected: false
                    }
                });
            }

            // Connections.
            for (var a=0; a<connections.length; a++) {
                var connection = connections[a];
                var parts      = connection.id.toString().split('verbum-connection-');
                var label      = 'no name';

                if (parts[1]) 
                    label = parts[1].toString().trim();
            
                if (connection.type == 'output') {
                    gdata.push({
                        data: {
                            type: 1,
                            id: 'vc-'+ a,
                            cid: connection.id,
                            source: connection.src_node_id,
                            target: connection.dst_node_id
                        }
                    });
                }
            }
            
            show_network_graph();
        }
        
        else 
            viewer_running = false;
    }
}

function show_network_graph ()
{
    var cy = cytoscape({
        container: document.getElementById('area-network-graph'),
        boxSelectionEnabled: false,
        autounselectify: true,
        layout: { name: 'cola' },
        elements: gdata,
        
        style: [{
            selector: 'node',
            style: {
                'content': 'data(label)',
                'text-valign': 'center',
                'color': 'white',
                'font-size': '10px',
                'text-outline-width': 1,
                'text-outline-color': '#888',
            }
        }]
    });

    viewer_running = false;        
}

/**
 * Process request informations (nodes and connections).
 */

function process_informations (request)
{
    nodes = request.nodes;
    var connections = request.connections;

    for (var a=0; a<nodes.length; a++) {
        var node = nodes[a];

        if (node.status != 1)
            continue;

        // Node.
        if ($('.node-area-'+ node.id).length == 0)
            append_node(node);
        else
            update_node(node);

        // Input connections.
        for (var b=0; b<connections.length; b++) {
            if (node.id == connections[b].src_node_id && connections[b].type == 'input') {
                var connection = connections[b];

                var prefix = 'node-connection-'+ node.id +'-'+
                             'connection-'+ connection.id;

                if ($('.'+ prefix +'-input').length == 0)
                    append_input_connection(node, connection, prefix);
                else
                    update_input_connection(connection, prefix);
            }
        }

        // Output connections.
        for (var b=0; b<connections.length; b++) {
            if (node.id == connections[b].src_node_id && connections[b].type == 'output') {
                var connection = connections[b];

                var prefix = 'node-connection-'+ node.id +'-'+
                             'connection-'+ connection.id;

                if ($('.'+ prefix +'-output').length == 0)
                    append_output_connection(node, connection, prefix);
                else
                    update_output_connection(connection, prefix);
            }
        }
    }

    // Enable get information data.
    run_gnl = false;

    // Set status.
    if (status_use == false) {
        var upd = false;

        if (nodes.length != lastNodeLength)
            upd = true;
        
        var tx = $('.area-status').text().toString().trim();
        if (tx.length <= 0) 
            upd = true;

        if (upd == true) {
            lastNodeLength = nodes.length; 
            set_status('Total nodes: '+ nodes.length, false);
        }
    }

    process_network_viewer(request);
}

function process_delete_node (request)
{
    for (var a=0; a<nodes.length; a++) {
        if (nodes[a].id == request.node_id) {
            nodes[a].status = 0;
            break;
        }
    }

    $('.node-area-'+ request.node_id).remove();
}

function append_node (node)
{
    var prefix = 'cls-'+ node.id;

    var html = `
        <table class="table table-dark table-borderless node-area-`+ node.id +`">
            <tbody>
            <tr>
                <th>
                    <table class="table table-dark table-borderless table-results-sec-1">
                        <tbody>
                            <tr>
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Identification</div>
                                        <div class="sub-2" style="text-transform: lowercase;" >`+ node.id +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">C. Port</div>
                                        <div class="sub-2 `+ prefix +`-core-port ">`+ node.core_port +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">S. Port</div>
                                        <div class="sub-2 `+ prefix +`-server-port ">`+ node.server_port +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Last connection</div>
                                        <div class="sub-2 `+ prefix +`-last-con-date ">`+ node.last_connection_date +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div style="text-align:right;" >

                                        <button class='btn btn-primary btn-3 btn-fix-1' style="margin-top:3px" onclick='javascript:add_connection("`+ node.id +`");' >
                                            <i class="feather-size-a" data-feather="plus"></i>
                                            Add connection
                                        </button>

                                        <button class='btn-delete-node btn btn-danger btn-3 btn-fix-1' onclick='javascript:delete_node("`+ node.id +`");' >
                                            <i class="feather-size-a" data-feather="x"></i>
                                            Delete node
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
                                    <div class='cls-`+ node.id +`-connections-area' >

                                        <table class="table table-dark table-borderless table-results-sec-3">
                                        <thead>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th colspan='7' class="th-header-top con-th-1" >INPUT</th>
                                            </tr>
                                            <tr>
                                                <th scope="col" class="th-header thh-s-0" >ID</th>
                                                <th scope="col" class="th-header thh-s-1" >Target node</th>
                                                <th scope="col" class="th-header thh-s-2" >NM ID</th>
                                                <th scope="col" class="th-header thh-s-3" >NM address</th>
                                                <th scope="col" class="th-header thh-s-4" >NM direct</th>
                                                <th scope="col" class="th-header thh-s-5" >Last connection</th>
                                                <th scope="col" class="th-header thh-s-6" style="text-align:right;" ></th>
                                            </tr>
                                        </tbody>
                                        </table>

                                        <div class='cls-`+ node.id +`-input-connections-area' ></div>

                                        <table class="table table-dark table-borderless table-results-sec-3">
                                        <thead>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th colspan='7' class="th-header-top con-th-1" >OUTPUT</th>
                                            </tr>
                                            <tr>
                                                <th scope="col" class="th-header thh-s-0" >ID</th>
                                                <th scope="col" class="th-header thh-s-1" >Target node</th>
                                                <th scope="col" class="th-header thh-s-2" >NM ID</th>
                                                <th scope="col" class="th-header thh-s-3" >NM address</th>
                                                <th scope="col" class="th-header thh-s-4" >S. port</th>
                                                <th scope="col" class="th-header thh-s-5" >Last connection</th>
                                                <th scope="col" class="th-header thh-s-6" style="text-align:right;" ></th>
                                            </tr>
                                            <tr>
                                                <th colspan="6" class="th-separator" ></th>
                                            </tr>
                                        </tbody>
                                        </table>

                                        <div class='cls-`+ node.id +`-output-connections-area' ></div>

                                    </div>
                                </th>
                            </tr>
                        </tbody>
                    </table>

                </th>
            </tr>
            </tbody>
        </table>
    `;

    $('#node-list-results').append(html);
    feather.replace();
}

function update_node (node)
{
    var prefix = 'cls-'+ node.id;

    $('.'+ prefix +'-core-port').text(node.core_port);
    $('.'+ prefix +'-server-port').text(node.server_port);
    $('.'+ prefix +'-last-con-date').text(node.last_connection_date);
}

function append_output_connection (node, connection, prefix)
{
    var html = `
        <div class='`+ prefix +`-output' >
            <table class="table table-dark table-borderless table-results-sec-3" >
            <thead>
            </thead>
            <tbody>
                <tr class='`+ prefix +`-output-tr' >
                    <th class='nd-th-item thh-s-0' >
                        <div class='`+ prefix +`-output-id' >
                            `+ prepare_connection_id(connection.id) +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-1' >
                        <div class='`+ prefix +`-output-dst-node-id' >
                            `+ prepare_node_id(connection.dst_node_id) +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-2' >
                        <div class='`+ prefix +`-output-dst-nm-id' >
                        `+ connection.dst_nm_id +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-3' >
                        <div class='`+ prefix +`-output-dst-nm-addr-port' >
                        `+ connection.dst_nm_addr +`:`+ connection.dst_nm_port +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-4' >
                        <div class='`+ prefix +`-output-dst-node-sv-port' >
                            `+ prepare_ns_port(connection.dst_node_sv_port) +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-5' >
                        <div class="item-sub-1">
                            <div class='`+ prefix +`-output-last-date' >
                                `+ connection.last_connection_date +`
                            </div>
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-6' style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
            </tbody>
            </table>
        </div>
    `;

    $('.cls-'+ node.id +'-output-connections-area').append(html);
    feather.replace();
}

function update_output_connection (connection, prefix)
{
    $('.'+ prefix +'-output-id').text(prepare_connection_id(connection.id));
    $('.'+ prefix +'-output-dst-node-id').text(prepare_node_id(connection.dst_node_id));
    $('.'+ prefix +'-output-dst-nm-id').text(connection.dst_nm_id);
    $('.'+ prefix +'-output-dst-nm-addr-port').text(connection.dst_nm_addr +':'+ connection.dst_nm_port);
    $('.'+ prefix +'-output-dst-node-sv-port').text(prepare_ns_port(connection.dst_node_sv_port));
    $('.'+ prefix +'-output-last-date').text(connection.last_connection_date);

    $('.'+ prefix +'-output').removeClass('error-connection-item');
    if (connection.error == true) 
        $('.'+ prefix +'-output').addClass('error-connection-item');
}

function append_input_connection (node, connection, prefix)
{
    var nm_direct = connection.dst_nm_direct == true ? 'YES' : 'NO';
    
    var html = `
        <div class='`+ prefix +`-input' >
            <table class="table table-dark table-borderless table-results-sec-3">
            <thead>
            </thead>
            <tbody>
                <tr class='`+ prefix +`-input-tr' >
                    <th class='nd-th-item thh-s-0' >
                        <div class='`+ prefix +`-input-id' >
                            `+ prepare_connection_id(connection.id) +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-1' >
                        <div class='`+ prefix +`-input-dst-node-id' >
                            `+ prepare_node_id(connection.dst_node_id) +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-2' >
                        <div class='`+ prefix +`-input-dst-nm-id' >
                        `+ connection.dst_nm_id +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-3' >
                        <div class='`+ prefix +`-input-dst-nm-addr-port' >
                        `+ connection.dst_nm_addr +`:`+ connection.dst_nm_port +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-4' >
                        <div class='`+ prefix +`-input-dst-nm-direct' >
                            `+ nm_direct +`
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-5' >
                        <div class="item-sub-1">
                            <div class='`+ prefix +`-input-last-date' >
                                `+ connection.last_connection_date +`
                            </div>
                        </div>
                    </th>
                    <th class='nd-th-item thh-s-6' style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
            </tbody>
            </table>
        </div>
    `;

    $('.cls-'+ node.id +'-input-connections-area').append(html);
    feather.replace();
}

function update_input_connection (connection, prefix)
{
    $('.'+ prefix +'-input-id').text(prepare_connection_id(connection.id));
    $('.'+ prefix +'-input-dst-node-id').text(prepare_node_id(connection.dst_node_id));
    $('.'+ prefix +'-input-dst-nm-id').text(connection.dst_nm_id);
    $('.'+ prefix +'-input-dst-nm-addr-port').text(connection.dst_nm_addr +':'+ connection.dst_nm_port);
    $('.'+ prefix +'-input-dst-nm-direct').text( connection.dst_nm_direct == true ? 'YES' : 'NO' );
    $('.'+ prefix +'-input-last-date').text(connection.last_connection_date);

    $('.'+ prefix +'-input').removeClass('error-connection-item');
    if (connection.error == true) 
        $('.'+ prefix +'-input').addClass('error-connection-item');
}

function prepare_connection_id (id)
{
    var parts = id.split('verbum-connection-');
    return parts[1];
}

function prepare_node_id (id)
{
    var parts = id.split('verbum-node-');
    return parts[1];
}

function prepare_ns_port (ns_port)
{
    if (ns_port == -1)
        return 'not specified';

    return ns_port;
}




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

    update_network_viewer();
}

/**
 * Control of content area.
 */

// Node list control.
var run_gnl = false;
var nodes = [];
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

function process_node_list (nds = [])
{
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

            if (nds.length != nodes.length)
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

var dbg_ac = true;
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
                        C. PORT - S. PORT
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
                            `+ nodes[a].core_port +`
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
            process_node_list(request.nodes);
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
        else 
            set_status('Node deleted successfully.', true);

        $('.btn-delete-node').prop('disabled', false);
    }
}

function send_request (request)
{
    wk.postMessage(request);
}

/**
 * Networtk graph control.
 */

var gData = [];

function update_network_viewer ()
{
    // prepare_network_graph();
    // show_network_graph();
}

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
                                        <div class="sub-2">`+ (a+1) +`</div>
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
                                        <div class="sub-1">Core Port</div>
                                        <div class="sub-2 `+ prefix +`-core-port ">`+ node.core_port +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Server Port</div>
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

        $('.'+ prefix +'-core-port').text(node.core_port);
        $('.'+ prefix +'-server-port').text(node.server_port);
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
                    <th colspan="6" class="th-separator" ></th>
                </tr>

                <tr>
                    <th class='nd-th-item' >verbum-node-2409308923</th>
                    <th class='nd-th-item' >127.0.0.1</th>
                    <th class='nd-th-item' >3333</th>
                    <th class='nd-th-item' >YES</th>
                    <th class='nd-th-item' >
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th class='nd-th-item' style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
                <tr>
                    <th class='nd-th-item' >verbum-node-2409308923</th>
                    <th class='nd-th-item' >127.0.0.1</th>
                    <th class='nd-th-item' >3333</th>
                    <th class='nd-th-item' >NO</th>
                    <th class='nd-th-item' >
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th class='nd-th-item' style="text-align:right;" >
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
                    <th scope="col" class="th-header" >Node server port</th>
                    <th scope="col" class="th-header" >Ping</th>
                    <th scope="col" class="th-header" style="text-align:right;" >Manager</th>
                </tr>

                <tr>
                    <th colspan="6" class="th-separator" ></th>
                </tr>

                <tr>
                    <th class='nd-th-item' >verbum-node-2409308923</th>
                    <th class='nd-th-item' >127.0.0.1</th>
                    <th class='nd-th-item' >3333</th>
                    <th class='nd-th-item' >3334</th>
                    <th class='nd-th-item' >
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th class='nd-th-item' style="text-align:right;" >
                        <button class='btn btn-2 btn-danger' >
                            <i class="feather-size-b" data-feather="x"></i>
                        </button>
                    </th>
                </tr>
                <tr>
                    <th class='nd-th-item' >verbum-node-2409308923</th>
                    <th class='nd-th-item' >127.0.0.1</th>
                    <th class='nd-th-item' >3333</th>
                    <th class='nd-th-item' ></th>
                    <th class='nd-th-item' >
                        <div class="item-sub-1">
                            31-07-2022 18-21-19
                        </div>
                    </th>
                    <th class='nd-th-item' style="text-align:right;" >
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



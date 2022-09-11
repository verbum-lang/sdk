
const net = require('net');

/**
 * Worker controller.
 */

onmessage = function(ev) {
    var request = ev.data;

    /**
     * Check Node Mapper connection.
     */
    if (request.cmd == 'check-connection') {
        connect_node_mapper(request.address, request.port, '', (response) => {
            request.status = false;

            if (response.indexOf('Verbum Node Mapper') != -1) {
                request.status = true;
                postMessage(request);
            } else
                postMessage(request);
        });
    }

    /**
     * Get node list.
     */
    else if (request.cmd == 'get-verbum-node-list') {
        connect_node_mapper(request.address, request.port, 'get-verbum-node-list:', (response) => {
            request.nodes = [];
            request.connections = [];
            request.error_disconnect = false;

            if (response == ''                              ||
                response.toString().trim().length <= 0      ||
                response.indexOf('nodes not found') != -1    )  
                postMessage(request);
            
            else if (response == 'timeout' || response.indexOf('internal-error: ') != -1) {
                request.error_disconnect = true;
                postMessage(request);
            } 
            
            else {
                var resp  = response.split('\r\n\r\n');
                if (resp[1]) {
                    var cparts = resp[1].split('+++\n');
                    
                    for (var n=0; n<cparts.length; n++) {
                        var part_item = cparts[n].toString().trim();
                        if (part_item.length <= 0)
                            continue;

                        var parts = part_item.split("\n\n");
                        
                        for (var a=0,b=0; a<parts.length; a++,b++) {
                            var item = parts[a].toString().trim();

                            if (item.length <= 0)
                                continue;

                            // Node informations.
                            if (b == 0) {
                                var lines       = item.split("\n");
                                var node        = -1;
                                var id          = '';
                                var core_port   = -1;
                                var server_port = -1;
                                var date        = '';

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
                                        else if (name == 'core port')
                                            core_port = value;
                                        else if (name == 'server port')
                                            server_port = value;
                                        else if (name == 'last connection date')
                                            date = value;
                                    }
                                }

                                if (node != -1    && core_port != -1 && server_port != -1 &&
                                    id.length > 0 && date.length > 0                       )
                                {
                                    request.nodes.push({
                                        status: 1, // 1: active, 0: disabled.
                                        node: node,
                                        id: id,
                                        core_port: core_port,
                                        server_port: server_port,
                                        last_connection_date: date
                                    });
                                }
                            } 
                            
                            // Connections information.
                            else {
                                var lines = item.split("\n"); 
                                var connection_id = -1;
                                var connection_type = -1;
                                var src_node_id = null;
                                var dst_node_id = null;
                                var dst_nm_id = null;
                                var dst_nm_addr = null;
                                var dst_nm_port = -1;
                                var last_con_date = null;
                                var con_error = -1;
                                var con_error_count = -1;
                                var dst_node_sv_port = -1;
                                var dst_nm_direct = 0;

                                for (var b=0; b<lines.length; b++) {
                                    var iitem = lines[b].toString().trim();
                                    if (iitem.length <= 0)
                                        continue;

                                    var iparts = iitem.split(': ');
                                    if (!iparts[0] || !iparts[1])
                                        continue;

                                    var name   = iparts[0].toString().trim();
                                    var value  = iparts[1].toString().trim();
                                    
                                    if (name.length > 0 && value.length > 0) {
                                        if (name == 'id')
                                            connection_id = value;
                                        else if (name == 'type')
                                            connection_type = value;
                                        else if (name == 'src-node-id')
                                            src_node_id = value;
                                        else if (name == 'dst-node-id')
                                            dst_node_id = value;
                                        else if (name == 'dst-nm-id')
                                            dst_nm_id = value;
                                        else if (name == 'dst-nm-addr')
                                            dst_nm_addr = value;
                                        else if (name == 'dst-nm-port')
                                            dst_nm_port = value;
                                        else if (name == 'last connection date')
                                            last_con_date = value;
                                        else if (name == 'error')
                                            con_error = value;
                                        else if (name == 'error count')
                                            con_error_count = value;
                                        else if (name == 'dst-node-sv-port')
                                            dst_node_sv_port = value;
                                        else if (name == 'dst-nm-direct')
                                            dst_nm_direct = value;
                                    }
                                }

                                if (connection_id != -1 && connection_type != -1 &&
                                    src_node_id != null && dst_node_id != null   &&
                                    dst_nm_id != null   && dst_nm_addr != null   &&
                                    dst_nm_port != -1   && last_con_date != null &&
                                    con_error != -1     && con_error_count != -1  )
                                {
                                    request.connections.push({
                                        id: connection_id,
                                        type: (connection_type == '0' ? 'output' : 'input'),
                                        src_node_id: src_node_id,
                                        dst_node_id: dst_node_id,
                                        dst_nm_id: dst_nm_id,
                                        dst_nm_addr: dst_nm_addr,
                                        dst_nm_port: parseInt(dst_nm_port),
                                        last_connection_date: last_con_date,
                                        error: (con_error == '0' ? false : true),
                                        error_count: parseInt(con_error_count),
                                        dst_node_sv_port: parseInt(dst_node_sv_port),
                                        dst_nm_direct: parseInt(dst_nm_direct) == 1 ? true : false
                                    });
                                }
                            }
                        }
                    }

                    postMessage(request);
                } else
                    postMessage(request);
            }
        });
    }

    /**
     * Create node.
     */
    else if (request.cmd == 'create-verbum-node') {
        connect_node_mapper(request.address, request.port, 'create-verbum-node:', (response) => {
            request.status = false;

            if (response.indexOf('verbum-node-ok') != -1) {
                request.status = true;
                postMessage(request);
            } else
                postMessage(request);
        });
    }

    /**
     * Delete node.
     */
    else if (request.cmd == 'delete-verbum-node') {
        connect_node_mapper(request.address, request.port, 'delete-verbum-node:'+ request.node_id, (response) => {
            request.status = false;

            if (response.indexOf('verbum-node-ok') != -1) {
                request.status = true;
                postMessage(request);
            } else
                postMessage(request);
        });
    }

    /**
     * Create node connection.
     */
    else if (request.cmd == 'create-verbum-node-connection') {
        var information = request.information;
        var request_raw = 'create-verbum-node-output-connection:';

        // Output connection.
        if (information.type == 'output') {
            request_raw += information.src_node_id              +':';
            request_raw += information.dst_node_id              +':';
            request_raw += information.dst_node_mapper_id       +':';
            request_raw += information.dst_node_mapper_address  +':';
            request_raw += information.dst_node_mapper_port         ;
        }

        // Send data to Node Mapper.
        connect_node_mapper(request.address, request.port, request_raw, (response) => {
            request.status = false;

            if (response.indexOf('verbum-node-ok') != -1) {
                request.status = true;
                postMessage(request);
            } else
                postMessage(request);
        });
    }
};

/**
 * Connect to Verbum Node Mapper.
 * 
 * hostname - address (IP).
 * hostport - port.
 * message  - message to send.
 * callback - response callback.
 */

var idbg = false;

function connect_node_mapper (hostname, hostport, message, callback)
{
    var sock = null;
    var data = "";
    var flag = false;
    
    if (idbg == true)
        console.log('connect started!');

    sock = net.connect({host: hostname, port: hostport}, () => {
        sock.write(message + "\r\n\r\n");

        if (idbg == true)
            console.log('message: '+ message);
    });

    sock.setTimeout(1000 * 15, ()=> {
        if (idbg == true)
            console.log('timeout');

        callback('timeout');
    })

    sock.on('data', (response) => {
        if (idbg == true)
            console.log('append data: '+ response.toString());

        data += response.toString();
    });

    sock.on('end', () => {
        flag = false;

        if (data) {
            if (data.length) {
                if (data.length > 0) {
                    flag = true;
                
                    if (idbg == true)
                        console.log('end success, data: '+ data);

                    callback(data);
                }
            }
        }

        if (flag == false) {
            if (idbg == true)
                console.log('end empty.');

            callback('');
        }
    });

    sock.on('error', (error) => {
        if (idbg == true)
            console.log('error: '+ error.toString());

        callback('internal-error: '+ error.toString());
    });
}



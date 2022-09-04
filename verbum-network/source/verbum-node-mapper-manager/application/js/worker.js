
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
    else if (request.cmd == 'get-node-list') {
        connect_node_mapper(request.address, request.port, 'get-node-list', (response) => {
            request.nodes = [];
            request.error_disconnect = false;

            if (response == ''                              ||
                response.toString().trim().length <= 0      ||
                response.indexOf('nodes not found') != -1    )  
                postMessage(request);
            
            else if (response == 'timeout' || response.indexOf('error: ') != -1) {
                request.error_disconnect = true;
                postMessage(request);
            } 
            
            else {
                var parts = response.split('\n\n');

                for (var a=1; a<parts.length; a++) {
                    var item = parts[a].toString().trim();

                    if (item.length <= 0)
                        continue;

                    var lines  = item.split("\n");
                    var node   = -1;
                    var id     = '';
                    var port   = -1;
                    var date   = '';

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
                        request.nodes.push({
                            node: node,
                            id: id,
                            port: port,
                            last_connection_date: date
                        });
                    }
                }

                postMessage(request);
            }
        });
    }

    /**
     * Create node.
     */
    else if (request.cmd == 'create-node') {
        connect_node_mapper(request.address, request.port, 'create-node', (response) => {
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
    else if (request.cmd == 'delete-node') {
        connect_node_mapper(request.address, request.port, 'delete-node:'+ request.node_id, (response) => {
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

    sock.setTimeout(1000 * 3, ()=> {
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

        callback('error: '+ error.toString());
    });
}



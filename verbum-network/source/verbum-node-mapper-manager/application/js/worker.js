
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
            
            if (response == 'error') 
                postMessage(request);
            else if (response.indexOf('Verbum Node Mapper') != -1) {
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

            if (response == 'error' || response.indexOf('nodes not found') != -1) 
                postMessage(request);
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
};

/**
 * Connect to Verbum Node Mapper.
 * 
 * hostname - address (IP).
 * hostport - port.
 * message  - message to send.
 * callback - response callback.
 */

function connect_node_mapper (hostname, hostport, message, callback)
{
    var sock = null;
    var data = "";
    var flag = false;
    
    sock = net.connect({host: hostname, port: hostport}, () => {
        sock.write(message + "\r\n\r\n");
    });
    
    sock.on('data', (response) => {
        data += response.toString();
    });

    sock.on('end', () => {
        flag = false;

        if (data) {
            if (data.length) {
                if (data.length > 0) {
                    flag = true;
                    callback(data);
                }
            }
        }

        if (flag == false)
            callback('');
    });

    sock.on('error', (error) => {
        callback('error');
    });
}



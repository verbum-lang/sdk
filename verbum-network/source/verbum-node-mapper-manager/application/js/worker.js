
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




const { contextBridge } = require("electron");
const net = require('net');

contextBridge.exposeInMainWorld(
    "interface", {
        get_node_list: (hostname, hostport, callback) => {
            var sock = null;
            var data = '';
            
            sock = net.connect({host: hostname, port: hostport}, () => {
                sock.write('get-node-list');
            });
            
            sock.on('data', (response) => {
                data += response.toString();
            });

            sock.on('end', () => {
                callback(data);
            });
        }
    }
);



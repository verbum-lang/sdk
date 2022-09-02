
const { contextBridge, ipcRenderer } = require("electron");
const net = require('net');

var check_node_mapper = false;

contextBridge.exposeInMainWorld(
    "interface", {
        get_node_list: (hostname, hostport, callback) => {
            connect_node_mapper(hostname, hostport, 'get-node-list', callback);
        },

        toggle_dev_tools: () => {
            ipcRenderer.send('open-dev-tools', null);
        },

        restart_application: ()=> {
            ipcRenderer.send('restart-application', null);
        },

        create_node: (hostname, hostport, callback) => {
            connect_node_mapper(hostname, hostport, 'create-node', callback);
        },

        delete_node: (hostname, hostport, node_id, callback) => {
            connect_node_mapper(hostname, hostport, 'delete-node:'+ node_id, callback);
        }
    }
);

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



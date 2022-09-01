
const { contextBridge, ipcRenderer } = require("electron");
const net = require('net');

var check_node_mapper = false;

contextBridge.exposeInMainWorld(
    "interface", {
        get_node_list: (hostname, hostport, callback) => {
            get_node_list_internal(hostname, hostport, callback);
        },

        toggle_dev_tools: () => {
            ipcRenderer.send('open-dev-tools', null);
        },

        restart_application: ()=> {
            ipcRenderer.send('restart-application', null);
        }
    }
);

function get_node_list_internal (hostname, hostport, callback)
{
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

    sock.on('error', (error) => {
        callback('error');
    });
}




const { contextBridge, ipcRenderer } = require("electron");
const net = require('net');

contextBridge.exposeInMainWorld(
    "interface", {
        toggle_dev_tools: () => {
            ipcRenderer.send('open-dev-tools', null);
        },

        restart_application: ()=> {
            ipcRenderer.send('restart-application', null);
        }
    }
);



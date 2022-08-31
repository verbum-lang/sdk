
const { contextBridge } = require("electron");

contextBridge.exposeInMainWorld(
    "api", {
        example_fn: (callback) => {
            
        }
    }
);



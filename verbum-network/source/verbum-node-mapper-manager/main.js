
/*
** Deus é Santo!
*/

const {app, BrowserWindow, ipcMain} = require('electron') 
const path = require('path') 
const url = require('url')

var globalUserAgent = 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36';
let win = null
app.allowRendererProcessReuse = true;

app.once('ready', () => {
  win = new BrowserWindow({
    width: 1000,
    height: 600,
    show: false,
    webPreferences: {
      sandbox: false,
      nodeIntegration: true,
      nodeIntegrationInWorker: true,
      webSecurity: false,
      devTools: true, // false if you want to remove dev tools access for the user
      contextIsolation: true,
      enableRemoteModule: true, // required for print function [removed since Electron 12, uses https://github.com/electron/remote]
      webviewTag: true, // https://www.electronjs.org/docs/api/webview-tag,
      preload: path.join(__dirname, "preload.js"), // required for print function
    }
  })
  
  win.setMenuBarVisibility(false)
  win.center()
  win.webContents.setUserAgent(globalUserAgent);
  // win.webContents.openDevTools();

  win.loadURL(url.format({
    pathname: path.join(__dirname, 'application/index.html'),
    protocol: 'file:',
    slashes: true
  }), {
    userAgent: globalUserAgent
  })
  
  // Show window when page is ready
  win.once('ready-to-show', () => {
    win.show()
  })
})

ipcMain.on('open-dev-tools', (ev, param) => {
  win.webContents.openDevTools();
})

ipcMain.on('restart-application', (ev, param) => {
  win.reload();
})



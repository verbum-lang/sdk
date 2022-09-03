
onmessage = function(ev) {
    var data = ev.data;

    var response = {
        name: 'test',
        value: 'data xyz'
    };

    console.log('worker:', data)

    postMessage(response);
}  



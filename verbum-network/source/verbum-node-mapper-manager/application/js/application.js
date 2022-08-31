
var interface = window.interface;
var started   = false;

$(document).ready(() => {
    console.log("Verbum Node Mapper Manager started - Jesus <3");

    get_node_list('127.0.0.1', 3333);
});

function get_node_list (hostname, hostport) {
    interface.get_node_list(hostname, hostport, (response) => {
        process_node_list(response);

        if (started == false) {
            started = true;
            $('.area-initialization').addClass('hide-el');
            $('.area-results').removeClass('hide-el');
        }

        get_node_list(hostname, hostport);
    });
}

function process_node_list (response) {
    var parts = response.split('\n\n');
    
    console.log(parts);
}




var interface = window.interface;
var started   = false;

$(document).ready(() => {
    console.log("Verbum Node Mapper Manager started - Jesus <3");

    // interface.get_node_list('127.0.0.1', 3333, (response) => {
    //     console.log(response);

    //     if (started == false) {
    //         started = true;
    //         $('.area-initialization').addClass('hide-el');
    //         $('.area-results').removeClass('hide-el');
    //     }
    // });

    get_node_list();
});

function get_node_list () {
    interface.get_node_list('127.0.0.1', 3333, (response) => {
        console.log(response);

        if (started == false) {
            started = true;
            $('.area-initialization').addClass('hide-el');
            $('.area-results').removeClass('hide-el');
        }

        get_node_list();
    });
}



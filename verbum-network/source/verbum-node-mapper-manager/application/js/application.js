
var interface = window.interface;
var started   = false;

$(document).ready(() => {
    console.log("Verbum Node Mapper Manager started - Jesus <3");

    get_node_list('127.0.0.1', 3333);
});

function get_node_list (hostname, hostport) 
{
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

function process_node_list (response) 
{
    var parts = response.split('\n\n');
    var node_items = [];

    for (var a=1; a<parts.length; a++) {
        var item  = parts[a].toString().trim();

        if (item.length <= 0)
            continue;

        var lines = item.split("\n");
        var node  = -1;
        var id    = '';
        var port  = -1;
        var date  = '';

        for (var b=0; b<lines.length; b++) {
            var iitem = lines[b].toString().trim();
            if (iitem.length <= 0)
                continue;

            var iparts = iitem.split(': ');
            var name   = iparts[0].toString().trim();
            var value  = iparts[1].toString().trim();
            
            if (name.length > 0 && value.length > 0) {
                if (name == 'node')
                    node = value;
                else if (name == 'id')
                    id = value;
                else if (name == 'port')
                    port = value;
                else if (name == 'last connection date')
                    date = value;
            }
        }

        if (node != -1    && port != -1      &&
            id.length > 0 && date.length > 0  )
        {
            node_items.push({
                node: node,
                id: id,
                port: port,
                last_connection_date: date
            });
        }
    }

    update_node_list_information(node_items);
}

var nodes = [];

function update_node_list_information (node_items) 
{
    var found = false;

    for (var a=0; a<node_items.length; a++) {
        var item = node_items[a];

        // Search node.
        found = false;

        for (var b=0; b<nodes.length; b++) {
            if (nodes[b].id == item.id) {
                found = true;
                break;
            }
        }

        if (found == false) {
            nodes = node_items;
            render_all_nodes();
            break;
        }
    }    
}

function render_all_nodes ()
{
    var html = `
        <table class="table table-dark table-borderless">
            <tbody>
    `;

    for (var a=0; a<nodes.length; a++) {
        var node = nodes[a];

        html += `
            <tr>
                <th>
                    <table class="table table-dark table-borderless table-results-sec-1">
                        <tbody>
                            <tr>
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Node</div>
                                        <div class="sub-2">`+ node.node +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Identification</div>
                                        <div class="sub-2">`+ node.id +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Port</div>
                                        <div class="sub-2">`+ node.port +`</div>
                                    </div>
                                </th>
                                
                                <th>
                                    <div class="item">
                                        <div class="sub-1">Last connection date</div>
                                        <div class="sub-2">`+ node.last_connection_date +`</div>
                                    </div>
                                </th>
                                
                            </tr>
                        </tbody>
                    </table>

                    <table class="table table-dark table-borderless table-results-sec-2">
                        <tbody>
                            <tr>
                                <th>
                                    Jesus s2
                                </th>
                            </tr>
                        </tbody>
                    </table>

                    <hr>
                </th>
            </tr>
        `;
    }

    html += `
        </tbody>
        </table>
    `;

    $('.area-results').html(html);
}




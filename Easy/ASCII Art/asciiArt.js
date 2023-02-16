var l = parseInt(readline());
var h = parseInt(readline());
var t = readline().toUpperCase();
for (var i = 0; i < h; i++) {
    var row = readline();
    var line = '';
    for (var j = 0; j < t.length; ++j) {
        var p = t.charCodeAt(j) - 65;
        if (p < 0 || p >= 26) {
            p = 26;
        }
        line += row.substring(l * p, l * (p + 1));
    }
    print(line);
}

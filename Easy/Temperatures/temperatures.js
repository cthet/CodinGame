const n = parseInt(readline()); // the number of temperatures to analyse
var inputs = readline().split(' ');
let closest = 6000;

if (n == 0) {
  closest = 0;
}

for (let i = 0; i < n; i++) {
    const t = parseInt(inputs[i]);// a temperature expressed as an integer ranging from -273 to 5526
    if (Math.abs(t) < Math.abs(closest)) {
        closest = t;
    } else if (t + closest == 0) {
        closest = Math.abs(t);
    }
}

console.log(closest);

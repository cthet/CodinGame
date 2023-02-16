let n = parseInt(readline());

const sort = (a, b) => a - b;
let horses = [];

for (let i = 0; i < n; i++) {
   horses.push(parseInt(readline()));
}

horses.sort(sort);

var smallestDiff = horses[1] - horses[0];

for(var i = 2 ; i < n; i++ ) {
    var newDiff =  horses[i] - horses[i - 1];
    if(newDiff < smallestDiff) {
        smallestDiff  = newDiff;
    }
}

print (smallestDiff);

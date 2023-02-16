let max = 0;
let target = 0;

// game loop
while (true) {
    for (let i = 0; i < 8; i++) {
        const mountainH = parseInt(readline()); 
        // represents the height of one mountain.
        if(mountainH >= max){
            target = i;
            max= mountainH;
        }
    }
    max = 0;

    console.log(target);     // The index of the mountain to fire on.

}

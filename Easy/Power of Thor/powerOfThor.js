let inputs = readline().split(' ');
let lightX = parseInt(inputs[0]); // the X position of the light of power
let lightY = parseInt(inputs[1]); // the Y position of the light of power
var initialTx = parseInt(inputs[2]); // Thor's starting X position
var initialTy = parseInt(inputs[3]); // Thor's starting Y position

// game loop
while (true) {
    const remainingTurns = parseInt(readline()); // The remaining amount of turns Thor can move. Do not remove this line.

    let directionX = "";
    let directionY = "";

    if(lightY < initialTy){
        directionY ="N";
        initialTy--;
    }else if(lightY > initialTy){
        directionY ="S";
        initialTy++;
    }

    if(lightX < initialTx){
        directionX = "W";
        initialTx--;
    }else if(lightX > initialTx){
        directionX = "E";
        initialTx++;
    }

    // A single line providing the move to be made: N NE E SE S SW W or NW
    console.log(directionY+directionX);
}

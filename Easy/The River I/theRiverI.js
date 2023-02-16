let r1 = parseInt(readline());
let r2 = parseInt(readline());

while(r1!==r2){

    if(r1<r2){
       r1 = r1.toString().split('').map(Number).reduce( (acc, current) => acc+current, 0) +r1;
    } else {
        r2 = r2.toString().split('').map(Number).reduce( (acc, current) => acc+current, 0) +r2;
    }
}

console.log(r1);

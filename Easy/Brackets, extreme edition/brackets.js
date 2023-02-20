const expression = readline();

l = [];
d = {"{":"}", "[":"]", "(":")"};
left = ["{","(","["];
right = ["}",")","]"];

res = true;

expression.split('').map(c => {
  if(left.indexOf(c)>=0){
    l.push(c);
  }
  if(right.indexOf(c)>=0){
    res = res && l.length!=0 && c === d[l.pop()];
  }
}); 


console.log(res && l.length===0);
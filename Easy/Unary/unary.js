const MESSAGE = readline();

let res = MESSAGE.split('')
.map(c => '00000000'.concat(c.charCodeAt(0).toString(2)).slice(-7))
.join('')
.match(/(.)\1*/g)
.map(c => (c[0] === '1' ? '0 ' : '00 ') + '0'.repeat(c.length))
.join(' ')

console.log(res);

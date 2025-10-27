var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

// Pegue a primeira linha (lines[0]) e quebre ela nos espaços
let valores = lines[0].split(' ');

const A = parseInt(valores[0]);
const B = parseInt(valores[1]);
const C = parseInt(valores[2]);
const D = parseInt(valores[3]);



if (B > C && D > A && (C + D) > (A + B) &&  C > 0 && D > 0 &&  A % 2 === 0){
    console.log(`Valores aceitos`);
}else{
    console.log(`Valores nao aceitos`);
}
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valores = lines[0].split(' '); // le os input em array

let A = parseFloat(valores[0]); // coloca os valores do array em variaveis
let B = parseFloat(valores[1]);
let C = parseFloat(valores[2]);

const delta = B * B - (4 * A * C);

if ( A === 0 || delta < 0){
    console.log(`Impossivel calcular`);
}else{
    const r1 = ( - B + Math.sqrt(delta))/ (2 * A); // math.sqrt calcula o raiz quadrada, os outros valores é a fórmula
    const r2 = ( - B - Math.sqrt(delta))/ (2 * A);
    console.log(`R1 = ${r1.toFixed(5)}`);
    console.log(`R2 = ${r2.toFixed(5)}`);
}
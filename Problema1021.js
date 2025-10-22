// Linhas de código padrão para ler a entrada no Beecrowd
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

// Ler o valor de entrada
const valor = parseFloat(lines.shift());

// Para evitar problemas de precisão, convertemos tudo para centavos.
let valorEmCentavos = Math.round(valor * 100);

// Definimos os valores de notas e moedas todos em centavos
let notas = [10000, 5000, 2000, 1000, 500, 200];
let moedas = [100, 50, 25, 10, 5, 1];

console.log(`NOTAS:`);

// CORREÇÃO: Declarando 'i' com 'let'
for (let i = 0; i < notas.length; i++) {
    const calculo1 = Math.floor(valorEmCentavos / notas[i]);

    // CORREÇÃO: Adicionado espaço depois de ${calculo1}
    console.log(`${calculo1} nota(s) de R$ ${(notas[i] / 100).toFixed(2)}`);
    
    valorEmCentavos %= notas[i];
}

console.log(`MOEDAS:`);

// CORREÇÃO: Declarando 'i' com 'let'
for (let i = 0; i < moedas.length; i++) {
    // CORREÇÃO PRINCIPAL: Usando a variável correta 'valorEmCentavos'
    const calculo2 = Math.floor(valorEmCentavos / moedas[i]);

    // CORREÇÃO: Adicionado espaço depois de ${calculo2}
    console.log(`${calculo2} moeda(s) de R$ ${(moedas[i] / 100).toFixed(2)}`);
    
    valorEmCentavos %= moedas[i];
}
const fs = require("fs");

// Lendo a entrada do arquivo padrão (stdin)
const input = fs.readFileSync(0, "utf8").split("\n");

// Convertendo os valores para inteiros
const A = parseInt(input[0]);
const B = parseInt(input[1]);

// Calculando a soma
const X = A + B;

// Exibindo a saída no formato correto
console.log(`X = ${X}`);
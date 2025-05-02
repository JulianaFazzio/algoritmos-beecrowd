import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de entrada do usuário

public class Problema1010 { // Define a classe principal do programa
    public static void main(String[] args) { // Método principal onde a execução do programa começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler dados da entrada padrão (teclado)

        // --- Leitura dos dados da Primeira Peça ---
        // Lê o código da primeira peça (um número inteiro)
        int codPeca1 = scanner.nextInt();
        // Lê o número de peças da primeira peça (um número inteiro)
        int numeroDePecas1 = scanner.nextInt();
        // Lê o valor unitário da primeira peça (um número decimal)
        double valorUnitarioPeca1 = scanner.nextDouble();

        // --- Leitura dos dados da Segunda Peça ---
        // Lê o código da segunda peça (um número inteiro)
        int codPeca2 = scanner.nextInt();
        // Lê o número de peças da segunda peça (um número inteiro)
        int numeroDePecas2 = scanner.nextInt();
        // Lê o valor unitário da segunda peça (um número decimal)
        double valorUnitarioPeca2 = scanner.nextDouble();

        // --- Cálculo do Valor Total ---
        // Calcula o total somando o valor de cada tipo de peça (quantidade * valor unitário)
        double total = (valorUnitarioPeca1 * numeroDePecas1) + (valorUnitarioPeca2 * numeroDePecas2);

        // --- Saída de Dados ---
        // Imprime o valor total a pagar, formatado para duas casas decimais
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        // Fecha o objeto Scanner para liberar recursos do sistema
        scanner.close();
    }
}
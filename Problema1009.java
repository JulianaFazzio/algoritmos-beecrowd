import java.util.Scanner; 

public class Problema1009 { // Define a classe principal
    public static void main(String[] args) { // Método principal onde a execução começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler do console (entrada padrão)

        // Lê o nome do vendedor (uma linha de texto)
        String nomeVendedor = scanner.nextLine();

        // Lê o salário fixo do vendedor (um número decimal)
        Double salarioFixo = scanner.nextDouble();

        // Lê o total de vendas realizadas pelo vendedor (um número decimal)
        Double vendas = scanner.nextDouble();

        // Calcula a comissão (15% sobre o total de vendas)
        Double comissao = vendas * 0.15;

        // Calcula o salário total (salário fixo + comissão)
        Double total = comissao + salarioFixo;

        // Imprime o total formatado com 2 casas decimais
        System.out.printf("TOTAL = R$ %.2f\n", total);

        // Fecha o scanner para liberar recursos (boa prática)
        scanner.close();
    }
}

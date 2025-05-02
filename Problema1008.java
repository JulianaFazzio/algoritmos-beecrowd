import java.io.IOException;
import java.util.Scanner; // Importa classes necessárias

public class Problema1008 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler a entrada do usuário.
        int numeroFunc = scanner.nextInt(); // Lê o número do funcionário (inteiro).
        int horasTrab = scanner.nextInt(); // Lê o número de horas trabalhadas (inteiro).
        double salario = scanner.nextDouble(); // Lê o valor do salário por hora (decimal).
        double calculo = salario * horasTrab; // Calcula o salário total multiplicando o salário por hora pelas horas trabalhadas.
        System.out.printf("NUMBER = %d\n", numeroFunc); // Imprime o número do funcionário.
        System.out.printf("SALARY = U$ %.2f\n", calculo); // Imprime o salário total formatado com duas casas decimais.
        scanner.close(); // Fecha o Scanner para liberar recursos.
    }

}
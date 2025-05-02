// Importa classes necessárias
import java.util.Scanner;      

// Declara a classe principal do programa
public class Problema1002 {
 
    // Método principal - ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê um número do tipo double, representando o raio de um círculo
        double raio = scanner.nextDouble();

        // Define a constante PI com 5 casas decimais
        final double n = 3.14159;

        // Calcula a área do círculo usando a fórmula A = π * r²
        double area = n * (raio * raio);

        // Imprime o resultado formatado com 4 casas decimais
        System.out.printf("A=%.4f\n", area);

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}

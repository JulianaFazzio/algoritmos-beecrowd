
// Importa a classe Scanner, usada para ler dados do teclado
import java.util.Scanner;

// Classe principal do programa
public class Problema1016 {

    // Método principal onde a execução do programa começa
    public static void main(String[] args)  {

        // Cria um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Lê um número inteiro representando a distância (em km)
        int distancia = scanner.nextInt();

        // Verifica se a distância é negativa (valor inválido)
        if (distancia < 0) {
            // Imprime mensagem de erro se a distância for negativa
            System.out.println("Distância inválida");
        } else {
            // Se a distância for válida, calcula o tempo necessário
            // A cada 1 km de diferença entre os dois carros, são necessários 2 minutos para o carro mais rápido alcançar o mais lento
            int calculo = distancia * 2;

            // Imprime o resultado no formato solicitado, em minutos
            System.out.printf("%d minutos\n", calculo);
        }
    }
}

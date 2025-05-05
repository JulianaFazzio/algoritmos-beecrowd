import java.util.Scanner;

public class Problema1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o leitor de entrada

        // Lê as coordenadas dos dois pontos
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Aplica a fórmula da distância: raiz de [(x2-x1)² + (y2-y1)²]
        double calculo1 = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        double calculoFinal = Math.sqrt(calculo1); // Calcula a raiz quadrada

        // Exibe o resultado com 4 casas decimais
        System.out.printf("%.4f\n", calculoFinal);
    }
}
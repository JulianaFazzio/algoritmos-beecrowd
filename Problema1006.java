import java.util.Scanner; // Importa classes necessárias

public class Problema1006 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Lê entrada do usuário.
    double A = scanner.nextDouble(); // Primeiro valor.
    double B = scanner.nextDouble(); // Segundo valor.
    double C = scanner.nextDouble(); // Terceiro valor.
    double media = ((A * 2) + (B * 3) + (C * 5)) / 10; // Calcula a média ponderada.
    System.out.printf("MEDIA = %.1f\n", media); // Imprime a média formatada.
    scanner.close(); // Fecha o scanner.
  }
}
import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de entrada do usuário

public class Problema1012 { // Define a classe principal do programa
    public static void main(String args[]) { // Método principal onde a execução do programa começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler dados da entrada padrão (teclado)

        // Lê os três valores de ponto flutuante (decimais) fornecidos como entrada
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // --- Cálculos das Áreas ---
        // Calcula a área do triângulo retângulo usando A como base e C como altura (Área = (base * altura) / 2)
        double areaTriangulo = (A * C) / 2;

        // Calcula a área do círculo usando C como raio (Área = PI * raio^2). PI aproximado como 3.14159
        double areaCirculo = (C * C) * 3.14159;

        // Calcula a área do trapézio usando A e B como bases e C como altura (Área = ((base1 + base2) * altura) / 2)
        double areaTrapezio = ((A + B) * C) / 2;

        // Calcula a área do quadrado usando B como lado (Área = lado * lado)
        double areaQuadrado = B * B;

        // Calcula a área do retângulo usando A como um lado e B como outro (Área = lado1 * lado2)
        double areaRetangulo = A * B;

        // --- Impressão dos Resultados ---
        // Imprime a área do triângulo formatada para 3 casas decimais
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        // Imprime a área do círculo formatada para 3 casas decimais
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        // Imprime a área do trapézio formatada para 3 casas decimais
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        // Imprime a área do quadrado formatada para 3 casas decimais
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        // Imprime a área do retângulo formatada para 3 casas decimais
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        // Fecha o objeto Scanner para liberar recursos do sistema
        scanner.close();
    }
}
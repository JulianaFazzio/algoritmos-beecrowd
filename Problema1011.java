import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de entrada do usuário

public class Problema1011 { // Define a classe principal do programa
    public static void main(String args[]) { // Método principal onde a execução do programa começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler dados da entrada padrão (teclado)

        // Lê o valor do raio da esfera (um número decimal)
        double raio = scanner.nextDouble();

        // Calcula o cubo do raio (raio * raio * raio). Nota: O nome da variável poderia ser 'raioCubico'.
        double raiocalculado = raio * raio * raio;

        // Define o valor de PI (aproximado)
        double PI = 3.14159; // Usando uma constante para PI

        // Calcula o volume da esfera usando a fórmula (4/3.0) * PI * raio³.
        // O '3.0' garante que a divisão seja de ponto flutuante.
        double volume = (4 / 3.0) * PI * raiocalculado;

        // Imprime o valor do volume formatado para 3 casas decimais
        System.out.printf("VOLUME = %.3f\n", volume);

        // Fechar o objeto Scanner para liberar recursos do sistema
        scanner.close();
    }
}

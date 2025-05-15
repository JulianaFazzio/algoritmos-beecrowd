import java.util.Scanner;
public class Problema1018 {
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int valor = scanner.nextInt();
    int original = valor;
    
    int cedulas100 = valor/100;
    valor = valor % 100;
    
    int cedulas50 = valor/50;
    valor = valor % 50;
    
    int cedulas20 = valor/20;
    valor = valor % 20;
    
    int cedulas10 = valor/10;
    valor = valor % 10;
    
    int cedulas5 = valor/5;
    valor = valor % 5;
    
    int cedulas2 = valor/2;
    valor = valor % 2;
    
    int cedulas1 = valor/1;
    valor = valor % 1;
    
    System.out.printf("%d\n", original);
    System.out.printf("%d nota(s) de R$ 100,00\n", cedulas100);
    System.out.printf("%d nota(s) de R$ 50,00\n", cedulas50);
    System.out.printf("%d nota(s) de R$ 20,00\n", cedulas20);
    System.out.printf("%d nota(s) de R$ 10,00\n", cedulas10);
    System.out.printf("%d nota(s) de R$ 5,00\n", cedulas5);
    System.out.printf("%d nota(s) de R$ 2,00\n", cedulas2);
    System.out.printf("%d nota(s) de R$ 1,00\n", cedulas1);




    }
}
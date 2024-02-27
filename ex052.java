import java.util.Scanner;

public class ex052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----NÚMEROS PRIMOS----");
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        int contador = 0;
        int i = 1;
        while (i < (num+1)) {
            if (num % i == 0) {
                contador += 1;
            }
            i++;
        }
        if (contador > 2) {
            System.out.println("O número " + num + " foi divisível " + contador + " vezes\n" +
                               "por isso ele NÃO É PRIMO!!");
        } else {
            System.out.println("O número " + num + " foi divisível " + contador + " vezes\n" +
                    "por isso ele É PRIMO!!");
        }
    }
}
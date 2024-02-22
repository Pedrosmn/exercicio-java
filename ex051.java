import java.util.Scanner;

public class ex051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----10 TERMOS DE UMA PA----");
        System.out.print("Primeiro termo: ");
        int primeiroTermo = scan.nextInt();
        System.out.print("Razão: ");
        int razao = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.print(primeiroTermo + " > ");
            primeiroTermo += razao;
        }
        System.out.println("FIM");
    }
}
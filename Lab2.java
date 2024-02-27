import java.util.Scanner;

public class Lab2 {
    static Scanner scan = new Scanner(System.in);

    public static void sequencia() {
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    public static void potenciacao() {
        System.out.println("----POTENCIAÇÃO----");
        System.out.print("Digite o valor da base: ");
        int base = scan.nextInt();
        System.out.print("Digite o valor do expoente: ");
        int expoente = scan.nextInt();

        int total = base;
        for (int i = 1; i < expoente; i++){
            total = total * base;
        }
        System.out.println("O resultado de " + base + "^" + expoente + " é " + total);
    }

    public static void somaTotal() {
        System.out.print("Quantos números você deseja somar? ");
        int quantia = scan.nextInt();

        int total = 0;
        for (int i = 1; i <= quantia; i++) {
            System.out.print(i + "º número da soma: ");
            int valorTemporario = scan.nextInt();
            total += valorTemporario;
        }
        System.out.println("A soma dos " + quantia + " números é igual à " + total);
    }

    public static void main(String[] args) {
        //sequencia();
        //potenciacao();
        //somaTotal();
    }

}
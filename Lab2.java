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

    public static void maisNovo() {
        short auxiliarIdade = 0;
        String auxiliarNome = "";
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nome da " + i + "° pessoa: ");
            String nome = scan.nextLine();
            System.out.print("Idade: ");
            short idade = scan.nextShort();
            System.out.println("--------------");

            if ((idade < auxiliarIdade) || (auxiliarIdade == 0)) {
                auxiliarIdade = idade;
                auxiliarNome = nome;
            }
            scan.nextLine();
        }
        System.out.println("A pessoa mais nova entre as 3 é " + auxiliarNome + " com " + auxiliarIdade + " anos.");
    }

    public static void faixasNumericas() {
        int primeiraFaixa = 0;
        int segundaFaixa = 0;
        int terceiraFaixa = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + " número: ");
            int numero = scan.nextInt();

            if ((numero >= 0) && (numero <= 100)) {
                primeiraFaixa++;
            } else if (numero <= 500) {
                segundaFaixa++;
            } else if (numero > 500){
                terceiraFaixa++;
            }
        }
        System.out.println(primeiraFaixa + " Números na faixa de 0-100\n" +
                           segundaFaixa +  " Números na faixa de 101-500\n" +
                           terceiraFaixa + " Números na faixa de 501+");
    }

    public static void main(String[] args) {
        sequencia();
        potenciacao();
        somaTotal();
        maisNovo();
        faixasNumericas();
    }
}
import java.util.Scanner;

public class lab1 {
    
    public static void main(String[] args) {
        cadastrarCliente();
        calcularEmprestimo();
        idadeEmDias();
        imparOuPar();
        reajusteSalarial();
    }
    
    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        
        System.out.print("Idade: ");
        int age = scanner.nextInt();
        
        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        
        System.out.print("Endereço: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        
        System.out.println("--------------------");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + address);
    }
    
    public static void calcularEmprestimo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu salário: ");
        float salary = scanner.nextFloat();
        
        System.out.print("Digite seu saldo na conta: ");
        float balance = scanner.nextFloat();
        
        float max_loan = (salary * 3) + (balance / 5);
        
        System.out.println("--------------------");
        System.out.println("Empréstimo máximo: " + max_loan);
    }
    
    public static void idadeEmDias() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos anos você tem? ");
        int age_year = scanner.nextInt();
        System.out.print("Quantos meses a mais você tem? ");
        int age_month = scanner.nextInt();
        System.out.print("Quantos dias a mais você tem? ");
        int age_day = scanner.nextInt();
        
        int age_day_total = (age_year * 365) + (age_month * 30) + age_day;
        
        System.out.println("--------------------");
        System.out.println("Você tem um total de " + age_day_total + " dias de vida!");
    }
    
    public static void imparOuPar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        
        System.out.println("--------------------");
        if (number % 2 == 0) {
            System.out.println(number + " é um número PAR!");
        } else {
            System.out.println(number + " é um número ÍMPAR");
        }
    }
    
    public static void reajusteSalarial() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu salário: ");
        double salary2 = scanner.nextFloat();
        double increased_salary;
        
        if (salary2 < 2000) {
            increased_salary = salary2 + (salary2 * 0.10) + 200 ;
        } else if ((salary2 >= 2000) && (salary2 < 5000)) {
            increased_salary = salary2 + (salary2 * 0.08) + 150;
        } else {
            increased_salary = salary2 + (salary2 * 0.05);
        }
        
        System.out.println("--------------------");
        System.out.println("O seu salário foi reajustado para " + increased_salary);
    }
}
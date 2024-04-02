import java.util.*;

public class Lista2 {
    public static Scanner scan = new Scanner(System.in);

    public static void bauDePizza() {
        Stack<String> saborDaPizza = new Stack<>();
        Stack<String> enderecoDeEntrega = new Stack<>();

        while (true) {
            System.out.print("---------------------\n" +
                    "[1] Adicionar pizza\n" +
                    "[2] Remover pizza\n" +
                    "[3] Checar pizza\n" +
                    "[4] Listar pizzas\n" +
                    "[0] Sair\n" +
                    "Digite: ");
            int escolha = scan.nextInt();
            scan.nextLine();
            System.out.println("---------------------");
            if (escolha == 1) {
                System.out.print("Sabor da pizza que deseja adicionar à pilha: ");
                saborDaPizza.push(scan.nextLine());
                System.out.print("Endereço de entrega: ");
                enderecoDeEntrega.push(scan.nextLine());
                System.out.println("Pizza adicionada!");
            } else if (escolha == 2) {
                saborDaPizza.pop();
                enderecoDeEntrega.pop();
                System.out.println("Pizza removida!");
            } else if (escolha == 3) {
                System.out.println("O sabor da pizza do topo da pilha é " + saborDaPizza.peek());
            } else if (escolha == 4) {
                Iterator<String> iSabor = saborDaPizza.iterator();
                Iterator<String> iEndereco = enderecoDeEntrega.iterator();

                while (iSabor.hasNext()) {
                    System.out.println("Sabor: " + iSabor.next() + "/ Endereço de entrega: " + iEndereco.next());
                }
            } else if (escolha == 0) {
                System.out.println("Finalizando programa!");
                break;
            } else {
                System.out.println("Digite um valor válido!");
            }
        }

    }

    public static void sistemaAcademico() {
        HashMap<String, String> alunos = new HashMap<>();

        while (true) {
            System.out.print("---------------------\n" +
                    "[1] Adicionar Aluno\n" +
                    "[2] Remover Aluno\n" +
                    "[3] Listar Alunos\n" +
                    "[4] Listar CPFs\n" +
                    "[0] Sair\n" +
                    "Digite: ");
            int escolha = scan.nextInt();
            scan.nextLine();
            System.out.println("---------------------");

            if (escolha == 1) {
                System.out.print("Nome do aluno: ");
                String nome = scan.nextLine();
                System.out.print("CPF do aluno: ");
                String cpf = scan.nextLine();
                alunos.put(cpf, nome);
            } else if (escolha == 2) {
                System.out.print("CPF do aluno que deseja remover: ");
                String cpfRemover = scan.nextLine();
                if (alunos.containsKey(cpfRemover)) {
                    alunos.remove(cpfRemover);
                    System.out.println("Aluno removido!");
                } else {
                    System.out.println("CPF não encontrado!");
                }
            } else if (escolha == 3) {
                HashSet<String> nomes = new HashSet<>(alunos.values());
                for (String i : nomes) {
                    System.out.println(i);
                }
            } else if (escolha == 4) {
                HashSet<String> cpfs = new HashSet<>(alunos.keySet());
                for (String i : cpfs) {
                    System.out.println(i);
                }
            } else if (escolha == 0) {
                System.out.println("Finalizando programa!");
                break;
            } else {
                System.out.println("Digite um valor possível!");
            }
        }
    }

    public static void main(String[] args) {
        //bauDePizza();
        sistemaAcademico();
    }
}

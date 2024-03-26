import java.util.*;

public class Lista1 {

    public static void listaTelefonica() {
        Scanner scanner = new Scanner(System.in);
        List<String> contatos = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do contato:");
                String nomeContato = scanner.nextLine();
                System.out.println("Digite o número do telefone:");
                String telefone = scanner.nextLine();
                contatos.add(nomeContato + ": " + telefone);
                System.out.println("Contato adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Digite o nome do contato a ser removido:");
                String contatoRemover = scanner.nextLine();
                if (contatos.removeIf(contato -> contato.startsWith(contatoRemover))) {
                    System.out.println("Contato removido com sucesso!");
                } else {
                    System.out.println("Contato não encontrado.");
                }
            } else if (opcao == 0) {
                return;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public static void bauDePizza() {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pizzas = new Stack<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Pizza");
            System.out.println("2 - Remover Pizza");
            System.out.println("3 - Checar Pizza");
            System.out.println("4 - Listar Pizzas");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o sabor da pizza:");
                String saborPizza = scanner.nextLine();
                System.out.println("Digite o endereço de entrega:");
                String endereco = scanner.nextLine();
                pizzas.push("Pizza: " + saborPizza + ", Endereço: " + endereco);
                System.out.println("Pizza adicionada com sucesso!");
            } else if (opcao == 2) {
                if (!pizzas.isEmpty()) {
                    System.out.println("Pizza removida: " + pizzas.pop());
                } else {
                    System.out.println("Não há pizzas para remover.");
                }
            } else if (opcao == 3) {
                if (!pizzas.isEmpty()) {
                    System.out.println("A pizza no topo da pilha é: " + pizzas.peek());
                } else {
                    System.out.println("Não há pizzas na pilha.");
                }
            } else if (opcao == 4) {
                System.out.println("Listando todas as pizzas:");
                Iterator<String> iterator = pizzas.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            } else if (opcao == 0) {
                return;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public static void sistemaAcademico() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Remover Aluno");
            System.out.println("3 - Listar Alunos");
            System.out.println("4 - Listar CPFs");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do aluno:");
                String nomeAluno = scanner.nextLine();
                System.out.println("Digite o CPF do aluno:");
                String cpf = scanner.nextLine();
                alunos.put(cpf, nomeAluno);
                System.out.println("Aluno adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Digite o CPF do aluno a ser removido:");
                String cpfRemover = scanner.nextLine();
                if (alunos.containsKey(cpfRemover)) {
                    alunos.remove(cpfRemover);
                    System.out.println("Aluno removido com sucesso!");
                } else {
                    System.out.println("Aluno não encontrado.");
                }
            } else if (opcao == 3) {
                System.out.println("Listando todos os alunos:");
                for (String nome : alunos.values()) {
                    System.out.println(nome);
                }
            } else if (opcao == 4) {
                System.out.println("Listando todos os CPFs:");
                for (String cpfAluno : alunos.keySet()) {
                    System.out.println(cpfAluno);
                }
            } else if (opcao == 0) {
                return;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
    public static void main(String[] args) {

        listaTelefonica();
        bauDePizza();
        sistemaAcademico();
    }
}

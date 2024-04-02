package UpLab3;
import java.util.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        Escola escolaTeste = new Escola();

        while (true) {
            System.out.print("----ESCOLINHA----\n" +
                               "[ 1 ] Editar Disciplinas\n" +
                               "[ 2 ] Editar Alunos\n" +
                               "[ 0 ] Sair\n" +
                               "Digite: ");
            short escolha = scan.nextShort();

            if (escolha == 1) {
                while (true) {
                    System.out.print("----Disciplinas----\n" +
                                       "[ 1 ] Cadastrar Disciplina\n" +
                                       "[ 2 ] Listar Disciplinas\n" +
                                       "[ 0 ] Sair\n" +
                                       "Digite: ");
                    short escolhaDisciplinas = scan.nextShort();
                    scan.nextLine();

                    if (escolhaDisciplinas == 1) {
                        System.out.println("----CADASTRO DE DISCIPLINA----");
                        System.out.print("Nome da disciplina: ");
                        String nomeDisciplina = scan.nextLine();
                        System.out.print("Professor da disciplina: ");
                        String professorDisciplina = scan.nextLine();
                        System.out.print("Turno de aula: \n" +
                                "[ 1 ] Manhã\n" +
                                "[ 2 ] Tarde\n" +
                                "[ 3 ] Noite\n" +
                                "Digite: ");
                        String turnoDisciplina = scan.nextLine();
                        escolaTeste.cadastrarDisciplina(new Disciplina(nomeDisciplina, professorDisciplina, turnoDisciplina));
                    } else if (escolhaDisciplinas == 2) {
                        escolaTeste.listarDisciplinas();
                    } else if (escolhaDisciplinas == 0) {
                        break;
                    }
                }
            } else if (escolha == 0) {
                break;
            }
        }
    }
}
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
                    System.out.print("----DISCIPLINAS----\n" +
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
            } else if (escolha == 2) {
                while (true) {
                    System.out.print("----ALUNOS----\n" +
                            "[ 1 ] Matricular Aluno\n" +
                            "[ 2 ] Listar Alunos\n" +
                            "[ 0 ] Sair\n" +
                            "Digite: ");
                    short escolhaAlunos = scan.nextShort();
                    scan.nextLine();

                    if (escolhaAlunos == 1) {
                        ArrayList<Disciplina> listaDisciplinaAluno = new ArrayList<>();
                        System.out.println("----MATRICULAR ALUNO----");
                        if (!escolaTeste.getDisciplinas().isEmpty()) {
                            System.out.println("Qual disciplina deseja matricular o aluno?");
                            while (true) {
                                for (Disciplina a : escolaTeste.getDisciplinas()) {
                                    System.out.println("[ " + (escolaTeste.getDisciplinas().indexOf(a)+1) + " ] " + a.getNome());
                                }
                                System.out.println("[ 0 ] Continuar");
                                System.out.print("Digite: ");
                                short escolhaMatricula = scan.nextShort();
                                if (escolhaMatricula != 0) {
                                    listaDisciplinaAluno.add(escolaTeste.getDisciplinas().get(escolhaMatricula-1));
                                } else if (escolhaMatricula == 0) {
                                    scan.nextLine();
                                    break;
                                }
                            }
                        }
                        System.out.print("Nome do aluno: ");
                        String nomeAluno = scan.nextLine();
                        System.out.print("N° da matrícula: ");
                        String nMatriculaAluno = scan.nextLine();

                        for (Disciplina x : escolaTeste.getDisciplinas()) {
                            for (Disciplina y : listaDisciplinaAluno) {
                                if (x.equals(y)) {
                                    x.matricularAluno(new Aluno(nomeAluno, nMatriculaAluno, listaDisciplinaAluno));
                                }
                            }
                        }
                    } else if (escolhaAlunos == 2) {
                        /*

                        ADICIONAR O LISTAR ALUNOS
                        SISTEMA DE ERRO DE DIGITAÇÃO


                        escolaTeste.getDisciplinas().get(0).listarAluno();*/
                    }
                }
            } else if (escolha == 0) {
                break;
            }
        }
    }
}
package Lab3;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", "320i", 2015, 320000);
        Carro c2 = new Carro("Chevrolet", "Celta", 2015, 32000);

        System.out.println(c1);
        System.out.println(c2);


        Aluno pedro = new Aluno("Pedro", "1231231", 3);
        Aluno paulo = new Aluno("Paulo", "45645645", 4);
        Aluno pereira = new Aluno("Pereira", "789789", 3);
        Aluno marcio = new Aluno("Márcio", "2992393", 4);
        Disciplina matematica = new Disciplina("Matemática", "João", 3);
        Disciplina geografia = new Disciplina("Geografia", "Jorge", 4);
        Disciplina portugues = new Disciplina("Português", "Jâmio", 3);
        Disciplina artes = new Disciplina("Artes", "Lário", 4);

        matematica.matricularAluno(pedro);
        geografia.matricularAluno(pedro);
        artes.matricularAluno(pedro);

        geografia.matricularAluno(marcio);
        portugues.matricularAluno(marcio);
        matematica.matricularAluno(marcio);
        artes.matricularAluno(marcio);

        matematica.listarAluno();
        geografia.listarAluno();
        artes.listarAluno();
        portugues.listarAluno();

    }
}
package UpLab3;
import java.util.*;

public class Disciplina {
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private String horario;
    private int contador;

    public Disciplina(String nome, String professor, String horario) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        if (horario.equals("1")) {
            this.horario = "Matutino";
        } else if (horario.equals("2")) {
            this.horario = "Vespertino";
        } else if (horario.equals("3")) {
            this.horario = "Noturno";
        }
        this.contador = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getHorario() {return horario;}

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Aluno> getAlunos() {return alunos;}

    public void setAlunos(ArrayList<Aluno> alunos) {this.alunos = alunos;}

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    /*public void matricularAluno(Aluno aluno) {
        if (this.contador < this.tamanhoMaximo) {
            this.alunos[this.contador] = aluno;
            aluno.addDisciplina(this);
            this.contador++;
        }
    }

    public void listarAluno() {
        for (int i = 0; i < this.contador; i++) {
            System.out.println("Nome: " + this.alunos[i].getNome());
        }
    }*/
}
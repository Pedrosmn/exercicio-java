package UpLab3;
import java.util.*;

public class Escola {
    private ArrayList<Disciplina> disciplinas;

    public Escola() {
        this.disciplinas = new ArrayList<>();
    }

    public ArrayList<Disciplina> getDisciplinas() {return disciplinas;}

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {this.disciplinas = disciplinas;}

    public void cadastrarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    public void listarDisciplinas() {
        for (Disciplina a : disciplinas) {
            System.out.println(a.getNome() + ", " + a.getHorario() + ", " + a.getProfessor());
        }
    }
}

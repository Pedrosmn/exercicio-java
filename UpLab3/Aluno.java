package UpLab3;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String numeroMatricula;
    private ArrayList<Disciplina> listaDisciplinas;
    private int contador;

    public Aluno(String nome, String numeroMatricula, ArrayList<Disciplina> listaDisciplinas) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.listaDisciplinas = new ArrayList<>();
        this.contador = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }


    /*public void addDisciplina(Disciplina disciplina) {
        if (this.contador < this.maxDisciplinas) {
            this.listaDisciplinas[this.contador] = disciplina;
            this.contador++;
        }
    }*/
}




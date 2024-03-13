package Lab3;

public class Aluno {
    private String nome;
    private String numeroMatricula;
    private int maxDisciplinas;
    private Disciplina[] listaDisciplinas;
    private int contador;

    public Aluno(String nome, String numeroMatricula, int maxDisciplinas) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.maxDisciplinas = maxDisciplinas;
        this.listaDisciplinas = new Disciplina[maxDisciplinas];
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

    public int getMaxDisciplinas() {
        return maxDisciplinas;
    }

    public void setMaxDisciplinas(int maxDisciplinas) {
        this.maxDisciplinas = maxDisciplinas;
    }

    public Disciplina[] getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(Disciplina[] listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }


    public void addDisciplina(Disciplina disciplina) {
        if (this.contador < this.maxDisciplinas) {
            this.listaDisciplinas[this.contador] = disciplina;
            this.contador++;
        }
    }
}




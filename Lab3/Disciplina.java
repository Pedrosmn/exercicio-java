package Lab3;

public class Disciplina {
    private String nome;
    private String professor;
    private Aluno[] alunos;
    private int tamanhoMaximo;
    private int contador;

    public Disciplina(String nome, String professor, int tamanhoMaximo) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new Aluno[tamanhoMaximo];
        this.tamanhoMaximo = tamanhoMaximo;
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

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public int getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void matricularAluno(Aluno aluno) {
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
    }
}
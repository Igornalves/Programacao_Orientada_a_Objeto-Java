package Sistema_Escolar;

import java.util.ArrayList;

import Sistema_Escolar.Funcionarios.Professor;

public class Disciplina {
    private String nome;
    private String matricula;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Disciplina() {
        alunos = new ArrayList<Aluno>();
        professores = new ArrayList<Professor>();
    }

    public Disciplina(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void removeProfessor(Professor professor) {
        this.professores.remove(professor);
    }
}

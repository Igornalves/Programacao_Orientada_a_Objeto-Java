package Sistema_Escolar_Aula;

import java.util.ArrayList;

import Sistema_Escolar_Aula.Funcionarios.Coordenador;

public class Curso {
    private String nome;
    private Coordenador coordenador;
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
        disciplinas = new ArrayList<Disciplina>();
    }

    public void addDisciplina(Disciplina novaDisciplina){
        disciplinas.add(novaDisciplina);
    }

    public void removerDisciplina(Disciplina novaDisciplina){
        disciplinas.remove(novaDisciplina);
    }

    public int quantidadeDeDisciplinas(){
        return disciplinas.size();
    }

    public Disciplina getTotalDeDisciplinaNoCurso(int posicao){
        return disciplinas.get(posicao);
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

}

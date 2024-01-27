package Escolar.Funcionarios;

import java.util.ArrayList;

import Escolar.Disciplina;
import Escolar.Abstratas.Funcionario;

public class Professor extends Funcionario {
    
    private ArrayList<Disciplina> disciplinas;

    public Professor(){
        disciplinas = new ArrayList<Disciplina>();
    }

    public void addDisciplina (Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removerDisciplina (Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public int quantidadeDeDisciplinas(){
        return disciplinas.size();
    }

    public Disciplina getTotalDeDisciplinasLecionadas(int posicao){
        return disciplinas.get(posicao);
    }
}

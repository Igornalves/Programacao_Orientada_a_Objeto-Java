package Sistema_Escolar_Aula.Funcionarios;

import java.util.ArrayList;

import Sistema_Escolar_Aula.Disciplina;
import Sistema_Escolar_Aula.Abstratas.Funcionario;

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

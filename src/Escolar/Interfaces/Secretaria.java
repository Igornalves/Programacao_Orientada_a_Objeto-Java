package Escolar.Interfaces;

import Escolar.Aluno;
import Escolar.Funcionarios.Professor;

public interface Secretaria {
    
    public void atenderAluno(Aluno aluno);
    
    public void atenderProfesor(Professor professor);
}

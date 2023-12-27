package Sistema_Escolar.Interfaces;

import Sistema_Escolar.Aluno;
import Sistema_Escolar.Funcionarios.Professor;

public interface Secretaria {
    
    public void atenderAluno(Aluno aluno);
    
    public void atenderProfesor(Professor professor);
}

package Sistema_Escolar_Aula.Interfaces;

import Sistema_Escolar_Aula.Aluno;
import Sistema_Escolar_Aula.Funcionarios.Professor;

public interface Secretaria {
    
    public void atenderAluno(Aluno aluno);
    
    public void atenderProfesor(Professor professor);
}

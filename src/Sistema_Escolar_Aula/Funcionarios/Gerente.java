package Sistema_Escolar_Aula.Funcionarios;

import java.util.ArrayList;

import Sistema_Escolar_Aula.Aluno;
import Sistema_Escolar_Aula.Abstratas.Funcionario;
import Sistema_Escolar_Aula.Interfaces.Diretoria;
import Sistema_Escolar_Aula.Interfaces.Secretaria;

public class Gerente extends Funcionario implements Diretoria, Secretaria {

    @Override
    public void atenderAluno(Aluno aluno) {
        // TODO Auto-generated method stub

    }

    @Override
    public void atenderProfesor(Professor professor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void reunião() {
        // TODO Auto-generated method stub

    }

    @Override
    public void reuniãoGeral(ArrayList<Funcionario> Funcionarios) {
        // TODO Auto-generated method stub

    }
}
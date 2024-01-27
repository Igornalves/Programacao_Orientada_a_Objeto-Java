package Escolar.Funcionarios;

import java.util.ArrayList;

import Escolar.Aluno;
import Escolar.Abstratas.Funcionario;
import Escolar.Interfaces.Diretoria;
import Escolar.Interfaces.Secretaria;

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
package Sistema_Escolar_Aula.Interfaces;

import java.util.ArrayList;

import Sistema_Escolar_Aula.Abstratas.Funcionario;

public interface Diretoria {
    
    public void reunião();

    public void reuniãoGeral(ArrayList<Funcionario> Funcionarios);
}

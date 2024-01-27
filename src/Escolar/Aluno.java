package Escolar;

import Escolar.Abstratas.PessoaFisica;

public class Aluno extends PessoaFisica {

    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

}

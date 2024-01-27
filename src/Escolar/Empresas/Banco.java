package Escolar.Empresas;

import java.util.ArrayList;

import Escolar.Abstratas.PessoaJuridica;
import Escolar.Funcionarios.Diretor;
import Escolar.Funcionarios.Presidente;

public class Banco extends PessoaJuridica {

    private Presidente presidente;
    private ArrayList<Diretor> diretores;

    public Banco() {
        diretores = new ArrayList<Diretor>();
    }

    public Banco(String nome, String cnpj, String nomeFantasia, Presidente presidente) {
        super(nome, cnpj, nomeFantasia);
        this.presidente = presidente;
    }

    public void addDiretor(Diretor novoDiretor) {
        diretores.add(novoDiretor);
    }

    public void removerDiretor(Diretor novoDiretor) {
        diretores.remove(novoDiretor);
    }

    public int quantidadeDeDisciplinas() {
        return diretores.size();
    }

    public Diretor getTotalDeDiretoresDoBanco(int posicao) {
        return diretores.get(posicao);
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    // public void setDiretores(ArrayList<Diretor> diretores) {
    // this.diretores = diretores;
    // }

    public Presidente getPresidente() {
        return presidente;
    }

    // public ArrayList<Diretor> getDiretores() {
    // return diretores;
    // }

}
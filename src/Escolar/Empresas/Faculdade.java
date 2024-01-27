package Escolar.Empresas;

import java.util.ArrayList;

import Escolar.Curso;
import Escolar.Abstratas.PessoaJuridica;
import Escolar.Funcionarios.Diretor;
import Escolar.Funcionarios.Presidente;
import Escolar.Funcionarios.SecAcademica;
import Escolar.Funcionarios.SecFinanceira;

public class Faculdade extends PessoaJuridica {

    private ArrayList<Curso> cursos;
    private ArrayList<Diretor> diretores;
    private SecAcademica secAcademica;
    private SecFinanceira secFinanceira;
    private Presidente presidente;

    public Faculdade() {
        cursos = new ArrayList<Curso>();
        diretores = new ArrayList<Diretor>();
    }

    public Faculdade(String nome, String cnpj, String nomeFantasia) {
        super(nome, cnpj, nomeFantasia);
    }

    public void addCurso(Curso novoCurso) {
        cursos.add(novoCurso);
    }

    public void removerCurso(Curso novoCurso) {
        cursos.remove(novoCurso);
    }

    public int quntidadeDeCursos() {
        return cursos.size();
    }

    public Curso getTotalDeCursos(int posicao) {
        return cursos.get(posicao);
    }

    public void addDiretor(Diretor novoDiretor) {
        diretores.add(novoDiretor);
    }

    public void removerDiretor(Diretor novoDiretor) {
        diretores.remove(novoDiretor);
    }

    public int quntidadeDeDiretores() {
        return diretores.size();
    }

    public Diretor getTotalDeDiretores(int posicao) {
        return diretores.get(posicao);
    }

    public void setSecAcademica(SecAcademica secAcademica) {
        this.secAcademica = secAcademica;
    }

    public SecAcademica getSecAcademica() {
        return secAcademica;
    }

    public void setSecFinanceira(SecFinanceira secFinanceira) {
        this.secFinanceira = secFinanceira;
    }

    public SecFinanceira getSecFinanceira() {
        return secFinanceira;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    // public void setCursos(ArrayList<Curso> cursos) {
    // this.cursos = cursos;
    // }

    // public ArrayList<Curso> getCursos() {
    // return cursos;
    // }
}

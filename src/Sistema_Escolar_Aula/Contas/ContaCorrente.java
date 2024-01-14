package Sistema_Escolar_Aula.Contas;

import Sistema_Escolar_Aula.Abstratas.Conta;
import Sistema_Escolar_Aula.Abstratas.Pessoa;
import Sistema_Escolar_Aula.Funcionarios.Gerente;

public class ContaCorrente extends Conta {
    
    private Double taxaServicos;

    public ContaCorrente(){}

    public ContaCorrente(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo, Double taxaServicos){
        super(titular, gerente, numero, agencia, saldo);
        this.taxaServicos = taxaServicos;
    }

    public void setTaxaServicos(Double taxaServicos) {
        this.taxaServicos = taxaServicos;
    }

    public Double getTaxaServicos() {
        return taxaServicos;
    }
}

package Sistema_Escolar.Contas;

import Sistema_Escolar.Abstratas.Conta;
import Sistema_Escolar.Abstratas.Pessoa;
import Sistema_Escolar.Funcionarios.Gerente;

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

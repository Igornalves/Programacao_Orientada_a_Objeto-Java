package Escolar.Contas;

import Escolar.Abstratas.Conta;
import Escolar.Abstratas.Pessoa;
import Escolar.Funcionarios.Gerente;

public class ContaPoupanca extends Conta {
    
    private Double juros;

    public ContaPoupanca(){}

    public ContaPoupanca(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo, Double juros){
        super(titular, gerente, numero, agencia, saldo);
        this.juros = juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }
    
}

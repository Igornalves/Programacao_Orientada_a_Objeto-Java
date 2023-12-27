package Sistema_Escolar.Abstratas;

public abstract class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(){
    }

    public PessoaFisica(String nome,String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

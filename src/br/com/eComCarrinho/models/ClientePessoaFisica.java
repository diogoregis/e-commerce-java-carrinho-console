package br.com.eComCarrinho.models;

public class ClientePessoaFisica extends Usuario{

    private static final String SENHA = "123";
    private String cpf;
    public ClientePessoaFisica(String nome, String cpf) {
        super(nome, SENHA);
        this.cpf = cpf;
    }
}

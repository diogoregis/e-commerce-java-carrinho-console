package br.com.eComCarrinho.models;

public class ClientePessoaJuridica extends Usuario{

    private static final String SENHA = "123456";
    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj) {
        super(nome, SENHA);
        this.cnpj = cnpj;
        setEmpresa(true);
    }

    public String getCnpj() {
        return cnpj;
    }
}

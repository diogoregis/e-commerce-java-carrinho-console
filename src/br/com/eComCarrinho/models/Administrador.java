package br.com.eComCarrinho.models;

public class Administrador extends Usuario{

    private final String SENHA = "123456";
    public Administrador(String nome) {
        super(nome);
        setAdm(true);
    }
}

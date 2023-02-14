package br.com.eComCarrinho.models;

public enum Categoria {

    INFORMATICA("INFORMATICA"),
    LIVRO("LIVROS"),
    MERCADO("MERCADO");

    private String descricao;

    Categoria(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

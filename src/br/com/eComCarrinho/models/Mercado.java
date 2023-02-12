package br.com.eComCarrinho.models;

public class Mercado extends Produto{
    private String validade;
    public Mercado(String nome, String marca, double preco, String validade) {
        super(nome, marca, preco);
        this.validade = validade;
    }
    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void resumoValidade(){
        System.out.println("Produto: " + this.getNome());
        System.out.println("Validade: " + this.getValidade());
    }

}

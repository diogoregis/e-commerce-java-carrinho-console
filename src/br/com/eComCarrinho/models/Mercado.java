package br.com.eComCarrinho.models;

public class Mercado extends Produto{
    private String validade;
    public Mercado(String nome, String marca, double preco, String validade) {
        super(nome, marca, preco);
        this.validade = validade;
        this.setCategoria(Categoria.MERCADO);
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

    public int compareTo(Produto produto){
        if (this.getPreco() < produto.getPreco()) {
            return -1;
        }
        if (this.getPreco() > produto.getPreco()) {
            return 1;
        }
        return 0;
    }

}

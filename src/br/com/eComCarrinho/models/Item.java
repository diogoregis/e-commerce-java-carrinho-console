package br.com.eComCarrinho.models;

import br.com.eComCarrinho.tools.Tools;

public class Item {

    private int quantidade;
    private double valorTotal;
    private Produto item;

    public Item(Produto item, int quantidade){
        this.item = item;
        this.quantidade = quantidade;
        this.valorTotal = geraValorTotal();
    }

    private double geraValorTotal(){
        double valor;
        return valor = (item.getPreco() * quantidade);

    }

    @Override
    public String toString() {
        return " " +  item.getNome().toUpperCase() +
                " | Quant: " + quantidade +
                " | Total: " + Tools.precoFormata(valorTotal);
    }

    public String getNomeProduto(){
        return item.getNome().toUpperCase();
    }

    public double getValorTotal(){
        return valorTotal;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }
}

package br.com.eComCarrinho.models;

import br.com.eComCarrinho.repository.ICompareProd;

public abstract class Produto implements ICompareProd {

    private String nome, marca;
    private double preco;
    private Categoria categoria;
    public Produto(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
    public int compareTo(Produto produto){
        if (this.preco < produto.getPreco()) {
            return -1;
        }
        if (this.preco > produto.getPreco()) {
            return 1;
        }
        return 0;
    }

    public int compareToNome(Produto produto){
        if (this.preco < produto.getPreco()) {
            return -1;
        }
        if (this.preco > produto.getPreco()) {
            return 1;
        }
        return 0;
    }
}

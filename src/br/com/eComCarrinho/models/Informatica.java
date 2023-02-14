package br.com.eComCarrinho.models;

import br.com.eComCarrinho.tools.Tools;

public class Informatica extends Produto{

    private boolean importado;
    public Informatica(String nome, String marca, double preco, boolean importado) {
        super(nome, marca, preco);
        this.importado = importado;
        this.setCategoria(Categoria.INFORMATICA);
    }

    public boolean isImportado() {
        return importado;
    }

    public void maisInformacoes(){
        System.out.println("(( " + this.getNome().toUpperCase() + " ))");
        if(isImportado()){
            System.out.println("(( IMPORTADO ))");
        }else {
            System.out.println("(( NACIONAL ))");
        }
        System.out.println("R$ " + Tools.precoFormata(this.getPreco()));
    }

    @Override
    public String toString() {
        return " " + getNome() + " | " + getMarca() + " | " + Tools.precoFormata(getPreco()) +
                " | " + (importado ? "IMP" : "NAC" );
    }

    @Override
    public int compareTo(Produto produto) {
        if (this.getPreco() < produto.getPreco()) {
            return -1;
        }
        if (this.getPreco() > produto.getPreco()) {
            return 1;
        }
        return 0;
    }
}

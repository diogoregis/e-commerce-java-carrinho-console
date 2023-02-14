package br.com.eComCarrinho.tools;

import br.com.eComCarrinho.models.Produto;

import java.util.Comparator;

public class OrdenacaoPrecoDown implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return String.valueOf(p2.getPreco()).compareTo(String.valueOf(p1.getPreco()));
    }
}

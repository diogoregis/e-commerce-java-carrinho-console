package br.com.eComCarrinho.tools;

import br.com.eComCarrinho.models.Produto;

import java.util.Comparator;

public class OrdencaoNomeDown implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p2.getNome().compareTo(p1.getNome());
    }
}

package br.com.eComCarrinho.tools;

import br.com.eComCarrinho.models.Produto;

import java.util.Comparator;

public class OrdenacaoNomeUp implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}

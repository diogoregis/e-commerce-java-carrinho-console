package br.com.eComCarrinho.repository;

import br.com.eComCarrinho.models.Produto;

public interface ICompareProd extends Comparable<Produto>{

    @Override
    public int compareTo(Produto produto);

}

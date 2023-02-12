package br.com.eComCarrinho.repository;

import br.com.eComCarrinho.models.Produto;
import java.util.List;

public interface IProdutoRepository {

    public boolean addListaProduto(Produto produto);
    public List<Produto> retornaListAll();
    public Produto retornaProdutoIndex(int index);
    public Produto removeProduto(int index);
    public Produto produtoUpdate(int index, Produto produto);

}

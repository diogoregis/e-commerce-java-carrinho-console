package br.com.eComCarrinho.dao;

import br.com.eComCarrinho.models.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutosDao {

    private static final ProdutosDao PRODUTOS_DAO = new ProdutosDao();
    private static List<Produto> produtoList = new ArrayList<>();
    private ProdutosDao(){

    }
    public static ProdutosDao getInstance() {
        return PRODUTOS_DAO;
    }
    public boolean addListaProduto(Produto produto){
        return produtoList.add(produto);
    }
    public List<Produto> retornaListAll(){
        return produtoList;
    }
    public Produto retornaProdutoIndex(int index){
        return produtoList.get(index);
    }

}

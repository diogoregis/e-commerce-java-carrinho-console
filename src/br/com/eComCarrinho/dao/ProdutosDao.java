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
    public Produto removeProduto(int index){
        return produtoList.remove(index);
    }
    public Produto produtoUpdate(int index, Produto produto){
        return produtoList.set(index, produto);
    }
    public Produto editarPrecoProduto(int index, double preco) {
        produtoList.get(index).setPreco(preco);
        return produtoList.get(index);
    }

}

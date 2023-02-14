package br.com.eComCarrinho.services;

import br.com.eComCarrinho.dao.ProdutosDao;
import br.com.eComCarrinho.models.Produto;
import br.com.eComCarrinho.repository.IProdutoRepository;

import java.util.List;

public class ProdutoService implements IProdutoRepository {
    private static final ProdutoService PRODUTO_SERVICE = new ProdutoService();
    private ProdutoService(){}
    public static ProdutoService getInstance(){
        return PRODUTO_SERVICE;
    }
    private ProdutosDao produtosDao = ProdutosDao.getInstance();
    @Override
    public boolean addListaProduto(Produto produto) {
        return produtosDao.addListaProduto(produto);
    }

    @Override
    public List<Produto> retornaListAll() {
        return produtosDao.retornaListAll();
    }

    @Override
    public Produto retornaProdutoIndex(int index) {
        return produtosDao.retornaProdutoIndex(index);
    }

    @Override
    public Produto removeProduto(int index) {
        return produtosDao.removeProduto(index);
    }
    @Override
    public Produto produtoUpdate(int index, Produto produto) {
        return produtosDao.produtoUpdate(index, produto);
    }

    @Override
    public boolean editarPrecoProduto(int index, double preco) {
        if(produtosDao.editarPrecoProduto(index, preco) != null){
            return true;
        } else {
            return false;
        }
    }
}

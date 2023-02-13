package br.com.eComCarrinho.repository;

import br.com.eComCarrinho.models.Item;
import br.com.eComCarrinho.models.Produto;

public interface ICarrinhoRepository {

    public void colocarProdutoCarrinho(Item item);
    public void retirarProdutoCarrinho(Item item);
    public void esvaziarCarrinho();
    public int totalItensCarrinho();
    public double totalValorCarrinho();
    public Item criarItem(Produto produto, int quantidade);
    public void verCarrinhoAtual();
    public boolean verificaCarrinhoVazio();
    public int procurarItemPorNome(Item item);
    public boolean verificarSeExisteItemCarrinho(Item item);

}

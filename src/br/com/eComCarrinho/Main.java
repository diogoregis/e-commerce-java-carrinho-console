package br.com.eComCarrinho;

import br.com.eComCarrinho.controllers.CarrinhoController;
import br.com.eComCarrinho.controllers.ProdutoController;
import br.com.eComCarrinho.exception.AddProdutoException;
import br.com.eComCarrinho.models.*;

public class Main {

    public static void main(String[] args) throws AddProdutoException {

        //TODO
        //Ainda não concluido


        ProdutoController produtoController = ProdutoController.getInstance();
        CarrinhoController carrinho = CarrinhoController.getInstance();
        Informatica informatica = new Informatica("Teclado USB", "DL", 19.90,false);
        Livro livro = new Livro("Os Mascates", "Chuva", 10.00,"Novo Livro");
        Mercado mercado = new Mercado("Feijão Tops", "Turquesa", 20.90,"90 dias");
        Mercado mercado2 = new Mercado("Feijão Tops", "Turquesa", 20.90,"90 dias");
        Mercado mercado3 = new Mercado("Feijão Tops", "Turquesa", 20.90,"90 dias");

        produtoController.criarAddListaDireto(informatica);
        produtoController.criarAddListaDireto(livro);
        produtoController.criarAddListaDireto(mercado);

        carrinho.verCarrinhoAtual();
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(informatica, 15));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(livro, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado, 10));
        System.out.println(" ");
        carrinho.verCarrinhoAtual();
        System.out.println(" ");
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado2, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado3, 10));
        System.out.println(" ");
        carrinho.verCarrinhoAtual();

    }

}

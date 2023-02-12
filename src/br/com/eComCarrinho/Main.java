package br.com.eComCarrinho;

import br.com.eComCarrinho.controllers.ProdutoController;
import br.com.eComCarrinho.exception.AddProdutoException;
import br.com.eComCarrinho.models.*;

public class Main {

    public static void main(String[] args) throws AddProdutoException {

        //TODO
        //Ainda não concluido


        ProdutoController produtoController = ProdutoController.getInstance();
        Informatica informatica = new Informatica("Teclado", "DL", 19.90,false);
        Livro livro = new Livro("Os Mascates", "Chuva", 17.90,"Novo Livro");
        Mercado mercado = new Mercado("Feijão", "Turquesa", 15.90,"90 dias");

        produtoController.criarAddListaDireto(informatica);
        produtoController.criarAddListaDireto(livro);
        produtoController.criarAddListaDireto(mercado);

        for (Produto produto: produtoController.retornaListAll()) {
            System.out.println(produto.toString());
        }

    }

}

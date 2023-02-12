package br.com.eComCarrinho.controllers;

import br.com.eComCarrinho.exception.AddProdutoException;
import br.com.eComCarrinho.models.Informatica;
import br.com.eComCarrinho.models.Livro;
import br.com.eComCarrinho.models.Mercado;
import br.com.eComCarrinho.models.Produto;
import br.com.eComCarrinho.services.ProdutoService;

import java.net.Proxy;
import java.util.List;

public class ProdutoController {
    private static final ProdutoController PRODUTO_CONTROLLER = new ProdutoController();
    private ProdutoController(){}
    public static ProdutoController getInstance(){
        return PRODUTO_CONTROLLER;
    }
    private ProdutoService produtoService = ProdutoService.getInstance();

    public void criarAddListaProdutoMenu(){

    }

    public void criarAddListaDireto(Produto produto) throws AddProdutoException {
        if(produtoService.addListaProduto(produto)){
            System.out.println("Produto add com sucesso !");
        } else {
            System.out.println(new AddProdutoException(1).e());
        }
    }

    public List<Produto> retornaListAll() {
        return produtoService.retornaListAll();
    }

    private Informatica criarProdutoInformatica(String nome, String marca, double preco, boolean importado){
        return new Informatica(nome, marca, preco, importado);
    }
    private Mercado criarProdutoMercado(String nome, String marca, double preco, String validade){
        return new Mercado(nome, marca, preco, validade);
    }

    private Livro criarProdutoLivro(String nome, String marca, double preco, String sinopse){
        return new Livro(nome, marca, preco, sinopse);
    }

}

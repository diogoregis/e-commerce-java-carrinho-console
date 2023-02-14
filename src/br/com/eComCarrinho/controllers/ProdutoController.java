package br.com.eComCarrinho.controllers;

import br.com.eComCarrinho.exception.AddProdutoException;
import br.com.eComCarrinho.models.*;
import br.com.eComCarrinho.services.ProdutoService;
import br.com.eComCarrinho.tools.OrdenacaoNomeUp;
import br.com.eComCarrinho.tools.OrdenacaoPrecoDown;
import br.com.eComCarrinho.tools.OrdencaoNomeDown;
import br.com.eComCarrinho.tools.Tools;

import java.util.Collections;
import java.util.List;

public class ProdutoController {
    private static final ProdutoController PRODUTO_CONTROLLER = new ProdutoController();
    private ProdutoController(){}
    public static ProdutoController getInstance(){
        return PRODUTO_CONTROLLER;
    }
    private ProdutoService produtoService = ProdutoService.getInstance();

    public void criarAddListaProdutoMenu(){

        //TODO

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

    public void printTodosProdutos(){
        System.out.println(Tools.textoFormatadoBlue(">>> PRODUTOS CADASTRADOS <<<"));
        for(Produto produto : retornaListAll() ){
            System.out.println(produto);
        }
    }

    public void removerProduto(int index){
       Produto removido = produtoService.removeProduto(index);
       if(removido == null){
           System.out.println("Erro ao remover, operação cancelada");
       } else {
           System.out.println(removido.getNome() + ", removido com sucesso.");
       }
    }

    public void editarProduto(int index, double preco){
        if(produtoService.editarPrecoProduto(index, preco)){
            System.out.println(produtoService.retornaProdutoIndex(index) + ", editado com sucesso");
        } else {
            System.out.println("Erro ao editar, operação cancelada");
        }
    }

    public void filtarPorCategoria(Categoria categoria){
        System.out.println("Imprimindo apenas produtos da categoria: " + categoria);
        for(Produto produto : retornaListAll() ){
            if(produto.getCategoria() == categoria){
                System.out.println(produto);
            }
        }

    }
    public void filtarProdutoPorMarca(String marca){
        System.out.println("Filtrando apenas pela marca: " + marca.toUpperCase());
        for(Produto produto : retornaListAll()){
            if(produto.getMarca().toUpperCase().equals(marca.toUpperCase())){
                System.out.println(produto);
            }
        }
    }

    public void ordenadoPorPrecoCrescente(){
        List<Produto> listaOrdenada = retornaListAll();
        Collections.sort(listaOrdenada);
        System.out.println("Produtos por MENOR PREÇO");
        for(Produto produto : listaOrdenada){
            System.out.println(produto);
        }
    }

    public void ordenadoPorNomeCrescente() {
        List<Produto> listaOrdenada = retornaListAll();
        Collections.sort(listaOrdenada, new OrdenacaoNomeUp());
        System.out.println("Produtos por NOME de A-Z");
        for (Produto produto : listaOrdenada) {
            System.out.println(produto);
        }
    }
    public void ordenadoPorPrecoDecrecente(){
        List<Produto> listaOrdenada = retornaListAll();
        Collections.sort(listaOrdenada, new OrdenacaoPrecoDown());
        System.out.println("Produtos por MAIOR PREÇO");
        for(Produto produto : listaOrdenada){
            System.out.println(produto);
        }
    }

    public void ordenadoPorNomeDecrescente(){
        List<Produto> listaOrdenada = retornaListAll();
        Collections.sort(listaOrdenada, new OrdencaoNomeDown());
        System.out.println("Produtos por NOME de Z-A");
        for(Produto produto : listaOrdenada){
            System.out.println(produto);
        }
    }

}

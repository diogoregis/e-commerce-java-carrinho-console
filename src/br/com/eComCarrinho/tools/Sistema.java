package br.com.eComCarrinho.tools;

import br.com.eComCarrinho.controllers.CarrinhoController;
import br.com.eComCarrinho.controllers.PagamentoController;
import br.com.eComCarrinho.controllers.ProdutoController;
import br.com.eComCarrinho.exception.AddProdutoException;
import br.com.eComCarrinho.models.*;

public final class Sistema {

    public void iniciar() throws AddProdutoException {
        Administrador adm = new Administrador("Romario");
        Menu menu = Menu.getInstance();
        ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica("Bebeto", "071.569.122-10");
        ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica("Zico FC", "75.203.281/0001-89");
        ProdutoController produtoController = ProdutoController.getInstance();
        CarrinhoController carrinho = CarrinhoController.getInstance();
        PagamentoController pagamento = PagamentoController.getInstance();
        Sessao sessaoAdm = new Sessao(adm);
        Sessao sessaoClienteFisica = new Sessao(clientePessoaFisica);
        Sessao sessaoClienteJuridica = new Sessao(clientePessoaJuridica);
        menu.head();
        System.out.println(Tools.textoFormatadoBlue("DEMOSTRAÇÃO VISÃO ADMINISTRADOR:"));
        System.out.println(" ");
        menu.quemLogou(sessaoAdm);
        Tools.pause(1);
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoBlue("CADASTRANDO E VISUALIZANDO PRODUTOS:"));
        System.out.println(" ");
        Informatica informatica = new Informatica("Teclado USB", "DL", 39.90,false);
        Livro livro = new Livro("Os Mascates", "Chuva", 10.00,"Novo Livro");
        Mercado mercado = new Mercado("Feijão Tops", "Turquesa", 20.90,"90 dias");
        Mercado mercado2 = new Mercado("Feijão Tops", "Turquesa", 20.90,"90 dias");
        Mercado mercado3 = new Mercado("Feijão Tops", "Turquesa", 20.90,"90 dias");
        Mercado mercado4 = new Mercado("Arroz Tops ", "Turquesa", 15.90,"90 dias");
        produtoController.criarAddListaDireto(informatica);
        produtoController.criarAddListaDireto(livro);
        produtoController.criarAddListaDireto(mercado);
        produtoController.criarAddListaDireto(mercado4);
        produtoController.printTodosProdutos();
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoBlue("REMOVENDO PRODUTO:"));
        produtoController.removerProduto(3);
        produtoController.printTodosProdutos();
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoBlue("ADD NOVAMENTE PRODUTO PARA EDIÇÃO:"));
        produtoController.criarAddListaDireto(mercado4);
        produtoController.printTodosProdutos();
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoBlue("EDITANDO PRODUTO:"));
        produtoController.editarProduto(3, 33.67);
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoBlue("IMPRIMINDO NOVAMENTE TODOS PRODUTOs:"));
        produtoController.printTodosProdutos();
        System.out.println(" ");
        Tools.pause(2);
        System.out.println(" ................................... ");
        System.out.println(" ");

        System.out.println(Tools.textoFormatadoRed("MUDANDO PARA VISÃO CLIENTE (TODOS):"));
        System.out.println(" ");
        menu.quemLogou(sessaoClienteFisica);
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoYellow("VISUALIZANDO CARRINHO DO CLIENTE (VAZIO):"));
        carrinho.verCarrinhoAtual();
        System.out.println(Tools.textoFormatadoYellow("COLOCANDO PRODUTOS NO CARRINHO"));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(informatica, 15));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(livro, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado, 11));
        System.out.println(" ");
        Tools.pause(1);
        System.out.println(Tools.textoFormatadoYellow("VISUALIZANDO CARRINHO COM PRODUTOS"));
        carrinho.verCarrinhoAtual();
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoYellow("ADD PRODUTO REPETIDO AO CARRINHO, IRA ALTERAR QUANTIDADE E VALOR TOTAL APENAS"));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado2, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado3, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 33));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 33));
        Tools.pause(1);
        System.out.println(" ");
        carrinho.verCarrinhoAtual();
        System.out.println(Tools.textoFormatadoYellow("FILTRANDO APENAS POR CATEGORIAS"));
        System.out.println(" ");
        produtoController.filtarPorCategoria(Categoria.INFORMATICA);
        System.out.println(" ");
        produtoController.filtarPorCategoria(Categoria.MERCADO);
        System.out.println(" ");
        produtoController.filtarPorCategoria(Categoria.LIVRO);
        System.out.println(" ");
        Tools.pause(1);
        System.out.println(Tools.textoFormatadoYellow("FILTRANDO POR MARCA"));
        produtoController.filtarProdutoPorMarca("DL");
        System.out.println(" ");
        produtoController.filtarProdutoPorMarca("Turquesa");
        System.out.println(" ");
        produtoController.printTodosProdutos();
        System.out.println(" ");
        Tools.pause(1);
        System.out.println(Tools.textoFormatadoYellow("ORDENANDO LISTA DE PRODUTOS POR PREÇO <"));
        produtoController.ordenadoPorPrecoCrescente();
        System.out.println(" ");
        Tools.pause(1);
        System.out.println(Tools.textoFormatadoYellow("ORDENANDO POR NOME"));
        produtoController.ordenadoPorNomeCrescente();
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoYellow("ORDENANDO LISTA DE PRODUTOS POR NOME <"));
        produtoController.ordenadoPorNomeDecrescente();
        System.out.println(" ");
        Tools.pause(1);
        System.out.println(Tools.textoFormatadoYellow("ORDENANDO LISTA DE PRODUTOS POR PREÇO <"));
        produtoController.ordenadoPorPrecoDecrecente();
        System.out.println(" ");
        Tools.pause(2);

        System.out.println(Tools.textoFormatadoYellow("VALIDANDO PAGAMENTO CLIENTE TODOS (BOLETO, CARTÃO CREDITO e PIX)"));
        pagamento.checkoutBoleto(sessaoClienteFisica, carrinho);
        System.out.println(" ");

        System.out.println(Tools.textoFormatadoBlue("ENCHENDO NOVAMENTE O CARRINHO"));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado2, 2));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado3, 1));
        System.out.println(Tools.textoFormatadoYellow("VALIDANDO PAGAMENTO NO PIX DENTRO DO LIMITE"));
        pagamento.checkoutPix(sessaoClienteFisica, carrinho);
        System.out.println(" ");


        System.out.println(Tools.textoFormatadoBlue("ENCHENDO NOVAMENTE O CARRINHO"));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado2, 19));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado3, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 17));
        System.out.println(Tools.textoFormatadoYellow("VALIDANDO PAGAMENTO NO PIX FORA DO LIMITE - ANTI-FRAUDE"));
        System.out.println(" ");
        pagamento.checkoutPix(sessaoClienteFisica, carrinho);
        System.out.println(" ");

        System.out.println(Tools.textoFormatadoBlue("ENCHENDO NOVAMENTE O CARRINHO"));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado2, 19));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado3, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 10));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 17));
        System.out.println(Tools.textoFormatadoYellow("VALIDANDO PAGAMENTO NO CARTÃO DE CREDITO FORA DO LIMITE - ANTI-FRAUDE"));
        System.out.println(" ");
        pagamento.checkoutCartaoCredito(sessaoClienteFisica, carrinho);
        System.out.println(" ");


        carrinho.esvaziarCarrinho();
        System.out.println(Tools.textoFormatadoBlue("ENCHENDO NOVAMENTE O CARRINHO"));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado2, 2));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado3, 1));
        System.out.println(Tools.textoFormatadoYellow("VALIDANDO PAGAMENTO NO CARTÃO DE CREDITO DENTRO DO LIMITE"));
        System.out.println(" ");
        pagamento.checkoutCartaoCredito(sessaoClienteFisica, carrinho);
        Tools.pause(2);


        System.out.println(" ");
        System.out.println(Tools.textoFormatadoBlue("ENCHENDO NOVAMENTE O CARRINHO"));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(informatica, 17));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado3, 13));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(livro, 13));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 12));
        carrinho.colocarProdutoCarrinho(carrinho.criarItem(mercado4, 14));
        System.out.println(Tools.textoFormatadoYellow("VALIDANDO PAGAMENTO CLIENTE PESSOA JURIDICA (FATURADO)"));
        System.out.println(" ");
        pagamento.checkoutFaturado(sessaoClienteJuridica, carrinho);

        System.out.println(" ");
        System.out.println(Tools.textoFormatadoPurple(".: FIM DA DEMOSTRAÇÃO :."));
        Tools.teclaEncerrar();


    }



}
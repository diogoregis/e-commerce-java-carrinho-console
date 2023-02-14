package br.com.eComCarrinho.controllers;

import br.com.eComCarrinho.models.FormaPagamento;
import br.com.eComCarrinho.models.Sessao;
import br.com.eComCarrinho.tools.Tools;

public class PagamentoController {

    public void checkoutPix(Sessao sessao, CarrinhoController carrinho){
        if(sessao.isSessaoAtiva()){
            if(FormaPagamento.pix(carrinho.totalValorCarrinho()) == -1){
                System.out.println("SISTEMA ANTI-FRAUDE: REPITA A OPERAÇÃO OU MUDE A FORMA DE PAGAMENTO");
            } else{
                System.out.println("TUDO OK, SÒ AGUARDAR AGORA");
                System.out.println(" O PAGAMENTO DE " + Tools.precoFormata(carrinho.totalValorCarrinho()) +  " no PIX");
                System.out.println("OBRIGADO !");
                carrinho.esvaziarCarrinho();
            }

        } else {
            System.out.println("FAÇA SEU LOGIN PARA PODER COMPRAR");
        }
    }

    public void checkoutBoleto(Sessao sessao, CarrinhoController carrinho){
        if(sessao.isSessaoAtiva()){
            if(FormaPagamento.boleto(carrinho.totalValorCarrinho()) == -1){
                System.out.println("SISTEMA ANTI-FRAUDE: REPITA A OPERAÇÃO OU MUDE A FORMA DE PAGAMENTO");
            } else{
                System.out.println("TUDO OK, SÒ AGUARDAR AGORA");
                System.out.println(" O PAGAMENTO DE " + Tools.precoFormata(carrinho.totalValorCarrinho()) + " no Boleto");
                System.out.println("OBRIGADO !");
                carrinho.esvaziarCarrinho();
            }

        } else {
            System.out.println("FAÇA SEU LOGIN PARA PODER COMPRAR");
        }
    }

}

package br.com.eComCarrinho;

import br.com.eComCarrinho.exception.AddProdutoException;
import br.com.eComCarrinho.tools.Sistema;

public class Main {

    public static void main(String[] args) throws AddProdutoException {

        Sistema sistema = new Sistema();

        sistema.iniciar();

    }

}

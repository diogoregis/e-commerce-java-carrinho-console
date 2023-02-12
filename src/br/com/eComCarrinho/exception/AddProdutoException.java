package br.com.eComCarrinho.exception;

public class AddProdutoException extends Exception {

    private int codigoErro;
    public AddProdutoException(int num){
        this.codigoErro = num;
    }


    public String e() {
        if(codigoErro == 1){
           return erroAddProduto();
        } else {
           return erroRemoveProduto();
        }
    }



    private String erroAddProduto(){
        return "Err 100: Falha ao tentar add produto, processo não realizado";
    }

    private String erroRemoveProduto(){
        return "Err 200: Falha ao tentar REMOVER produto, processo não realizado";
    }

}

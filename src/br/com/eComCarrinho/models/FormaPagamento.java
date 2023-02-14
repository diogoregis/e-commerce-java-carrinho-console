package br.com.eComCarrinho.models;

public class FormaPagamento {

    public static double boleto(double valor){
        if(validaBoleto(valor)){
            return valor;
        } else {
            return -1;
        }
    }

    public static double pix(double valor){
        if(validaPix(valor)){
            return valor;
        } else {
            return -1;
        }
    }
    public static boolean validaPix(double valor){
        if(valor <= 0){
            return false;
        } else if (valor >= 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validaBoleto(double valor){
        if(valor > 0){
            return true;
        } else {
            return false;
        }
    }

    public static double cartaoCredito(double valor){
        if(validaCartaoCredito(valor)){
            return valor;
        } else {
            return -1;
        }
    }
    public static boolean validaCartaoCredito(double valor){
        if(valor <= 0){
            return false;
        } else if (valor >= 2000) {
            return false;
        } else {
            return true;
        }
    }

    public static double faturado(double valor){
        if(validaCartaoCredito(valor)){
            return valor;
        } else {
            return -1;
        }
    }
    public static boolean validaFaturado(double valor){
        if(valor > 0){
            return true;
        } else {
            return false;
        }
    }

}

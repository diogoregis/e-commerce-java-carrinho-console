package br.com.eComCarrinho.tools;

import br.com.eComCarrinho.models.Sessao;

public class Menu {
    private static final Menu MENU = new Menu();
    private Menu(){};
    public static Menu getInstance(){
        return MENU;
    }

    public void head(){
        System.out.println(Tools.textoFormatadoRed("################################"));
        System.out.println(Tools.textoFormatadoRed("###########################0.7v#"));
    }

    public void quemLogou(Sessao sessao){
        System.out.println(" ");
        System.out.println(Tools.textoFormatadoRed("                    Olá, " + sessao.getUser().getNome().toUpperCase() + ". :D"));
        System.out.println(Tools.textoFormatadoRed("---------------------------"));
        System.out.println(" ");
    }

    private void imprimindoMSG() {
        System.out.println(Tools.textoFormatadoYellow("       ... Imprimindo ..."));
        System.out.println();
    }

}

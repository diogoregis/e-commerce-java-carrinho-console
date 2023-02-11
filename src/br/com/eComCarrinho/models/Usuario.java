package br.com.eComCarrinho.models;

public abstract class Usuario {

    private static int numId;
    private int id;
    private String nome;
    private boolean isAdm;
    public Usuario (String nome){
        this.id = proximoNum();
        this.nome = nome;
    }

    private int proximoNum(){
        return ++numId;
    }


}

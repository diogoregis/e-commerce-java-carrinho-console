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

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdm() {
        return isAdm;
    }

    public void setAdm(boolean adm) {
        isAdm = adm;
    }
}

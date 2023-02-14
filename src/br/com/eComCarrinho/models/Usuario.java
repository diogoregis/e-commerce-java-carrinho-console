package br.com.eComCarrinho.models;

public abstract class Usuario {

    private static int numId;
    private int id;
    private String nome;
    private String senha;
    private boolean isAdm;
    private boolean empresa;
    public Usuario (String nome, String senha){
        this.id = proximoNum();
        this.nome = nome;
        this.senha = senha;
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

    public boolean isEmpresa(){
        return empresa;
    }

    public void setEmpresa(boolean empresa) {
        this.empresa = empresa;
    }
}

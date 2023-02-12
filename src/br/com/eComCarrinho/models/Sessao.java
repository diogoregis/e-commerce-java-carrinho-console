package br.com.eComCarrinho.models;

public final class Sessao {
    private Usuario user;
    private boolean sessaoAtiva;
    private boolean userAdmin;

    public Sessao (Usuario usuario){
        this.user = usuario;
        this.sessaoAtiva = true;
        this.userAdmin = usuario.isAdm();

    }

    public Usuario getUser() {
        return user;
    }
    public boolean isSessaoAtiva() {
        return sessaoAtiva;
    }

    public void setSessaoAtiva(boolean sessaoAtiva) {
        this.sessaoAtiva = sessaoAtiva;
    }

    public boolean isUserAdmin() {
        return userAdmin;
    }

}

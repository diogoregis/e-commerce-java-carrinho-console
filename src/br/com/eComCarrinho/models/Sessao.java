package br.com.eComCarrinho.models;

public final class Sessao {
    private Usuario user;
    private boolean sessaoAtiva;

    public Sessao (Usuario usuario){
        this.user = usuario;
        this.sessaoAtiva = true;
    }

    public Usuario getUser() {
        return user;
    }
    public boolean isSessaoAtiva() {
        return sessaoAtiva;
    }
}

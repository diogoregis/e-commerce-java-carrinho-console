package br.com.eComCarrinho.controllers;

import br.com.eComCarrinho.models.Usuario;
import br.com.eComCarrinho.services.UsuarioService;

public class UsuarioController {
    private UsuarioService usuarioService = UsuarioService.getInstance();
    public boolean validaUsuarioAdm(Usuario usuario){
        return usuario.isAdm();
    }

    public void addUsuario(Usuario usuario){
        usuarioService.addUsuarioList(usuario);
    }

}

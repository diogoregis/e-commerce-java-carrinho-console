package br.com.eComCarrinho.controllers;

import br.com.eComCarrinho.models.Usuario;
import br.com.eComCarrinho.services.UsuarioService;

public class UsuarioController {

    private static final UsuarioController USUARIO_CONTROLLER = new UsuarioController();
    private UsuarioController(){}
    private UsuarioService usuarioService = UsuarioService.getInstance();
    public static UsuarioController getInstance(){
        return USUARIO_CONTROLLER;
    }

    public void validaUsuarioAdm(Usuario usuario){

    }
}

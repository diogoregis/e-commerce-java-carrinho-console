package br.com.eComCarrinho.services;

import br.com.eComCarrinho.dao.UsuariosDao;
import br.com.eComCarrinho.models.Usuario;
import br.com.eComCarrinho.repository.IUsuarioRepository;

import java.util.ArrayList;

public class UsuarioService implements IUsuarioRepository {
    private static final UsuarioService USUARIO_SERVICE = new UsuarioService();
    private UsuarioService(){}
    private UsuariosDao usuariosDao = UsuariosDao.getInstance();
    public static UsuarioService getInstance(){
        return USUARIO_SERVICE;
    }

    @Override
    public boolean addUsuarioList(Usuario usuario) {
        return usuariosDao.addUsuarioList(usuario);
    }
    @Override
    public Usuario retornaUsuario(String nome) {
        return usuariosDao.retornaUsuario(nome);
    }
    @Override
    public Usuario retornaUsuarioIndex(int index) {
        return usuariosDao.retornaUsuarioIndex(index);
    }
    @Override
    public ArrayList<Usuario> retornaListAll() {
        return usuariosDao.retornaListAll();
    }
}

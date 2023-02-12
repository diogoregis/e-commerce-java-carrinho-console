package br.com.eComCarrinho.dao;

import br.com.eComCarrinho.models.Usuario;
import br.com.eComCarrinho.repository.IUsuarioRepository;

import java.util.ArrayList;
import java.util.List;

public class UsuariosDao implements IUsuarioRepository {

    private static final UsuariosDao USUARIOS_DAO = new UsuariosDao();
    private static List<Usuario> usuarioList = new ArrayList<>();
    private UsuariosDao(){};
    public static UsuariosDao getInstance(){
        return USUARIOS_DAO;
    }

    @Override
    public boolean addUsuarioList(Usuario usuario) {
        return usuarioList.add(usuario);
    }

    @Override
    public Usuario retornaUsuario(String nome) {
        Usuario user = null;
        for (Usuario usuario: usuarioList) {
            if(usuario.getNome().toUpperCase().equals(nome.toUpperCase())){
                user = usuario;
                break;
            }
        };
        return user;
    }

    @Override
    public Usuario retornaUsuarioIndex(int index) {
        return null;
    }

    @Override
    public ArrayList<Usuario> retornaListAll() {
        return null;
    }
}

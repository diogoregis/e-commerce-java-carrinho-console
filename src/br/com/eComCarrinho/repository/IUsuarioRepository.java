package br.com.eComCarrinho.repository;

import br.com.eComCarrinho.models.Usuario;
import java.util.ArrayList;

public interface IUsuarioRepository<T extends Usuario> {

    public boolean addUsuarioList(T usuario);
    public Usuario retornaUsuario(String nome);
    public Usuario retornaUsuarioIndex(int index);
    public ArrayList<Usuario> retornaListAll();

}

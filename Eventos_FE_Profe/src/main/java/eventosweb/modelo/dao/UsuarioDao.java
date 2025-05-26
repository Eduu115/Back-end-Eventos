package eventosweb.modelo.dao;

import java.util.List;

import eventosweb.modelo.entities.Usuario;

public interface UsuarioDao {
	List<Usuario> findAll();
	Usuario findById(Integer refUsr);
	int deleteById(Integer refUsr);
	Usuario insertOne(Usuario usuario);
	int login(Usuario usuario);
	Usuario findByEmail(String email);
}

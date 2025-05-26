package eventosweb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import eventosweb.modelo.entities.Usuario;
import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	List<Usuario> findByEmailAndPassword(String email, String password);
	
}

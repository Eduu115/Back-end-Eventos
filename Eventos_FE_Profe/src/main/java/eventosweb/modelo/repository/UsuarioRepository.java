package eventosweb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import eventosweb.modelo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}

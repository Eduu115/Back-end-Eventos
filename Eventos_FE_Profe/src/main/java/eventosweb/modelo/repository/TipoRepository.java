package eventosweb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eventosweb.modelo.entities.Perfil;
import eventosweb.modelo.entities.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Integer>{

}

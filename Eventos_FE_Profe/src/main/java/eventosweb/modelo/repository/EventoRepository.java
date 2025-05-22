package eventosweb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eventosweb.modelo.entities.Destacado;
import eventosweb.modelo.entities.EstadoEvento;
import eventosweb.modelo.entities.Evento;
import java.util.List;

public interface EventoRepository extends JpaRepository<Evento, Integer>{
	List<Evento> findByDestacado(Destacado destacado);
	List<Evento> findByEstado(EstadoEvento estado);
	List<Evento> findByEstadoAndDestacado(EstadoEvento estado, Destacado destacado );
}

package eventosweb.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import eventosweb.modelo.entities.Reserva;
import eventosweb.modelo.entities.Evento;
import eventosweb.modelo.entities.Usuario;


public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
	List<Reserva> findByUsuario(Usuario usuario);
}

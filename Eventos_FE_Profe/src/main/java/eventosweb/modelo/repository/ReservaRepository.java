package eventosweb.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import eventosweb.modelo.entities.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
	public List<Reserva> findByEventoIdEvento(Integer idEvento);

}

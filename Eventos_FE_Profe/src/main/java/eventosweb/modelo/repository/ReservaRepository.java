package eventosweb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import eventosweb.modelo.entities.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}

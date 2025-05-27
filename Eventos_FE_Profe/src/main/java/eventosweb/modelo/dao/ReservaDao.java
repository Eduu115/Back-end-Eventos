package eventosweb.modelo.dao;

import java.util.List;

import eventosweb.modelo.entities.Reserva;

public interface ReservaDao  {
	List<Reserva> todos();
	Reserva buscarUno(Integer idReserva);
	List<Reserva> reservasPorUsuario(Integer idUsuario);
}

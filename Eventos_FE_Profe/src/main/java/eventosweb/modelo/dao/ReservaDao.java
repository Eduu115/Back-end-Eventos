package eventosweb.modelo.dao;

import java.util.List;

import eventosweb.modelo.entities.Reserva;
import eventosweb.modelo.entities.ReservaDTO;

public interface ReservaDao  {
	List<Reserva> todos();
	Reserva buscarUno(Integer idReserva);
	List<Reserva> reservasPorUsuario(Integer idUsuario);
	int eliminar(Integer idReserva);
	Reserva insertarUno(Reserva reserva);
}

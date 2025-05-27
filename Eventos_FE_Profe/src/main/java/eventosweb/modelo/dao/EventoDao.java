package eventosweb.modelo.dao;

import java.util.List;
import eventosweb.modelo.entities.Evento;
import eventosweb.modelo.entities.Reserva;

public interface EventoDao {
	Evento buscarUno(Integer idEvento);
	List<Evento> todos();
	List<Evento> porDestacado(String referenciaDestacado);
	List<Evento> porEstado(String referenciaEstado);
	int deleteById(Integer id);
	Evento insertOne(Evento evento);
	List<Evento> porEstadoAndDestacado(String referenciaDestacado);
	Evento actualizar(Evento evento);
}

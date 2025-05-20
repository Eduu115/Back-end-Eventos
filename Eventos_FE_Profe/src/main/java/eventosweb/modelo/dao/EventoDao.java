package eventosweb.modelo.dao;

import java.util.List;

import eventosweb.modelo.entities.Evento;

public interface EventoDao {
	Evento buscarUno(Integer idEvento);
	List<Evento> todos();
	List<Evento> porDestacado(String referenciaDestacado);
	List<Evento> porEstado(String referenciaEstado);
	int deleteById(Integer id);
}

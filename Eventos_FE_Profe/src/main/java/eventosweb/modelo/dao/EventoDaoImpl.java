package eventosweb.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventosweb.modelo.entities.Destacado;
import eventosweb.modelo.entities.EstadoEvento;
import eventosweb.modelo.entities.Evento;
import eventosweb.modelo.repository.EventoRepository;

@Service
public class EventoDaoImpl implements EventoDao{

	@Autowired
	EventoRepository edao;
	
	@Override
	public Evento buscarUno(Integer idEvento) {
		return edao.findById(idEvento).orElse(null);
	}

	@Override
	public List<Evento> todos() {
		return edao.findAll();
	}

	@Override
	public List<Evento> porDestacado(String referenciaDestacado) {
		return edao.findByDestacado(Destacado.valueOf(referenciaDestacado));
	}

	@Override
	public List<Evento> porEstado(String referenciaEstado) {
		return edao.findByEstado(EstadoEvento.valueOf(referenciaEstado));
	}

	@Override
	public int deleteById(Integer id) {
		try {
			if(edao.findById(id).orElse(null)==null)
				return 0; // no existe o es nulo
			
			edao.deleteById(id);
			return 1; // todo va bien

		} catch (Exception e) {
			return -1; //excepcion no se persiste
		}
	}

	@Override
	public Evento insertOne(Evento evento) {
		try {
			return edao.save(evento);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Evento> porEstadoAndDestacado(String referenciaDestacado) { // Siemore queremos el activo en este metodo
		return edao.findByEstadoAndDestacado(EstadoEvento.ACTIVO, Destacado.valueOf(referenciaDestacado));
	}

	
	
}

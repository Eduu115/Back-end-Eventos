package eventosweb.modelo.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventosweb.modelo.entities.Evento;
import eventosweb.modelo.entities.Reserva;
import eventosweb.modelo.repository.EventoRepository;
import eventosweb.modelo.repository.ReservaRepository;
@Service
public class ReservaDaoImpl implements ReservaDao {
	@Autowired
	ReservaRepository rdao;
	

	@Override
	public List<Reserva> todos() {
		// TODO Auto-generated method stub
		return rdao.findAll();
	}

	@Override
	public Reserva buscarUno(Integer idReserva) {
		// TODO Auto-generated method stub
		return rdao.findById(idReserva).orElse(null);
	}

	@Override
	public List<Reserva> reservasPorEvento(Integer idEvento) {
	    return rdao.findByEventoIdEvento(idEvento);
	}

	
}

package eventosweb.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventosweb.modelo.entities.Reserva;
import eventosweb.modelo.repository.ReservaRepository;

@Service
public class ReservaDaoImpl implements ReservaDao {
	@Autowired
	ReservaRepository rrepo;
	@Autowired
	UsuarioDao udao;

	@Override
	public List<Reserva> todos() {
		// TODO Auto-generated method stub
		return rrepo.findAll();
	}

	@Override
	public Reserva buscarUno(Integer idReserva) {
		// TODO Auto-generated method stub
		return rrepo.findById(idReserva).orElse(null);
	}

	@Override
	public List<Reserva> reservasPorUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return rrepo.findByUsuario(udao.findById(idUsuario));
	}
	
}

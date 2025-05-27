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
	@Override
	public int eliminar(Integer idReserva) {
		try {
			if(rrepo.findById(idReserva).orElse(null)==null)
				return 0; 
			
			rrepo.deleteById(idReserva);
			return 1; 

		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public Reserva insertarUno(Reserva reserva) {
		// TODO Auto-generated method stub
		try {
			return rrepo.save(reserva);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Reserva actualizar(Reserva reserva) {
		// TODO Auto-generated method stub
		try {
			return rrepo.save(reserva);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

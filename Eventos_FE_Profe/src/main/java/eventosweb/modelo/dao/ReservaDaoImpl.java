package eventosweb.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventosweb.modelo.entities.Reserva;
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

	@Override
	public int deleteById(Integer idReserva) {
		// TODO Auto-generated method stub
		try {
			if (rdao.findById(idReserva).orElse(null) == null)
				return 0; // no existe o es nulo

			rdao.deleteById(idReserva);
			return 1; // todo va bien

		} catch (Exception e) {
			return -1; // excepcion no se persiste
		}
	}

	@Override
	public Reserva actualizar(Integer idReserva, Reserva nuevaReserva) {
		// TODO Auto-generated method stub
		try {
			Reserva reservaExistente = rdao.findById(idReserva).orElse(null);
			if (reservaExistente != null) {
				reservaExistente.setUsuario(nuevaReserva.getUsuario());
				reservaExistente.setEvento(nuevaReserva.getEvento());
				reservaExistente.setPrecioVenta(nuevaReserva.getPrecioVenta());
				reservaExistente.setObservaciones(nuevaReserva.getObservaciones());
				reservaExistente.setCantidad(nuevaReserva.getCantidad());

				return rdao.save(reservaExistente);
			} else {
				return null;

			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Reserva insertar(Reserva nuevaReserva) {
		// TODO Auto-generated method stub
		try {
			return rdao.save(nuevaReserva);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

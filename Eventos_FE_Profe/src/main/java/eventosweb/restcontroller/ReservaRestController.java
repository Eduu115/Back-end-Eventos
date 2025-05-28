package eventosweb.restcontroller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventosweb.modelo.dao.EventoDao;
import eventosweb.modelo.dao.ReservaDao;
import eventosweb.modelo.dao.UsuarioDao;
import eventosweb.modelo.entities.Evento;
import eventosweb.modelo.entities.Reserva;
import eventosweb.modelo.entities.ReservaDTO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reserva")
public class ReservaRestController {
	@Autowired
	private ReservaDao rdao;

    @Autowired
    private EventoDao edao;

    @Autowired
    private UsuarioDao udao;
	
	@GetMapping("/todos")
	public List<Reserva> todos(){
		return rdao.todos();
	}
	
	@GetMapping("/uno/{idReserva}")
	public Reserva uno(@PathVariable Integer idReserva){
		return rdao.buscarUno(idReserva);
	}
	
	@GetMapping("/usuario/{idUsuario}")
	public List<Reserva> reservasPorUsuario(@PathVariable Integer idUsuario) {
	    return rdao.reservasPorUsuario(idUsuario);
	}
	
	@GetMapping("/evento/{idEvento}")
	public List<Reserva> reservasPorEvento(@PathVariable Integer idEvento) {
	    return rdao.reservasPorEvento(idEvento);
	}
	
	@DeleteMapping("/eliminar/{idReserva}")
	public int eliminar(@PathVariable Integer idReserva){
		return rdao.eliminar(idReserva);
	}
	
	@PostMapping("/altaReserva")
	public Reserva altaReserva(@RequestBody ReservaDTO dto) {
      Reserva reserva = new Reserva();

      reserva.setCantidad(dto.getCantidad());
      reserva.setObservaciones(dto.getObservaciones());
      reserva.setPrecioVenta(dto.getPrecioVenta());

      reserva.setEvento(edao.buscarUno(dto.getIdEvento()));
      reserva.setUsuario(udao.findById(dto.getIdUsuario()));

      return rdao.insertarUno(reserva);
  }
	
	@PutMapping("/actualizar/{idReserva}")
	public Reserva actualizar(@PathVariable Integer idReserva, @RequestBody ReservaDTO dto) {
	    Reserva reserva = rdao.buscarUno(idReserva);
	    if (reserva == null) return null;

	    reserva.setCantidad(dto.getCantidad());
	    reserva.setObservaciones(dto.getObservaciones());
	    reserva.setPrecioVenta(dto.getPrecioVenta());
	    reserva.setEvento(edao.buscarUno(dto.getIdEvento()));
	    reserva.setUsuario(udao.findById(dto.getIdUsuario()));

	    return rdao.actualizar(reserva);
	}


}


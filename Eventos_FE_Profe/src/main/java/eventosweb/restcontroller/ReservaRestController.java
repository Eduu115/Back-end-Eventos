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

import eventosweb.modelo.dao.ReservaDao;
import eventosweb.modelo.entities.Reserva;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reserva")
public class ReservaRestController {
	@Autowired
	private ReservaDao rdao;
	
	
	@GetMapping("/todos")
	public List<Reserva> todos(){
		return rdao.todos();
	}
	
	@GetMapping("/uno/{idReserva}")
	public Reserva uno(@PathVariable Integer idReserva){
		return rdao.buscarUno(idReserva);
	}
	
	@GetMapping("/evento/{idEvento}")
	public List<Reserva> reservasPorEvento(@PathVariable Integer idEvento) {
	    return rdao.reservasPorEvento(idEvento);
	}
	
	@PostMapping("/insertar")
	public Reserva insertar(@RequestBody Reserva nuevaReserva) {
	    return rdao.insertar(nuevaReserva);
	}
	
	@PutMapping("/actualizar/{idReserva}")
	public Reserva actualizar(@PathVariable Integer idReserva, @RequestBody Reserva nuevaReserva) {
	    return rdao.actualizar(idReserva, nuevaReserva);
	}
	
	@DeleteMapping("/eliminar/{idReserva}")
	public int eliminar(@PathVariable Integer idReserva) {
	    return rdao.deleteById(idReserva);
	}

}


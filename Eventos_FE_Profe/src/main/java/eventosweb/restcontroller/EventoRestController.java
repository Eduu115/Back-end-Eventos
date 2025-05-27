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
import eventosweb.modelo.entities.Destacado;
import eventosweb.modelo.entities.EstadoEvento;
import eventosweb.modelo.entities.Evento;
import eventosweb.modelo.entities.EventoDTO;
import eventosweb.modelo.entities.Reserva;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/evento")
public class EventoRestController {

	@Autowired
	private EventoDao edao;
	
	@GetMapping("/todos")
	public List<Evento> todos(){
		return edao.todos();
	}
	
	@GetMapping("/uno/{idEvento}")
	public Evento uno(@PathVariable Integer idEvento){
		return edao.buscarUno(idEvento);
	}
	
	@GetMapping("/destacado/{referenciaDestacado}")
	public List<Evento> porDestacado(@PathVariable String referenciaDestacado){
		return edao.porDestacado(referenciaDestacado);
	}
	
	@GetMapping("/estado/{referenciaEstado}")
	public List<Evento> porEstado(@PathVariable String referenciaEstado){
		return edao.porEstado(referenciaEstado);
	}
	
	@GetMapping("/activoAndDestacado/{referenciaDestacado}")
	public List<Evento> porActivoYDestacado(@PathVariable String referenciaDestacado){
		return edao.porEstadoAndDestacado(referenciaDestacado); //return edao.porActivoYDesta
	}
	
	@DeleteMapping("/eliminar/{idEvento}")
	public int eliminar(@PathVariable Integer idEvento) {
		return edao.deleteById(idEvento);
	}
	@PostMapping("/crearEvento")
	public Evento alta(@RequestBody Evento evento) {
		return edao.insertOne(evento);
	}
	
	@PutMapping("/actualizar/{idEvento}")
	public Evento actualizarEvento(@PathVariable Integer idEvento, @RequestBody EventoDTO dto) {
	    Evento evento = edao.buscarUno(idEvento);
	    if (evento == null) return null;

	    evento.setNombre(dto.getNombre());
	    evento.setDescripcion(dto.getDescripcion());
	    evento.setFechaInicio(dto.getFechaInicio());
	    evento.setDuracion(dto.getDuracion());
	    evento.setDireccion(dto.getDireccion());
	    evento.setAforoMaximo(dto.getAforoMaximo());
	    evento.setPrecio(dto.getPrecio());
	    evento.setEstado(dto.getEstado());          
	    evento.setDestacado(dto.getDestacado());     

	    return edao.actualizar(evento);
	}


}

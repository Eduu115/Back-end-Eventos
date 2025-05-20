package eventosweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventosweb.modelo.dao.EventoDao;
import eventosweb.modelo.entities.Evento;

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
	public Evento uno(@PathVariable Integer idPerfil){
		return edao.buscarUno(idPerfil);
	}
	
	@GetMapping("/destacado/{referenciaDestacado}")
	public List<Evento> porDestacado(@PathVariable String referenciaDestacado){
		return edao.porDestacado(referenciaDestacado);
	}
	
	@GetMapping("/estado/{referenciaEstado}")
	public List<Evento> porEstado(@PathVariable String referenciaEstado){
		return edao.porEstado(referenciaEstado);
	}
	@DeleteMapping("/eliminar/{idEvento}")
	public int eliminar(@PathVariable Integer idEvento) {
		return edao.deleteById(idEvento);
	}
	@PostMapping("/crearEvento")
	public Evento alta(@RequestBody Evento evento) {
		return edao.insertOne(evento);
	}
}

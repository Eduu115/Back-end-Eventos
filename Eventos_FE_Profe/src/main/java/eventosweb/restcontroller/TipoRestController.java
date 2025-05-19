package eventosweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventosweb.modelo.dao.PerfilDao;
import eventosweb.modelo.entities.Perfil;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tipo")
public class TipoRestController {

	@Autowired
	private PerfilDao pdao;
	
	@GetMapping("/todos")
	public List<Perfil> todos(){
		return pdao.todos();
	}
	@GetMapping("/uno/{idTipo}")
	public Perfil uno(@PathVariable Integer idTipo){
		return pdao.buscarUno(idTipo);
	}
	
	
}

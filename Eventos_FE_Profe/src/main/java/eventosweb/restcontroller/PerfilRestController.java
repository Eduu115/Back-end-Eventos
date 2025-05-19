package eventosweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventosweb.modelo.dao.PerfilDao;
import eventosweb.modelo.entities.Perfil;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/perfil")
public class PerfilRestController {
	@Autowired
	private PerfilDao pdao;
	
	@GetMapping("/todos")
	public List<Perfil> todos(){
		return pdao.todos();
	}
	
	@GetMapping("/nombre/{cadena}")
	public List<Perfil> subcadena(@PathVariable String cadena){
		return pdao.porNombreContain(cadena);
	}
	
	@GetMapping("/uno/{idPerfil}")
	public Perfil uno(@PathVariable Integer idPerfil){
		return pdao.buscarUno(idPerfil);
	}
	
	@PostMapping("/alta")
	public Perfil alta(@RequestBody Perfil perfil){
		return pdao.insertOne(perfil);
	}

}

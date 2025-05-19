package eventosweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import eventosweb.modelo.dao.PerfilDao;
import eventosweb.modelo.entities.Perfil;

@RestController
@CrossOrigin(origins = "*")
public class PruebaRestController {
	
	@Autowired
	private PerfilDao pdao;
	
	@GetMapping("/todos")
	public List<Perfil> todos(){
		return pdao.todos();
	}

}

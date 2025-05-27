package eventosweb.restcontroller;

import java.time.LocalDate;
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

import eventosweb.modelo.dao.PerfilDao;
import eventosweb.modelo.dao.UsuarioDao;
import eventosweb.modelo.entities.Usuario;
import eventosweb.modelo.entities.UsuarioDTO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")
public class UsuarioRestController {

	@Autowired
	private UsuarioDao udao;
	
	@Autowired
	private PerfilDao pdao;
	
	@GetMapping("/todos")
	public List<Usuario> todos(){
		return udao.findAll();
	}
	
	@GetMapping("/uno/{idUsuario}")
	public Usuario uno(@PathVariable Integer idUsuario){
		return udao.findById(idUsuario);
	}
	
	@DeleteMapping("/baja/{idUsuario}")
	public int eliminar(@PathVariable Integer idUsuario) {
		return udao.deleteById(idUsuario);
	}
	@PostMapping("/alta")
	public Usuario alta(@RequestBody Usuario usuario) {
		usuario.setEnabled(1);
		usuario.setFechaRegistro(LocalDate.now());
		usuario.setPerfil(pdao.buscarUno(2));
		return udao.insertOne(usuario);
	}
	
	@PutMapping("/actualizar/{idUsuario}")
	public Usuario actualizar(@PathVariable Integer idUsuario, @RequestBody UsuarioDTO dto) {
	    Usuario usuario = udao.findById(idUsuario);
	    if (usuario == null) return null;

	    usuario.setEmail(dto.getEmail());
	    usuario.setNombre(dto.getNombre());
	    usuario.setApellidos(dto.getApellidos());

	    return udao.update(usuario);
	}

	
}

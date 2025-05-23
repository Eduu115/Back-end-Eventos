package eventosweb.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventosweb.modelo.entities.Usuario;
import eventosweb.modelo.repository.UsuarioRepository;
@Service
public class UsuarioDaoImpl implements UsuarioDao{

	@Autowired
	private UsuarioRepository urepo;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	@Override
	public Usuario findById(Integer refUsr) {
		// TODO Auto-generated method stub
		return urepo.findById(refUsr).orElse(null);
	}

	@Override
	public int deleteById(Integer refUsr) {
		try {
			if(urepo.findById(refUsr).orElse(null)==null)
				return 0; // no existe o es nulo
			
			urepo.deleteById(refUsr);
			return 1; // todo va bien

		} catch (Exception e) {
			return -1; //excepcion no se persiste
		}
	}

	@Override
	public Usuario insertOne(Usuario usuario) {
		try {
			return urepo.save(usuario);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}

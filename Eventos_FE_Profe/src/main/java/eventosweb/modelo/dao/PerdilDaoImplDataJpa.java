package eventosweb.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventosweb.modelo.entities.Perfil;
import eventosweb.modelo.repository.PerfilRepository;
@Service
public class PerdilDaoImplDataJpa implements PerfilDao{
	@Autowired
	private PerfilRepository prepo;
	@Override
	public List<Perfil> todos() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}
	@Override
	public List<Perfil> porNombreContain(String cadena) {
		// TODO Auto-generated method stub
		return prepo.findByNombreContaining(cadena);
	}
	@Override
	public Perfil insertOne(Perfil perfil) {
		try {
			return prepo.save(perfil);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public Perfil buscarUno(Integer idPerfil) {
		// TODO Auto-generated method stub
		return prepo.findById(idPerfil).orElse(null);
	}

}

package eventosweb.modelo.dao;

import java.util.List;

import eventosweb.modelo.entities.Perfil;

public interface PerfilDao {
	
	List<Perfil> todos();
	List<Perfil> porNombreContain(String cadena);
	Perfil insertOne(Perfil perfil);
	Perfil buscarUno(Integer idPerfil);
	
	

}

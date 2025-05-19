package eventosweb.modelo.dao;

import java.util.List;

import eventosweb.modelo.entities.Tipo;

public interface TipoDao {
	List<Tipo> todos();
	Tipo buscarUno(Integer idTipo);	
}

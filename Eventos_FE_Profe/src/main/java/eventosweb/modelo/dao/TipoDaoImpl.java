package eventosweb.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eventosweb.modelo.entities.Tipo;
import eventosweb.modelo.repository.TipoRepository;

public class TipoDaoImpl implements TipoDao{

	@Autowired
	private TipoRepository tdao;
	
	@Override
	public List<Tipo> todos() {
		return tdao.findAll();
	}

	@Override
	public Tipo buscarUno(Integer idTipo) {
		return tdao.findById(idTipo).orElse(null);
	}

}

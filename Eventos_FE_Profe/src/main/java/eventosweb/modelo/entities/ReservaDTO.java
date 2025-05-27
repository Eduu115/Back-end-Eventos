package eventosweb.modelo.entities;

import org.springframework.beans.factory.annotation.Autowired;

import eventosweb.modelo.dao.EventoDao;
import eventosweb.modelo.dao.ReservaDao;
import eventosweb.modelo.dao.UsuarioDao;

public class ReservaDTO {

	private Integer idUsuario;
	private Integer idEvento;
	private Double precioVenta;
	private String observaciones;
	private Integer cantidad;
	
	@Autowired
	EventoDao edao;
	@Autowired
	UsuarioDao udao;
	
	public ReservaDTO(Integer idUsuario, Integer idEvento, Double precioVenta, String observaciones, Integer cantidad) {
		super();
		this.idUsuario = idUsuario;
		this.idEvento = idEvento;
		this.precioVenta = precioVenta;
		this.observaciones = observaciones;
		this.cantidad = cantidad;
	}


	public ReservaDTO() {
		super();
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Integer getIdEvento() {
		return idEvento;
	}


	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}


	public Double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Reserva pasarReserva() {
		Reserva reserva = new Reserva();
		
		reserva.setCantidad(this.cantidad);
		reserva.setObservaciones(this.observaciones);
		reserva.setPrecioVenta(this.precioVenta);
		
		reserva.setEvento(edao.buscarUno(this.idEvento));
		reserva.setUsuario(udao.findById(this.idUsuario));
		
		return reserva;
	}
	
}

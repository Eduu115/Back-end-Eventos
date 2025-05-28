package eventosweb.modelo.entities;

public class ReservaDTOUpdate {
	private String observaciones;
	private Integer cantidad;
	public ReservaDTOUpdate(String observaciones, Integer cantidad) {
		super();
		this.observaciones = observaciones;
		this.cantidad = cantidad;
	}
	public ReservaDTOUpdate() {
		super();
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
	
	
}

package eventosweb.modelo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="RESERVAS")
public class Reserva implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_RESERVA")
	private Integer idReserva;
	
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;
	
	@Column(name="PRECIO_VENTA")
	private Double precioVenta;
	
	private String observaciones;
	private Integer cantidad;
	
	private void Reservas() {
		// TODO Auto-generated method stub

	}

	public Reserva(Integer idReserva, Usuario usuario, Evento evento, Double precioVenta, String observaciones,
			Integer cantidad) {
		super();
		this.idReserva = idReserva;
		this.usuario = usuario;
		this.evento = evento;
		this.precioVenta = precioVenta;
		this.observaciones = observaciones;
		this.cantidad = cantidad;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
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

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", usuario=" + usuario + ", evento=" + evento + ", precioVenta="
				+ precioVenta + ", observaciones=" + observaciones + ", cantidad=" + cantidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idReserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reserva))
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(idReserva, other.idReserva);
	}
	
	

}

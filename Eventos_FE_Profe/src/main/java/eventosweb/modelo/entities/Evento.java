package eventosweb.modelo.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="EVENTOS")
public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_EVENTO")
	private Integer idEvento;
	private String nombre;
	private String descripcion;
	
	@Column(name="FECHA_INICIO")
	@Temporal(TemporalType.DATE)
	private LocalDate fechaInicio;
	@Enumerated(EnumType.STRING)
	@Column(name="UNIDAD_DURACION")
	private UnidadDuracion unidadDuracion;
	private Integer duracion;
	private String direccion;
	
	@Column(name="AFORO_MAXIMO")
	private Integer aforoMaximo;
	
	@Enumerated(EnumType.STRING)
	private EstadoEvento estado;
	
	@Enumerated(EnumType.STRING)
	private Destacado destacado;
	
	private Double precio;
	
	@ManyToOne
    @JoinColumn(name="ID_TIPO")
	private Tipo tipo;
	
	@Column(name="FECHA_ALTA")
	@Temporal(TemporalType.DATE)
	private LocalDate fechaAlta;
	
	public Evento() {
		// TODO Auto-generated constructor stub
	}

	public Evento(Integer idEvento, String nombre, String descripcion, LocalDate fechaInicio,
			UnidadDuracion unidadDuracion, Integer duracion, String direccion, Integer aforoMaximo, EstadoEvento estado,
			Destacado destacado, Double precio, Tipo tipo, LocalDate fechaAlta) {
		super();
		this.idEvento = idEvento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.unidadDuracion = unidadDuracion;
		this.duracion = duracion;
		this.direccion = direccion;
		this.aforoMaximo = aforoMaximo;
		this.estado = estado;
		this.destacado = destacado;
		this.precio = precio;
		this.tipo = tipo;
		this.fechaAlta = fechaAlta;
	}

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public UnidadDuracion getUnidadDuracion() {
		return unidadDuracion;
	}

	public void setUnidadDuracion(UnidadDuracion unidadDuracion) {
		this.unidadDuracion = unidadDuracion;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(Integer aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}

	public EstadoEvento getEstado() {
		return estado;
	}

	public void setEstado(EstadoEvento estado) {
		this.estado = estado;
	}

	public Destacado getDestacado() {
		return destacado;
	}

	public void setDestacado(Destacado destacado) {
		this.destacado = destacado;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaInicio="
				+ fechaInicio + ", unidadDuracion=" + unidadDuracion + ", duracion=" + duracion + ", direccion="
				+ direccion + ", aforoMaximo=" + aforoMaximo + ", estado=" + estado + ", destacado=" + destacado
				+ ", precio=" + precio + ", tipo=" + tipo + ", fechaAlta=" + fechaAlta + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEvento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Evento))
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(idEvento, other.idEvento);
	}
	
	

}

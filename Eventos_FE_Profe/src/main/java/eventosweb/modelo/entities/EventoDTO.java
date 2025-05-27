package eventosweb.modelo.entities;

import java.time.LocalDate;

public class EventoDTO {
	private String nombre;
	private String descripcion;
	private LocalDate fechaInicio;
	private Integer duracion;
	private String direccion;
	private Integer aforoMaximo;
	private Double precio;
	private EstadoEvento estado;     
	private Destacado destacado;
	
	public EventoDTO(String nombre, String descripcion, LocalDate fechaInicio, Integer duracion, String direccion,
			Integer aforoMaximo, Double precio, EstadoEvento estado, Destacado destacado) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.direccion = direccion;
		this.aforoMaximo = aforoMaximo;
		this.precio = precio;
		this.estado = estado;
		this.destacado = destacado;
	}

	public EventoDTO() {
		super();
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
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
   
    
    
    
}

package eventosweb.modelo.entities;

public class UsuarioDTO {
    private String email;
    private String nombre;
    private String apellidos;
	
    public UsuarioDTO(String email, String nombre, String apellidos) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public UsuarioDTO() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
    
    
    
}

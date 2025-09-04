package sena.springbootapp.dto;

public class ClaseDTO {
    private String titulo, usuario;

	public ClaseDTO(String titulo, String usuario) {
		super();
		this.titulo = titulo;
		this.usuario = usuario;
	}
	public ClaseDTO() {
		super();

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}

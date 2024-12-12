package Deportes;

public class DeportistaPro extends Deportista {

	private String nivel;
	
	public DeportistaPro(String nombre, String deporte, String nivel) {
		super(nombre, deporte);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}

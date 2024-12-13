package Deportes;

public class DeportistaPro extends Deportista {

	private String nivel;
	
	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public DeportistaPro(String nombre, String apellido, int edad, String deporte, String nivel) {
		super(nombre, apellido, edad, deporte);
		this.nivel = nivel;
	}

	@Override
	public void caminar() {
		System.out.println("camina a 9km/h");
	}

	
	
}

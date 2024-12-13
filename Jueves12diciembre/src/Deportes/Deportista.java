package Deportes;

public class Deportista extends Persona {
	
	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public Deportista(String nombre, String apellido, int edad, String deporte) {
		super(nombre, apellido, edad);
		this.deporte = deporte;
	}

	@Override
	public void caminar() {
		System.out.println("camina a 7km/h");
	}

	
	
	

}

import java.util.ArrayList;

public class TuristaRico {

	private ArrayList<Maleta> maletas = new ArrayList<Maleta>();
	private String nombre;
	private String apellido;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Maleta> getMaletas() {
		return maletas;
	}

	public void setMaletas(ArrayList<Maleta> maletas) {
		this.maletas = maletas;
	}

	public TuristaRico(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void addMaleta(Maleta m) {
		maletas.add(m);
	}

}

package jueves;

public class Maleta {

	private String marca;
	private double peso;
	private double alto;
	private double largo;
	private double ancho;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	
	
	public Maleta(String marca, double peso, double alto, double largo, double ancho) {
		super();
		this.marca = marca;
		this.peso = peso;
		this.alto = alto;
		this.largo = largo;
		this.ancho = ancho;
	}
	
	
}

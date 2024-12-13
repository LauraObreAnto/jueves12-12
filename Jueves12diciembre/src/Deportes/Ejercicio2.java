package Deportes;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Persona pepe=Factoriadepersonas.crearPersona("x","Pepe","Lopez",20);
		pepe.caminar();
		System.out.println(pepe.getClass());
		System.out.println(pepe.getApellido());
		DeportistaPro pepereal= (DeportistaPro)pepe;
		pepereal.caminar();
		System.out.println(pepereal.getDeporte());
		
	}

}

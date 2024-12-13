package Deportes;

public class Factoriadepersonas {
	
	public static Persona crearPersona(String tipo,String nombre, String apellido, int edad) {
		
		if(tipo.equals("persona")) {
			return new Persona(nombre,apellido,edad);}
		else if(tipo.equals("deportista")) {
			return new Deportista(nombre,apellido,edad,"Padel");}
		else  {
			return new DeportistaPro(nombre,apellido,edad,"Padel","Senior");}
	
	

}
}

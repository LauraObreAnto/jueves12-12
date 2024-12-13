package Deportes;

public class Ejerciciodeporte {

	public static void main(String[] args) {
		Persona persona=new Persona("Marcos","Suarez",27);
		Deportista amateur=new Deportista("Lucia","Martin",19,"Natación");
		DeportistaPro deportista=new DeportistaPro("Pepe","Fernandez",20,"Atletismo","Senior");
		System.out.print(persona.getNombre()+ " " +persona.getApellido()+ ", "+persona.getEdad()+" años, "); persona.caminar();
		System.out.print(amateur.getNombre()+ " "+amateur.getApellido()+ ", "+amateur.getEdad()+ " años, "+amateur.getDeporte()+ ", "); amateur.caminar();
		System.out.print(deportista.getNombre()+ " "+deportista.getApellido()+ ", "+deportista.getEdad()+ " años, "+deportista.getDeporte()+ ", "); deportista.caminar();
		

	}

}

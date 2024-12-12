package jueves;
import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		TuristaRico pepito=new TuristaRico("Marcos","Perez");
		
		Maleta cabina=new Maleta ("Samsonite",10,50,30,20);
		Maleta grande=new Maleta ("Benzi",23,120,120,80);
		Maleta bolso=new Maleta ("Gucci",5,15,10,5);
		
		pepito.addMaleta(cabina);
		pepito.addMaleta(grande);
		pepito.addMaleta(bolso);
		
		ArrayList<Maleta> maletas=pepito.getMaletas();
		
		for (Maleta maleta:maletas) {
			
			System.out.println(maleta.getMarca());
			System.out.println(maleta.getPeso());
			
		}
			
			
			
		
			
		}
	

	

}

/**
 *
 * @author Alvarado Camacho Andrea
 * @version 1.0
 */
public class Pruba{
	public static void main (String[] pps){
		String saludo = "Hola";
		String nombre = "Ana Sofia";
		String primerN = nombre.substring(0,3);

		if (primerN == nombre.substring(0,3)) {
 			System.out.println("Hay un primer nombre");
		} else if (saludo + nombre == saludo + primerN) {
  			System.out.println("No hay un primer nombre");
		} else {
  			System.out.println("hmmm...no se que pasa");
		}
	}
}
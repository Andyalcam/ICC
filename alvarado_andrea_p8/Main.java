/**
 * 
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */

// Importar las clases y paquetes necesarios
import especies.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] pps){

// Creación de objetos nuevos y declaración de variables

		Animal animal = new Animal("Perro", "Canis Lupus Familiaris", "Animalia","Mammalia", "Carnivora");
		Plantae planta = new Plantae("Tulipan", "Tulipa L.", "Plantae", "Liliopsida","Liliales");
		Fungi hongo = new Fungi("Portobello", "Agaricus Bisporus", "Fungi","Agaricomycetes", "Agaricales");
		Scanner in = new Scanner(System.in);
		int res;

// Petición al usuario para elegir especie

		System.out.println("\n       ***Tenemos tres especies para mostrar***");
		System.out.print("\nDime que especie quieres ver (1-Animal,2-Plantae,3-Fungi): ");
		res = in.nextInt();

// Condiciones para la opcion requerida
		if(res==1){
			System.out.println("\nANIMAL\n"+animal.toString()+"\n");
		}
		else
			if(res==2){
				System.out.println("\nPLANTA\n"+planta.toString()+"\n");
			}
			else
				if(res==3){
					System.out.println("\nFUNGI\n"+hongo.toString()+"\n");
				}
				else
					System.out.println("\nEl numero ingresado no es valido :c\n");
	}
}
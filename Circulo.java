/** 
* Circulo 
* Clase que muestra en pantalla el área y perímetro de un circulo
* @author Andrea Alvarado Camacho
* @version 1.0
*/

public class Circulo{
	public static void main(String args []){

int radio = 5;
double pi = 3.1416;
double perimetro, area;

perimetro = 2 * pi * radio;
area = pi * radio * radio;

		System.out.println("*** Area y Perimetro ***");
		System.out.println("El perimetro del circulo es: " +perimetro);
		System.out.println("El area del circulo es: " +area);
		}
}	
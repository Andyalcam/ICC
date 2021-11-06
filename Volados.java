import java.util.Objects;
import java.util.Scanner;
/**
* Programa para que el usuario para que el usuario juegue volados con la computadora
* Objetivo mostrar como se crean y usan objetos de distintas clases
*@author Andy
* @version 1
*/

public class Volados{
	public static void main(String[] pps) {

		Moneda laSuertuda = new Moneda();
		Scanner in = new Scanner(System.in);
		String nombre, pidio, cayo;


		System.out.println("Bienvenido, vamos a jugar volados");
		System.out.println("Dame tu nombre");
		nombre = in.nextLine();

		System.out.print(nombre+", ¿que pides: aguila o sol?");

		pidio = in.nextLine();
		pidio = pidio.toLowerCase();
		pidio = pidio.trim();

		cayo = laSuertuda.lanzar();
		System.out.println("Cayo "+ cayo);

		if (pidio.equals("sol") || pidio.equals("aguila")) {

		if (pidio.equals(cayo)) {
			System.out.println(nombre+", ganaste :) ");
		}

		System.out.println(nombre+", perdiste :(");

		 
		}

		System.out.println("ERROR, solo puedes pedir aguila o sol \nPerdiste :( ");
	}

}
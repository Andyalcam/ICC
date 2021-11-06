/**
 * 
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
import java.util.Scanner;

public class Main {
	public static void main (String[] pps){

// Declaracion de variables
		Scanner in = new Scanner(System.in);
		Scanner pa = new Scanner(System.in);
		int opc,num;
		String palabra, reversa = "";
		boolean salir = false;

// Bienvenida al programa
		System.out.println("\n   ***Bienvenido al programa, elige una opcion***");
		System.out.println("-----------------------------------------------------");

// Inicializacion del ciclo while
		while(salir != true){

// Muestra del menu de opciones
			System.out.println("\n1.- Palindromo");
			System.out.println("2.- Numero primo");
			System.out.println("3.- Factorial");
			System.out.println("4.- Salir\n");

			opc = in.nextInt(); // Lectura de la opcion elegida por el usuario
			switch(opc){
				// Verificar si la palabra del usuario es o no palindroma
				case 1: System.out.print("\nDame una palabra: ");
						palabra = pa.nextLine();
						int contador = palabra.length()-1;
						while(contador >= 0){
							reversa += palabra.charAt(contador);
							contador --;
						}
						if (palabra.equals(reversa)){
							System.out.println("Tu palabra es un palindromo!!!");
						}else{
							System.out.println("Tu palabra no es un palindromo :c");
						}
				break;
				// Verificar si el numero del usuario es primo o no
				case 2: boolean primo = true;
						System.out.print("Dame un numero: ");
						num = in.nextInt();
						for(int i=2; i<= num-1; i++){
							if(num%i==0){
								primo=false;
							}
						}
						if(primo==true){
							System.out.println("Tu numero es primo!!!");
						}else
							System.out.println("Tu numero no es primo :c");
				break;
				// Sacar el factorial del numero del usuario
				case 3: System.out.print("Dame un numero: ");
						num = in.nextInt();
						int fac = 1;
						for (int i=2; i<=num;i++){
						  	fac = fac * i;
						}
						System.out.println("El factorial de tu número es: "+fac);
				break;
				// Opcion para salir del programa y despedida
				case 4: salir = true;
						System.out.println("\nVuelve pronto :)");
				break;
				// Caso para indicar al usuario que no ha elegido ninguna de las opciones
				default: System.out.println("Elige una de las opciones plis");
			}
		}
	}
}
import java.util.Scanner;
/**
 * programa para generar mensajes telegráficos para licenciados,
 * ingenieros o doctores.
 *
 * @author Alvarado Camacho Andrea
 * @version 1.0
 */
public class Telegrafo{
	public static void main (String[] pps){

		Scanner in = new Scanner(System.in);
		String nomRem, proRem, nomDes, proDes, direccion, mensaje;
		int resUrgente;
// Entrada
		System.out.println("\n       ***Bienvenido al Telegrafo***");
		System.out.print("\nNombre del remitente: ");
		nomRem = in.nextLine();
		System.out.print("Profesion del remitente: ");
		proRem = in.nextLine();
		System.out.print("Nombre del destinatario: ");
		nomDes = in.nextLine();
		System.out.print("Profesion del destinatario: ");
		proDes = in.nextLine();
		System.out.print("Direccion del destinatario en formato \"Calle numero.ciudad CP.\" : ");
		direccion = in.nextLine();
		System.out.print("Mensaje: ");
		mensaje = in.nextLine();
		System.out.print("¿Este es un mensaje urgente?  1/si 2/no  :");
		resUrgente = in.nextInt();
// Salida
		System.out.println("\n            ***Telegrama**");
	// De		
		String proRem1 = proRem.substring(0,3);
		String proRem2 = proRem1.toUpperCase();
		String nomRem1 = nomRem.toUpperCase();
		System.out.println("\nDe: "+proRem2+"."+" "+nomRem1);	
	// Para
		String proDes1 = proDes.substring(0,3);
		String proDes2 = proDes1.toUpperCase();
		String nomDes1 = nomDes.toUpperCase();
		System.out.println("Para: "+proDes2+"."+" "+nomDes1);	
	// Mensaje
		System.out.println("Mensaje:");	
		System.out.println(mensaje);
	// Urgente o no
		if(resUrgente==1){
			System.out.println("\nEste es un mensaje URGENTE!!!");
		// Costo
			int letras = mensaje.length();
			int costo = (letras*4);
			System.out.println("Costo: $"+costo+".0\n");
			System.out.println(letras+ " letras. Costo por letra $4.00");
			}	
		else{
			int letras = mensaje.length();
			int costo = (letras*2);
			System.out.println("Costo: $"+costo+".0\n");
			System.out.println(letras+ " letras. Costo por letra $2.00");	
		}
	// Direccion
		System.out.println("\nDireccion:");	
		int punto = direccion.indexOf('.');
		String direccion1 = direccion.substring(0,punto);
		System.out.println(direccion1);
		int ultimo = direccion.lastIndexOf('.');
		String direccion2 = direccion.substring(punto+1,ultimo);
		System.out.println(direccion2+"\n");

	}

}
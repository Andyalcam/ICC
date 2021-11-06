import java.util.Scanner;

/**
 * Programa para extraer direcciones electronicas. 
 * Una direccion electronica es cualquier cadena de caracteres que contiene
 * una arroba.
 *
 * @author Abner Elias Velázquez Rosas
 * @version 
 */
public class Email1 {

    public static void main(String[] pps) {
	Scanner in = new Scanner(System.in);  //Creacion de los objetos necesarios
	String texto;
	String dominioCiencias = "ciencias.unam.mx" ;

	//Solicita el texto
	System.out.println("Dame un texto");
	texto = in.nextLine();

	//Calcula la posicion de la arroba de los blancos que la rodean
	int indArroba = texto.indexOf('@');
	int indBlancoDespues = texto.indexOf(' ',indArroba);
	int indBlancoAntes = texto.lastIndexOf(' ',indArroba);
    
    //Condicional y declaración de la String para que no se requiera de un "espacio" para poder extraer el correo
	if (indBlancoDespues == -1){
		indBlancoDespues = texto.length();
	}
    String dominio = texto.substring(indArroba+1,indBlancoDespues-1);

	//Si no hay arroba lo indica y en caso contrario extrae la direccion
	if (indArroba != -1 && dominio.equals(dominioCiencias)){
	    System.out.println("La direccion que pertenece al dominio de ciencias es: "+texto.substring(indBlancoAntes+1, indBlancoDespues));
	}
	else 
		if (indArroba != -1) {
        System.out.println("La direccion no pertenece al dominio de ciencias es: "+texto.substring(indBlancoAntes+1,indBlancoDespues));
		
	} 
	else{
	    System.out.println("No hay direccion ");
	}
    }
}
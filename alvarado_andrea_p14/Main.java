/**
 * Clase Main para interactuar con el usuario
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int resp;
        boolean salir = false;
        int opcion;
        Contestadora c = new Contestadora();

        while(salir != true){
            System.out.println("\nContestadora");
            System.out.println("1. Agregar mensaje");
            System.out.println("2. Revisar mensaje reciente");
            System.out.println("3. Revisar mensajes");
            System.out.println("4. Salir");
            System.out.print("Selecciona la opción --> ");
            opcion = in.nextInt(); 
        switch(opcion){
            case 1:
            		System.out.print("Escribe tu nuevo mensaje: ");
            		String mensaje =in2.nextLine();
            		Mensaje mensajito = new Mensaje(mensaje);
            		c.agregarMensaje(mensajito);
            break;

            case 2:
            		c.escucharMensajeReciente();
            break;

            case 3:
            		c.escucharMensajes();
            break;

            case 4: salir = true;
            		System.out.println("\nVuelve pronto :)");
            break;
            default: System.out.println("Elige una de las opciones plis");
        }
    }
}
}
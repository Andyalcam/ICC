import java.util.Scanner;
/**
 * Programa para adivinar animales. 
 *
 * @author Andrea Alvarado Camacho
 * @version 
 */
public class Animales {
	public static void main(String[] pps) {
	Scanner in = new Scanner(System.in);
	int res;

	System.out.println("Animales");
	System.out.println("1- Colibri");
	System.out.println("2- Ballena");
	System.out.println("3- Pinguino");
	System.out.println("4- Tigre");
	System.out.println("5- Cuervo");

	System.out.println("Adivinare el animal que estas pensando...");

		System.out.println("¿Tu animal es oviparo?     Si=1 No=2");
		res = in.nextInt();
		if (res==1){
			System.out.println("¿Tu animal vuela?     Si=1 No=2");
			res = in.nextInt();
			if (res==1){
				System.out.println("¿Tu animal es de color negro?     Si=1 No=2");
				res = in.nextInt();
				if(res==1){
				System.out.println("Tu animal es un Cuervo");
				}
				else{
					System.out.println("Tu animal es un Colibri");
				}
			}
			else{
				System.out.println("Tu animal es un Pinguino");
			}
		}
		else{
			System.out.println("¿Tu animal es mamifero?     Si=1 No=2");
			res = in.nextInt();
			if(res==1){
				System.out.println("¿Tu animal nada?     Si=1 No=2");
				res = in.nextInt();
				if(res==1){
					System.out.println("Tu animal es: Ballena");
				}
				else{
					System.out.println("Tu animal es: Tigre");
				}
			}
			else
				System.out.println("No estas pensando en ningun animal de la lista :c");
		}


}
}
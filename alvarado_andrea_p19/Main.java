import java.util.Scanner;
/**
* Programa para interactuar con el usuario
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Main {
	public static void main (String [] pps){
		// Declaracion de variables
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		String nombre,tupla,cond;
		int x=0;
		int y=0;

		// Creacion de objetos
		Peon peoncito = new Peon("blanco",x,y);
		Caballo caballito = new Caballo("blanco",x,y);
		Torre torrecita = new Torre("blanco",x,y);

		// Bienvenida al programa
		System.out.println("\nBienvenido, las piezas que puedes poner son:\n1.Peon\t2.Torre\t3.Caballo\n");

		do{
			System.out.print("Nombre de la pieza: ");
			nombre = in.nextLine();

			// Asignacion de coordenadas segun la pieza deseada
			if(nombre.equals("peon")){
				System.out.print("Ubicacion inicial: ");
				tupla = on.nextLine().trim();
          		x = Integer.parseInt(tupla.split(",")[0]);
          		y = Integer.parseInt(tupla.split(",")[1]);
          		peoncito.setX(x);
          		peoncito.setY(y);
			}else if(nombre.equals("caballo")){
				System.out.print("Ubicacion inicial: ");
				tupla = on.nextLine().trim();
          		x = Integer.parseInt(tupla.split(",")[0]);
          		y = Integer.parseInt(tupla.split(",")[1]);
          		caballito.setX(x);
          		caballito.setY(y);
			}else if(nombre.equals("torre")){
				System.out.print("Ubicacion inicial: ");
				tupla = on.nextLine().trim();
          		x = Integer.parseInt(tupla.split(",")[0]);
          		y = Integer.parseInt(tupla.split(",")[1]);
          		torrecita.setX(x);
          		torrecita.setY(y);
			}else{
				System.out.println("Ingresa un nombre valido");
			}
			System.out.print("Otra pieza (s/n): ");
			cond = in.nextLine();
		}while(cond.equals("s"));

		// Imprime los movimientos posibles solo si el usuario ha introducido sus coordenadas
		if(peoncito.getX()!=0 && peoncito.getY()!=0){
			System.out.println("\nEl peon se puede mover a: ");
			System.out.println(peoncito.posiblesMovimientos()+"\n");
		}if(caballito.getX()!=0 && caballito.getY()!=0){
			System.out.println("El Caballo se puede mover a: ");
			System.out.println(caballito.posiblesMovimientos()+"\n");
		}if(torrecita.getX()!=0 && torrecita.getY()!=0){
			System.out.println("La torre se puede mover a: ");
			System.out.println(torrecita.posiblesMovimientos()+"\n");
		}
	}
}
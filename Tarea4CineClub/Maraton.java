/**
 * 
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
import java.util.Scanner;

public class Maraton{
	public static void main(String[] pps){
		
    	Funcion fun1 = new Funcion ("12:00", "Los Increibles");
    	Funcion fun2 = new Funcion ("2:30", "Los Increibles II");
    	Funcion fun3 = new Funcion ("5:00", "Lilo y Stich\t");
    	Funcion fun4 = new Funcion ("7:30", "Mosters Inc.\t");
    	Funcion fun5 = new Funcion ("10:00", "Monsters University");
    	Funcion fun6 = new Funcion ("12:30", "Todas\t");
    	Scanner in = new Scanner(System.in);
		int res,fun,tip;

		do{
			System.out.println("\n\t***BIENVENIDO AL CINE CLUB***");
			System.out.println("-----------------------------------------------------");
			System.out.println("\n\t    FUNCIONES DISPONIBLES\n");
			System.out.println("1: "+fun1.toString());
			System.out.println("2: "+fun2.toString());
			System.out.println("3: "+fun3.toString());
			System.out.println("4: "+fun4.toString());
			System.out.println("5: "+fun5.toString());
			System.out.println("6: "+fun6.toString());

			System.out.println("\n¿Que funcion desea ver?");
			fun = in.nextInt();
			switch(fun){
				case 1: if(fun1.obtenerDisponibles()>0){
							System.out.println("¿Que tipo de boleto desea?\tGeneral=1\tIndividual=2\n");
							tip = in.nextInt();
							fun1.comprarBoleto(tip);
							System.out.println("LUGARES DISPONIBLES: "+fun1.obtenerDisponibles());
							if(tip==1){
								Boleto b = new Boleto (fun1.obtenerPelicula(),tip,50);
								System.out.println(b.toString());
								fun1.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun1.obtenerGeneral());
							}else if(tip==2){
								Boleto b = new Boleto (fun1.obtenerPelicula(),tip,10);
								System.out.println(b.toString());
								fun1.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun1.obtenerGeneral());
							}else{
								System.out.println(" ");
							}
						}else{
							System.out.println("Ya no hay boletos disponibles, elige otra función :)");
						}

				break;
				case 2: if(fun2.obtenerDisponibles()>0){
							System.out.println("¿Que tipo de boleto desea?\tGeneral=1\tIndividual=2\n");
							tip = in.nextInt();
							fun2.comprarBoleto(tip);
							System.out.println("LUGARES DISPONIBLES: "+fun2.obtenerDisponibles());
							if(tip==1){
								Boleto b = new Boleto (fun2.obtenerPelicula(),tip,50);
								System.out.println(b.toString());
								fun2.sumarGeneral(b);
								System.out.println("El dinero recaudado es: "+fun2.obtenerGeneral());
							}else if(tip==2){
								Boleto b = new Boleto (fun2.obtenerPelicula(),tip,10);
								System.out.println(b.toString());
								fun2.sumarGeneral(b);
				    			System.out.println("El dinero recaudado es: "+fun2.obtenerGeneral());
							}else{
								System.out.println(" ");
							}
						}else{
							System.out.println("Ya no hay boletos disponibles, elige otra función :)");
						}
				break;
				case 3: if(fun3.obtenerDisponibles()>0){
							System.out.println("¿Que tipo de boleto desea?\tGeneral=1\tIndividual=2\n");
							tip = in.nextInt();
							fun3.comprarBoleto(tip);
							System.out.println("LUGARES DISPONIBLES: "+fun3.obtenerDisponibles());
							if(tip==1){
								Boleto b = new Boleto (fun3.obtenerPelicula(),tip,50);
								System.out.println(b.toString());
								fun3.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun3.obtenerGeneral());
							}else if(tip==2){
								Boleto b = new Boleto (fun3.obtenerPelicula(),tip,10);
								System.out.println(b.toString());
								fun3.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun3.obtenerGeneral());
							}else{
								System.out.println(" ");
							}
						}else{
							System.out.println("Ya no hay boletos disponibles, elige otra función :)");
						}
				break;
				case 4: if(fun4.obtenerDisponibles()>0){
							System.out.println("¿Que tipo de boleto desea?\tGeneral=1\tIndividual=2\n");
							tip = in.nextInt();
							fun4.comprarBoleto(tip);
							System.out.println("LUGARES DISPONIBLES: "+fun4.obtenerDisponibles());
							if(tip==1){
								Boleto b = new Boleto (fun4.obtenerPelicula(),tip,50);
								System.out.println(b.toString());
								fun4.sumarGeneral(b);
	    						System.out.println("El dinero recaudado es: "+fun4.obtenerGeneral());
							}else if(tip==2){
								Boleto b = new Boleto (fun4.obtenerPelicula(),tip,10);
								System.out.println(b.toString());
								fun4.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun4.obtenerGeneral());
							}else{
								System.out.println(" ");
							}
						}else{
							System.out.println("Ya no hay boletos disponibles, elige otra función :)");
						}
				break;
				case 5: if(fun5.obtenerDisponibles()>0){
							System.out.println("¿Que tipo de boleto desea?\tGeneral=1\tIndividual=2\n");
							tip = in.nextInt();
							fun5.comprarBoleto(tip);
							System.out.println("LUGARES DISPONIBLES: "+fun5.obtenerDisponibles());
							if(tip==1){
								Boleto b = new Boleto (fun5.obtenerPelicula(),tip,50);
								System.out.println(b.toString());
								fun5.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun5.obtenerGeneral());
							}else if(tip==2){
								Boleto b = new Boleto (fun5.obtenerPelicula(),tip,10);
								System.out.println(b.toString());
								fun5.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun5.obtenerGeneral());
							}else{
								System.out.println(" ");
							}
						}else{
							System.out.println("Ya no hay boletos disponibles, elige otra función :)");
						}	
				break;
				case 6: if(fun6.obtenerDisponibles()>0){
							System.out.println("¿Que tipo de boleto desea?\tGeneral=1\tIndividual=2\n");
							tip = in.nextInt();
							fun6.comprarBoleto(tip);
							System.out.println("LUGARES DISPONIBLES: "+fun6.obtenerDisponibles());
							if(tip==1){
								Boleto b = new Boleto (fun6.obtenerPelicula(),tip,50*5);
								System.out.println(b.toString());
								fun6.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun6.obtenerGeneral());
							}else if(tip==2){
								Boleto b = new Boleto (fun6.obtenerPelicula(),tip,10*5);
								System.out.println(b.toString());
								fun6.sumarGeneral(b);
    							System.out.println("El dinero recaudado es: "+fun6.obtenerGeneral());
							}else{
								System.out.println(" ");
							}
						}else{
							System.out.println("Ya no hay boletos disponibles, elige otra función :)");
						}
				break;
				default: System.out.println("Elige una de las funciones plis");
			}
				System.out.println("¿Desea comprar otro boleto?\n");
				System.out.println("Si=1\nNo=2\n");				
				res = in.nextInt();
		} while(res==1);

	}
}
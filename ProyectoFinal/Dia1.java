import java.util.Scanner;
/**
 * Clase para el primer dia del torneo que es Mini Black Jack
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
public class Dia1{
	public static void main(String[] args) {

		// Declaracion de variables
		Carta carta1;
		Carta carta2;

		int res=0;
		int valor1=0;
		int valor2=0;
		int empate = 0;
		int ganarP = 10;
        int empateP = 5;
        boolean repetir=true;
		String ganar="";

		Scanner in = new Scanner(System.in);

		String clave1="";
		String clave2="";
		String jugador1="";
		String jugador2="";
		String jugadorN="";

		Jugador [] jugadores = new Jugador[0];
		MiniBJ[] juego1 = new MiniBJ[0];
		Utilidades ut = new Utilidades();
		// Lectura de los objetos para mantener su consistencia
		jugadores = ut.leerObjetoArchivo("jugadores.txt");
		juego1 = ut.leerObjetoBJ("juego1.txt");
		
		if(args.length<1){
			System.out.println("\nSe requiere por lo menos un jugador.\n");
		}else if(args.length>2){
			System.out.println("\nCantidad incorrecta de datos!!!\n");
		}else if(args.length==1){
			//jugador vs computadora
			for(int i=0; i<jugadores.length; i++){ // for que recorre nuestro arreglo de jugadores y extrae el nombre si es que coincide con su clave
				clave1=jugadores[i].obtenerClave();
				if(args[0].equalsIgnoreCase(clave1)){ // compara la clave ingresada con la de los jugadores registrados ignorando mayusculas y minisculas
					jugador1=jugadores[i].obtenerNombre(); // se obtiene el nombre del jugador 1
					break;
				}
			}
			if(args[0].equalsIgnoreCase(clave1)){
				System.out.println("\n"+jugador1+" jugara contra la computadora\n");
				MiniBJ mini = new MiniBJ(); // creacion del objeto para el juego
				juego1 = ut.agregarJuegoBJ(mini); // se agrega al conjunto de juegos de tipo MiniBJ
				while(empate<2){
					if(empate==1){ // si hay empate, se borra los valores de la mano de los jugadores
						valor1=0;
						valor2=0;
					}
					do{
						carta1 = mini.tomarCarta();
						System.out.println(jugador1+" tu carta es: "+carta1);

						mini.cambiarValor();
						valor1 += carta1.obtenerValor();

						System.out.println(jugador1+" tienes "+valor1+" en tu mano");

						if(valor1>21){ // Si el valor de la mano del jugador es mayor a 21, pierde acutomaticamente
							System.out.println("\nPerdiste, no obtienes ningun punto");
							mini.asignarEstado("Perdio "+jugador1+" contra la computadora"); // Se asigna el estado de la partida
							ut.EscribirObjetosArchivo("juego1.txt",juego1); // Se guarda el objeto en el archivo .txt correspondiente
							System.exit(0);
						}else if(valor1==21){
							System.out.println("\nFelicidades, gana "+jugador1);
							for(int i=0; i<jugadores.length; i++){
								clave1=jugadores[i].obtenerClave();
								if(args[0].equalsIgnoreCase(clave1)){
					        		System.out.println(jugador1+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP); // Si el jugador 1 gana, se busca en el arreglo de jugadores y se le suman 10 puntos
					        		mini.asignarEstado("Gano "+jugador1+" contra la computadora");
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores); // Se guarda el objeto con los nuevos puntos asignados en el archivo .txt
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
					        		break;
								}
							}
							System.exit(0);
						}
						repetir=true;
							do{
								try{
									System.out.println("\n¿Deseas sacar otra carta? si/1 no/2");
									res = in.nextInt();
									if(res==1 || res==2){
										repetir = false;
									}else{
										System.out.println("\tDebes ingresar un 1 o 2");
									}
								}catch(Exception e){
									System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
									in.next();
								}
							}while(repetir);
					}while(res==1);
					do{
						carta2 = mini.tomarCarta();
						System.out.println("\nLa carta de la computadora es: "+carta2);

						mini.cambiarValor();
						valor2 += carta2.obtenerValor();

						System.out.println("La computadora tiene "+ valor2+" en su mano");

						if(valor2>21){
							System.out.println("\nFelicidades gana "+jugador1);
							for(int i=0; i<jugadores.length; i++){
								clave1=jugadores[i].obtenerClave();
								if(args[0].equalsIgnoreCase(clave1)){
					        		System.out.println(jugador1+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador1+" contra la computadora");
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
									break;
								}
							}
							System.exit(0);
						}else if(valor2==21){
							System.out.println("\nPerdiste, no obtienes ningun punto");
							System.exit(0);
						}
					}while(valor2<=11);

					if (valor1==valor2){
						System.out.println("EMPATE, SEGUNDO ROUND");
						ganar="empate";
						empate++;
					}else if(valor1<=21 && valor2<=21){
						if(valor1>valor2){
							System.out.println("\nFelicidades gana "+jugador1);
							for(int i=0; i<jugadores.length; i++){
								clave1=jugadores[i].obtenerClave();
								if(args[0].equalsIgnoreCase(clave1)){
					        		System.out.println(jugador1+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador1+" contra la computadora");
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
									break;
								}
							}
							System.exit(0);
						}else{
							System.out.println("\nPerdiste, no obtienes ningun punto");
							mini.asignarEstado("Perdio "+jugador1+" contra la computadora");
							ut.EscribirObjetosArchivo("juego1.txt",juego1);
							System.exit(0);
						}
					}
				}
				for(int i=0; i<jugadores.length; i++){
					clave1=jugadores[i].obtenerClave();
					if(args[0].equalsIgnoreCase(clave1)){
						if(ganar.equals("empate")){
		        			System.out.println(jugador1+" gana "+empateP+" puntos");
			        		jugadores[i].sumarPuntos(empateP);
			        		mini.asignarEstado(jugador1+" obtuvo empate contra la computadora");
			        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
			        		ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
			        		ut.EscribirObjetosArchivo("juego1.txt",juego1);
			        	}
						break;
					}
				}				
			}else{
				System.out.println("\nError, clave incorrecta. Intentalo de nuevo.\n");
			}
		}else if(args.length==2){
			//jugador vs jugador sigue la misma logica que el jugador vs la computadora solo que en lugar de jugar la computadora sola, el jugador 2 elige sus opciones
			for(int i=0; i<jugadores.length; i++){
				clave1=jugadores[i].obtenerClave();
				if(args[0].equalsIgnoreCase(clave1)){
					jugador1=jugadores[i].obtenerNombre();
					break;
				}
			}
			for(int i=0; i<jugadores.length; i++){
				clave2=jugadores[i].obtenerClave();
				if(args[1].equalsIgnoreCase(clave2)){
					jugador2=jugadores[i].obtenerNombre();
					break;
				}
			}
			if(args[0].equalsIgnoreCase(clave1) && args[1].equalsIgnoreCase(clave2)){
				System.out.println("\n"+jugador1+" jugara contra "+jugador2+"\n");
				MiniBJ mini = new MiniBJ();
				juego1 = ut.agregarJuegoBJ(mini);
				while(empate<2){
					if(empate==1){
						valor1=0;
						valor2=0;
					}
					do{
						carta1 = mini.tomarCarta();
						System.out.println(jugador1+" tu carta es: "+carta1);

						mini.cambiarValor();
						valor1 += carta1.obtenerValor();

						System.out.println(jugador1+" tienes "+valor1+" en tu mano");

						if(valor1>21){
							System.out.println("\nFelicidades, gana "+jugador2);
							for(int i=0; i<jugadores.length; i++){
								clave2=jugadores[i].obtenerClave();
								if(args[1].equalsIgnoreCase(clave2)){
					        		System.out.println(jugador2+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador2+" contra "+jugador1);
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
					        		break;
								}
							}
							System.exit(0);
						}else if(valor1==21){
							System.out.println("\nFelicidades, gana "+jugador1);
							for(int i=0; i<jugadores.length; i++){
								clave1=jugadores[i].obtenerClave();
								if(args[0].equalsIgnoreCase(clave1)){
					        		System.out.println(jugador1+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador1+" contra "+jugador2);
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
					        		break;
								}
							}
							System.exit(0);
						}
						repetir=true;
							do{
								try{
									System.out.println("\n¿Deseas sacar otra carta? si/1 no/2");
									res = in.nextInt();
									if(res==1 || res==2){
										repetir = false;
									}else{
										System.out.println("\tDebes ingresar un 1 o 2");
									}
								}catch(Exception e){
									System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
									in.next();
								}
							}while(repetir);
					}while(res==1);
					do{
						carta2 = mini.tomarCarta();
						System.out.println(jugador2+" tu carta es: "+carta2);

						mini.cambiarValor();
						valor2 += carta2.obtenerValor();

						System.out.println(jugador2+" tienes "+ valor2+" en tu mano");

						if(valor2>21){
							System.out.println("\nFelicidades gano el "+jugador1);
							for(int i=0; i<jugadores.length; i++){
								clave1=jugadores[i].obtenerClave();
								if(args[0].equalsIgnoreCase(clave1)){
					        		System.out.println(jugador1+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador1+" contra "+jugador2);
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
									break;
								}
							}
							System.exit(0);
						}else if(valor2==21){
							System.out.println("\nFelicidades, gana "+jugador2);
							for(int i=0; i<jugadores.length; i++){
								clave2=jugadores[i].obtenerClave();
								if(args[1].equalsIgnoreCase(clave2)){
					        		System.out.println(jugador2+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador2+" contra "+jugador1);
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
					        		break;
								}
							}
							System.exit(0);
						}
						repetir=true;
							do{
								try{
									System.out.println("\n¿Deseas sacar otra carta? si/1 no/2");
									res = in.nextInt();
									if(res==1 || res==2){
										repetir = false;
									}else{
										System.out.println("\tDebes ingresar un 1 o 2");
									}
								}catch(Exception e){
									System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
									in.next();
								}
							}while(repetir);
					}while(res==1);

					if (valor1==valor2){
						System.out.println("EMPATE, SEGUNDO ROUND");
						ganar="empate";
						empate++;
					}else if(valor1<=21 && valor2<=21){
						if(valor1>valor2){
							System.out.println("\nFelicidades gana "+jugador1);
							for(int i=0; i<jugadores.length; i++){
								clave1=jugadores[i].obtenerClave();
								if(args[0].equalsIgnoreCase(clave1)){
					        		System.out.println(jugador1+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador1+" contra "+jugador2);
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
									break;
								}
							}
							System.exit(0);
						}else{
							System.out.println("\nFelicidades gana "+jugador2);
							for(int i=0; i<jugadores.length; i++){
								clave2=jugadores[i].obtenerClave();
								if(args[1].equalsIgnoreCase(clave2)){
					        		System.out.println(jugador2+" gana "+ganarP+" puntos");
					        		jugadores[i].sumarPuntos(ganarP);
					        		mini.asignarEstado("Gano "+jugador2+" contra "+jugador1);
					        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
					       			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
					       			ut.EscribirObjetosArchivo("juego1.txt",juego1);
					        		break;
								}
							}
							System.exit(0);
						}
					}
				}
				for(int i=0; i<jugadores.length; i++){
					clave1=jugadores[i].obtenerClave();
					if(args[0].equalsIgnoreCase(clave1)){
						if(ganar.equals("empate")){
		        			System.out.println(jugador1+" gana "+empateP+" puntos");
			        		jugadores[i].sumarPuntos(empateP);
			        		mini.asignarEstado(jugador1+" obtuvo empate contra "+jugador2);
			        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
			        		ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
			        		ut.EscribirObjetosArchivo("juego1.txt",juego1);
			        	}
						break;
					}
				}
			}else{
				System.out.println("\nError, clave incorrecta. Intentalo de nuevo.\n");
			}
		}
	}
}
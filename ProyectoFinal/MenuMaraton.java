import java.util.Scanner;
/**
* Programa para registrar jugadores para el mataron
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class MenuMaraton{
	public static void main(String []pps){
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		String nombre = "";
		int dia = 0;
		int mes = 0;
		int año = 0;
		int puntos = 0;
		int opc;
		String sexo = "";
		String carrera = "";
		String clave = "";
		String clave1 = "";
		String clave2 = "";
		boolean repetir=true;
		boolean excep=true;
		Jugador [] jugadores = new Jugador[0];
		MiniBJ[] juego1 = new MiniBJ[0];
		Dados[] juego2 = new Dados[0];
		Conecta4[] juego3 = new Conecta4[0];
		Utilidades ut = new Utilidades();
		jugadores = ut.leerObjetoArchivo("jugadores.txt");
		juego1 = ut.leerObjetoBJ("juego1.txt"); 
		juego2 = ut.leerObjetoDados("juego2.txt"); 
		juego3 = ut.leerObjetoConecta4("juego3.txt"); // Leer los objetos jugador para mantener la consistencia
		System.out.println("\n\t*** BIENVENIDO AL TORNEO ***");
		do{
			try{
				System.out.println("\n\t\t*** Menu ***");
				System.out.println("--------------------------------------------");
				System.out.println("1. Registrar un nuevo jugador");
				System.out.println("2. Mostrar jugadores");
				System.out.println("3. Campeon");
				System.out.println("4. Lista del torneo");
				System.out.println("5. Partidas registradas");
				System.out.println("6. Salir");
				System.out.println("--------------------------------------------");
				System.out.print("Ingresa una opcion del menu: ");
				opc = in.nextInt();

				switch(opc){
					// Registrar un nuevo jugador
					case 1: System.out.print("Nombre completo: ");
							nombre = on.nextLine();

							repetir=true;
							do{
								try{
									System.out.print("Dia de nacimiento: ");
									dia = in.nextInt();
									if(dia>0 && dia<32){
										repetir = false;
									}else{
										System.out.println("\tDebes ingresar un numero mayor a 0 y menor o igual a 31");
									}
								}catch(Exception e){
									System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
									in.next();
								}
							}while(repetir);

							repetir=true;
							do{
								try{
									System.out.print("Mes de nacimiento: ");
									mes = in.nextInt();
									if(mes>0 && mes<13){
										repetir = false;
									}else{
										System.out.println("\tDebes ingresar un numero mayor a 0 y menor o igual a 12");
									}
								}catch(Exception e){
									System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
									in.next();
								}
							}while(repetir);

							repetir=true;
							do{
								try{
									System.out.print("Año de nacimiento: ");
									año = in.nextInt();
									if(año>0 && año<2021){
										repetir = false;
									}else{
										System.out.println("\tDebes ingresar un numero mayor a 0 y menor a 2021");
									}
								}catch(Exception e){
									System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
									in.next();
								}
							}while(repetir);
							
							System.out.print("Sexo: ");
							sexo = on.nextLine();
							System.out.print("Carrera: ");
							carrera = on.nextLine();
							Jugador nuevo = new Jugador(nombre,dia,mes,año,sexo,carrera,clave,puntos); // Se crea un nuevo objeto de tipo jugador
							nuevo.asignarClave(); // Se le asigna una clave unica para el torneo
							jugadores = ut.agregarJugadorArreglo(nuevo); // Se agrega al arreglo de jugadores
					break;
					// Mostrar los jugadores registrados
					case 2: System.out.println("\n*** Jugadores registrados ***");
							try{
								for(int i=0; i<jugadores.length; i++){
									if(jugadores[i] == null){
										break;
									}
									System.out.println(jugadores[i]);
								}
							}catch(Exception e3){System.out.println(e3+" Ocurrio un error, intentalo de nuevo");
							}finally{System.out.println("\nTotal de registros: "+jugadores.length);}
					break;
					// Mostrar el campeon hasta el momento
					case 3: System.out.println("\nEl o los campeones hasta el momento son: ");

							// Se crea un arreglo nuevo con las puntuaciones de los jugadores registrados
							int cont=0;
							int [] puntosJugadores = new int [jugadores.length];
							for(int i=0; i<puntosJugadores.length; i++){
								puntosJugadores[i]=jugadores[cont].obtenerPuntos();
								cont++;
							}
							// Se obtiene la puntiacion maxima del arreglo de puntuaciones
							int puntosM=puntosJugadores[0];
							for(int i=0; i<puntosJugadores.length; i++){
								if(puntosM<puntosJugadores[i]){
									puntosM = puntosJugadores[i];
								}
							}
							// Se concatenan todos aquellos nombres cuyas puntuaciones sean iguales a la puntiacion maxima
							String nombres = "";
							int camp=0;
							int conta=1;
							for(int i=0; i<jugadores.length; i++){
								camp=jugadores[i].obtenerPuntos();
								if(puntosM==camp){
									nombres+=(conta+".- "+jugadores[i].obtenerNombre()+" ");
									conta++;
								}
							}
							System.out.println(nombres+"\nCon "+puntosM+" puntos"); // Se imprime el o los campeones
					break;
					// Lista del torneo
					case 4: // Se crea un nuevo arreglo con los nombres de los jugadores
							int cont2=0;
							String [] nombresJugadores = new String [jugadores.length];
							for(int i=0; i<nombresJugadores.length; i++){
								nombresJugadores[i]=jugadores[cont2].obtenerNombre();
								cont2++;
							}
							Maraton maratoncito = new Maraton(nombresJugadores);
							maratoncito.dividirGrupo(); // Se divide el arreglo de nombres
							maratoncito.imprimeParejas1(); // Se obtienen las parejas para la semana 1
							maratoncito.imprimeParejas2(); // Se obtienen las parejas para la semana 2
							maratoncito.imprimeParejas3(); // Se obtienen las parejas para la semana 3
					break;
					// Partidas registradas
					case 5: System.out.println("\nA continuacion se muestran las partidas ya concluidas y su resultado");
							System.out.println("\n\tTotal de partidas concluidas: "+(juego1.length+juego2.length+juego3.length)+"\n");
							int count=1;
							// Se imprimen los objetos de Mini BlackJack con su respectivo estado
							for(int i=0; i<juego1.length; i++){
								String estado1=juego1[i].obtenerEstado();
								System.out.println((count)+".- "+estado1);
								count++;
							}
							// Se imprimen los objetos de Dados con su respectivo estado
							for(int i=0; i<juego2.length; i++){
								String estado=juego2[i].obtenerEstado();
								System.out.println((count)+".- "+estado);
								count++;
							}
							// Se imprimen los objetos de Conecta 4 con su respectivo estado
							for(int i=0; i<juego3.length; i++){
								String estado=juego3[i].obtenerEstado();
								System.out.println((count)+".- "+estado);
								count++;
							}
					break;
					// Salir del programa
					case 6: ut.EscribirObjetosArchivo("jugadores.txt",jugadores); // Se guardan los objetos de tipo jugador nuevos (los registros nuevos)
							System.out.println("\n\tHasta luego :)\n");
							System.exit(0); // Salida del programa 
					break;

					default:
							System.out.println("Elige una opcion de menu plis :c");
					break;
				}
			}catch(Exception e2){
				System.out.println("\n\n"+e2+"\nDebes ingresar un numero");
				in.next();
				excep=true;
			}
		}while(excep);
	}
}
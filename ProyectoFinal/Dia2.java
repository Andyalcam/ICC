import java.util.Scanner;
public class Dia2 {
	public static void main(String[] args) {

		int tirada1 = 0;
		int tirada2 = 0;
		int tirada1_2 = 0;
		int tirada2_2 = 0;
		int contTur = 1;
		int ganar = 10;
        int empate = 5;
		boolean turno=true;
		boolean repetir = true;
		int ganador1 = 0;
		boolean chance=false;

		String clave1="";
		String clave2="";
		String jugador1="";
		String jugador2="";
		String jugadorN="";

		// Consistencia de objetos
		Jugador [] jugadores = new Jugador[0];
		Dados [] juego2 = new Dados[0];
		Utilidades ut = new Utilidades();
		jugadores = ut.leerObjetoArchivo("jugadores.txt");
		juego2 = ut.leerObjetoDados("juego2.txt");
		
		if(args.length<1){
			System.out.println("\nSe requiere por lo menos un jugador.\n");
		}else if(args.length>2){
			System.out.println("\nCantidad incorrecta de datos!!!\n");
		}else if(args.length==1){
			//jugador vs computadora
			for(int i=0; i<jugadores.length; i++){
				clave1=jugadores[i].obtenerClave();
				if(args[0].equalsIgnoreCase(clave1)){
					jugador1=jugadores[i].obtenerNombre();
					break;
				}
			}
			if(args[0].equalsIgnoreCase(clave1)){
				System.out.println("\n"+jugador1+" jugara contra la computadora\n");
				Dados dados1 = new Dados();
				juego2 = ut.agregarJuegoDados(dados1);
				do{
					if(turno){
						// Turno del jugador 1
						tirada1 = dados1.tirarDados();
						System.out.println(jugador1+" tira: "+tirada1);
						if(contTur>1){
							if(tirada1_2==tirada1){
								ganador1=1;
								break;
							}
						}
						tirada1_2 = tirada1;
						if(dados1.ganar(tirada1)==0){
							System.out.println(jugador1 +" perdio");
							ganador1=2;
							break;
						}else if(dados1.ganar(tirada1)==1){
							ganador1=1;
							chance=true;
						}
						turno= !turno;
						contTur++;
					}else{
						// Turno de la computadora
						tirada2 = dados1.tirarDados();
						System.out.println("La computadora tira: "+tirada2);
						if(contTur>2){
							if(tirada2_2==tirada2){
								ganador1=2;
								break;
							}
						}
						tirada2_2 = tirada2;
						if(dados1.ganar(tirada2)==0){
							System.out.println("La computadora perdio");
							dados1.asignarEstado("Gano "+jugador1+" contra la computadora");
							ut.EscribirObjetosArchivo("juego2.txt",juego2);
							ganador1=1;
							break;
						}else if(dados1.ganar(tirada2)==1){
							if(chance==false){
								ganador1=2;
								repetir = !repetir;
							}else{
								chance=false;
							}
						}
						if(chance==true){
							repetir=false;
						}
						turno= !turno;
						contTur++;
					}	
				}while(repetir);
				if(ganador1==1){
					System.out.println(jugador1+" gana");
					dados1.asignarEstado("Gano "+jugador1+" contra la computadora");
					ut.EscribirObjetosArchivo("juego2.txt",juego2);
				}else if(ganador1==2){
					System.out.println("La computadora gana");
					dados1.asignarEstado("Perdio "+jugador1+" contra la computadora");
					ut.EscribirObjetosArchivo("juego2.txt",juego2);
				}

				// Se suman puntos dependiendo si el jugador 1 gana o no
				for(int i=0; i<jugadores.length; i++){
					clave1=jugadores[i].obtenerClave();
					if(args[0].equalsIgnoreCase(clave1)){
						if(ganador1==1){
		        			System.out.println(jugador1+" gana "+ganar+" puntos");
		        			jugadores[i].sumarPuntos(ganar);
		        			System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
		        			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        		}else if(ganador1==2){
			        		System.out.println(jugador1+" no ha conseguido ningun punto");
			        	}
						break;
					}
				}
			}else{
				System.out.println("\nError, clave incorrecta. Intentalo de nuevo.\n");
			}
		}else if(args.length==2){
			//jugador vs jugador
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
				Dados dados1 = new Dados();
				juego2 = ut.agregarJuegoDados(dados1);
				do{
					if(turno){
						// Turno del jugador 1
						tirada1 = dados1.tirarDados();
						System.out.println(jugador1+" tira: "+tirada1);
						if(contTur>1){
							if(tirada1_2==tirada1){
								ganador1=1;
								break;
							}
						}
						tirada1_2 = tirada1;
						if(dados1.ganar(tirada1)==0){
							System.out.println(jugador1 +" perdio");
							//dados1.asignarEstado("Perdio "+jugador1+" contra la computadora");
							//ut.EscribirObjetosArchivo("juego2.txt",juego2);
							ganador1=2;
							break;
						}else if(dados1.ganar(tirada1)==1){
							ganador1=1;
							chance=true;
						}
						turno= !turno;
						contTur++;
					}else{
						// Turno del jugador 2
						tirada2 = dados1.tirarDados();
						System.out.println(jugador2+" tira: "+tirada2);
						if(contTur>2){
							if(tirada2_2==tirada2){
								ganador1=2;
								break;
							}
						}
						tirada2_2 = tirada2;
						if(dados1.ganar(tirada2)==0){
							System.out.println(jugador2+" perdio");
							//dados1.asignarEstado("Gano "+jugador1+" contra "+jugador2);
							//ut.EscribirObjetosArchivo("juego2.txt",juego2);
							ganador1=1;
							break;
						}else if(dados1.ganar(tirada2)==1){
							if(chance==false){
								ganador1=2;
								repetir = !repetir;
							}else{
								chance=false;
							}
						}
						if(chance==true){
							repetir=false;
						}
						turno= !turno;
						contTur++;
					}	
				}while(repetir);
				if(ganador1==1){
					System.out.println(jugador1+" gana");
					dados1.asignarEstado("Gano "+jugador1+" contra "+jugador2);
					ut.EscribirObjetosArchivo("juego2.txt",juego2);
				}else if(ganador1==2){
					System.out.println(jugador2+" gana");
					dados1.asignarEstado("Perdio "+jugador1+" contra "+jugador2);
					ut.EscribirObjetosArchivo("juego2.txt",juego2);
				}

				// Si el jugador 1 gana, se le suman 10 puntos
				for(int i=0; i<jugadores.length; i++){
					clave1=jugadores[i].obtenerClave();
					if(args[0].equalsIgnoreCase(clave1)){
						if(ganador1==1){
		        			System.out.println(jugador1+" gana "+ganar+" puntos");
		        			jugadores[i].sumarPuntos(ganar);
		        			System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
		        			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        		}else if(ganador1==2){
			        		System.out.println(jugador1+" no ha conseguido ningun punto");
			        	}
						break;
					}
				}	
				// Si el jugador 2 gana, se le suman 10 puntos
				for(int i=0; i<jugadores.length; i++){
					clave2=jugadores[i].obtenerClave();
					if(args[1].equalsIgnoreCase(clave2)){
						if(ganador1==2){
		        			System.out.println(jugador2+" gana "+ganar+" puntos");
		        			jugadores[i].sumarPuntos(ganar);
		        			System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
		        			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        		}else if(ganador1==1){
			        		//System.out.println(jugador1+" no ha conseguido ningun punto");
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
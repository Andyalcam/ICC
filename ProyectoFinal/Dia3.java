import java.util.Scanner;
public class Dia3 {
	public static void main(String[] args) {

		String clave1="";
		String clave2="";
		String jugador1="";
		String jugador2="";
		String jugadorN="";

		Scanner lector = new Scanner(System.in);
        String figura = "X";
        int x=0;
        int ganar = 10;
        int empate = 5;
        boolean repetir=true;
		
		// Consistencia de objetos
		Jugador [] jugadores = new Jugador[0];
		Conecta4[] juego3 = new Conecta4[0];
		Utilidades ut = new Utilidades();
		jugadores = ut.leerObjetoArchivo("jugadores.txt");
		juego3 = ut.leerObjetoConecta4("juego3.txt");

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
				jugadorN=jugador1;
      	 		Conecta4 juego = new Conecta4();
				juego3 = ut.agregarJuegoC4(juego);
				System.out.println(juego);
		        while(!juego.termino()){
		        	if(juego.empate()==true){
		        		juego.borrarTablero();
		        		System.out.println(juego);
		        	}
		        	do{
		        		System.out.println(jugadorN+" tira "+figura);
		        		repetir=true;
		        		do{
		        			try{
		        				// En este caso solo vamos a pedir la figura X
		        				System.out.print("Columna : ");
		        				x = lector.nextInt();
		        				if(x>=5 || x<=0){
		        					System.out.println("\tNo es una columna valida");
		        				}else{
		        					repetir = false;
		        				}
		        			}catch(Exception e){
		        				System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
		        				lector.next();
		        			}
		        		}while(repetir);
		        	}while(!juego.setTablero(figura,x));
		        	juego.tiraCompu(); // aqui tira la computadora
		        	System.out.println(juego); // aqui imprime el tablero con la tirada de la computadora
		        }

		        // Se suman puntos o no dependiendo di gana, empata o pierde y se escriben los objetos en el archivo .txt
		        for(int i=0; i<jugadores.length; i++){
					clave1=jugadores[i].obtenerClave();
					if(args[0].equalsIgnoreCase(clave1)){
						if(juego.ganarX()==true){
		        			System.out.println(jugador1+" gana "+ganar+" puntos");
		        			jugadores[i].sumarPuntos(ganar);
		        			juego.asignarEstado("Gano "+jugador1+" contra la computadora");
		        			System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
		        			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        			ut.EscribirObjetosArchivo("juego3.txt",juego3);
		        		}else if(juego.ganarX()==false && juego.ganarO()==false){
		        			System.out.println(jugador1+" gana "+empate+" puntos");
			        		jugadores[i].sumarPuntos(empate);
			        		juego.asignarEstado(jugador1+" empato con la computadora");
			        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
			        		ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        			ut.EscribirObjetosArchivo("juego3.txt",juego3);
			        	}else{
			        		System.out.println("La computadora gana");
			        		System.out.println(jugador1+" no ha conseguido ningun punto");
			        		juego.asignarEstado("Perdio "+jugador1+" contra la computadora");
			        		ut.EscribirObjetosArchivo("juego3.txt",juego3);
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
				jugadorN=jugador1;
      	 		Conecta4 juego = new Conecta4();
				juego3 = ut.agregarJuegoC4(juego);
				System.out.println(juego);
		        while(!juego.termino()){
		        	if(juego.empate()==true){
		        		juego.borrarTablero(); // si se llega a un empate se borra el tablero y se inicia ota vez el juego
		        		System.out.println(juego);
		        	}
		        	do{
		        		System.out.println(jugadorN+" tira "+figura);
		        		repetir=true;
		        		do{
		        			try{
		        				// En este caso si pedimos a los usuarios las marcas X y O
		        				System.out.print("Columna : ");
		        				x = lector.nextInt();
		        				if(x>=5 || x<=0){
		        					System.out.println("\tNo es una columna valida");
		        				}else{
		        					repetir = false;
		        				}
		        			}catch(Exception e){
		        				System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
		        				lector.next();
		        			}
		        		}while(repetir);
		        	}while(!juego.setTablero(figura,x));
		        	System.out.println(juego);
		        	figura = figura.equals("X")?"O":"X"; // aqui se intercambian las figuras para cada turno
		        	jugadorN = jugadorN.equals(jugador1)?jugador2:jugador1; // aqui se intercambia el nombre de los jugadores para saber quien tira
		        }

		        // Se verifica si el jugador 1 gana, pierde o empata
		        for(int i=0; i<jugadores.length; i++){
					clave1=jugadores[i].obtenerClave();
					if(args[0].equalsIgnoreCase(clave1)){
						if(juego.ganarX()==true){
		        			System.out.println(jugador1+" gana "+ganar+" puntos");
		        			jugadores[i].sumarPuntos(ganar);
		        			juego.asignarEstado("Gano "+jugador1+" contra "+jugador2);
		        			System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
		        			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        			ut.EscribirObjetosArchivo("juego3.txt",juego3);
		        		}else if(juego.ganarX()==false && juego.ganarO()==false){
		        			System.out.println(jugador1+" gana "+empate+" puntos");
			        		jugadores[i].sumarPuntos(empate);
			        		juego.asignarEstado(jugador1+" empato con "+jugador2);
			        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
			        		ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        			ut.EscribirObjetosArchivo("juego3.txt",juego3);
			        	}
						break;
					}
				}
				// Se verifica si el jugador 2 gana, pierde o empata
				for(int i=0; i<jugadores.length; i++){
					clave2=jugadores[i].obtenerClave();
					if(args[1].equalsIgnoreCase(clave2)){
						if(juego.ganarO()==true){
		        			System.out.println(jugador2+" gana "+ganar+" puntos");
		        			jugadores[i].sumarPuntos(ganar);
		        			juego.asignarEstado("Gano "+jugador2+" contra "+jugador1);
		        			System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
		        			ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        			ut.EscribirObjetosArchivo("juego3.txt",juego3);
		        		}else if(juego.ganarX()==false && juego.ganarO()==false){
			        		System.out.println(jugador2+" gana "+empate+" puntos");
			        		jugadores[i].sumarPuntos(empate);
			        		//juego.asignarEstado(jugador2+" empato con "+jugador1);
			        		System.out.println("Total de puntos: "+jugadores[i].obtenerPuntos()+"\n");
			        		ut.EscribirObjetosArchivo("jugadores.txt",jugadores);
		        			//ut.EscribirObjetosArchivo("juego3.txt",juego3);
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
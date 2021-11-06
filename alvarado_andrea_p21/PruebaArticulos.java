import java.util.Scanner;
/**
* Programa para organizar articulos de una tienda
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class PruebaArticulos{
	public static void main (String[] pps){

		// Declaracion de variables
		int lector=0;
		int año=0;
		int numCan=0;
		int duracion=0;
		boolean salir=false;
		boolean repetir=true;
		boolean excep=true;
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		String titulo="";
		String autor="";
		String editorial="";
		String interprete="";
		String idioma="";
		String genero="";
		String director="";

		// Creacion de arreglos de los diferentes tipos de objetos a organizar 
		Libro [] libros = new Libro[0];
		Disco [] discos = new Disco[0];
		Pelicula [] peliculas = new Pelicula[0];
		Utilidaddes ut = new Utilidaddes();

		libros = ut.leerObjetoArchivo("libros.txt");
		discos = ut.leerObjetoArchivoD("discos.txt");
		peliculas = ut.leerObjetoArchivoP("peliculas.txt");

		do{
			try{
				//while(salir!=true){  //Se comento el while porque el do while de la excepcion del menu ya repite todo el codigo :)
				// Menu principal
					System.out.println("\n***ALMACENA LIBROS, DISCOS Y PELICULAS***");
					System.out.println("\n1.- Agregar libros");
					System.out.println("2.- Agregar discos");
					System.out.println("3.- Agregar peliculas");
					System.out.println("4.- Mostrar libros");
					System.out.println("5.- Mostrar discos");
					System.out.println("6.- Mostrar peliculas");
					System.out.println("7.- Mostrar todos los articulos");
					System.out.println("8.- Salir");
					System.out.print("Elegir opcion: ");
					lector = in.nextInt();

					switch(lector){
						// Agregar libros
						case 1:
						System.out.print("\nTitulo del libro: ");
            			titulo = on.nextLine();

						System.out.print("Autor del libro: ");
						autor = on.nextLine();

						repetir=true;
						do{
							try{
								System.out.print("Año de publicacion del libro: ");
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

						System.out.print("Editorial del libro: ");
						editorial = on.nextLine();
						Libro nuevo = new Libro(titulo,autor,año,editorial);
						libros = ut.agregarLibroArreglo(nuevo);
						break;

						// Agregar discos
						case 2:
						System.out.print("\nTitulo del disco: ");
						titulo = on.nextLine();
						System.out.print("Interprete del disco: ");
						interprete = on.nextLine();

						repetir=true;
						do{
							try{
								System.out.print("Año de lanzamiento: ");
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

						System.out.print("Genero: ");
						genero = on.nextLine();

						repetir=true;
						do{
							try{
								System.out.print("Numero de canciones del disco: ");
								numCan = in.nextInt();
								if(numCan>0){
									repetir = false;
								}else{
									System.out.println("\tDebes ingresar un numero mayor a 0");
								}
							}catch(Exception e){
								System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
								in.next();
							}
						}while(repetir);

						System.out.print("Idioma del disco: ");
						idioma = on.nextLine();
						Disco nuevo1 = new Disco(titulo,interprete,año,genero,numCan,idioma);
						discos = ut.agregarDiscoArreglo(nuevo1);
						break;

						// Agregar peliculas
						case 3:
						System.out.print("\nTitulo de la pelicula: ");
						titulo = on.nextLine();
						System.out.print("Director de la pelicula: ");
						director = on.nextLine();

						repetir=true;
						do{
							try{
								System.out.print("Año de estreno: ");
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

						System.out.print("Genero: ");
						genero = on.nextLine();

						repetir=true;
						do{
							try{
								System.out.print("Duracion de la pelicula en minutos: ");
								duracion = in.nextInt();
								if(duracion>0){
									repetir = false;
								}else{
									System.out.println("\tDebes ingresar un numero mayor a 0");
								}
							}catch(Exception e){
								System.out.println("\t"+e+" Debes ingresar un numero\n\tIntentalo de nuevo");
								in.next();
							}
						}while(repetir);

						System.out.print("Idioma de la pelicula: ");
						idioma = on.nextLine();
						Pelicula nuevo3 = new Pelicula(titulo,director,año,genero,duracion,idioma);
						peliculas = ut.agregarPeliArreglo(nuevo3);
						break;

						// Mostrar libros registrados
						case 4:
						System.out.println("\n***LIBROS ALMACENADOS***");
						if(libros[0]==null){
							System.out.println("No hay libros almacenados");
						}else{
							for(int i=0; i<libros.length; i++){
								if(libros[i] == null){
									break;
								}
								System.out.println(libros[i]);
							}
						}
						break;

						// Mostrar discos registrados
						case 5:
						System.out.println("\n***DISCOS ALMACENADOS***");
						if(discos[0]==null){
							System.out.println("No hay discos almacenados");
						}else{
							for(int i=0; i<discos.length; i++){
								if(discos[i] == null){
									break;
								}
								System.out.println(discos[i]);
							}
						}
						break;

						// Mostrar peliculas registradas
						case 6:
						System.out.println("\n***PELICULAS ALMACENADAS***");
						if(peliculas[0]==null){
							System.out.println("No hay peliculas almacenadas");
						}else{
							for(int i=0; i<peliculas.length; i++){
								if(peliculas[i] == null){
									break;
								}
								System.out.println(peliculas[i]);
							}
						}
						break;

						// Mostrar todos los articulos registrados
						case 7:
						System.out.println("\n***LIBROS ALMACENADOS***");
						if(libros[0]==null){
							System.out.println("No hay libros almacenados");
						}else{
							for(int i=0; i<libros.length; i++){
								if(libros[i] == null){
									break;
								}
								System.out.println(libros[i]);
							}
						}
						System.out.println("\n***DISCOS ALMACENADOS***");
						if(discos[0]==null){
							System.out.println("No hay discos almacenados");
						}else{
							for(int i=0; i<discos.length; i++){
								if(discos[i] == null){
									break;
								}
								System.out.println(discos[i]);
							}
						}
						System.out.println("\n***PELICULAS ALMACENADAS***");
						if(peliculas[0]==null){
							System.out.println("No hay peliculas almacenadas");
						}else{
							for(int i=0; i<peliculas.length; i++){
								if(peliculas[i] == null){
									break;
								}
								System.out.println(peliculas[i]);
							}
						}
						break;

						// Salir del programa
						case 8:
						ut.EscribirObjetosArchivo("libros.txt",libros);
						ut.EscribirObjetosArchivo("discos.txt",discos);
						ut.EscribirObjetosArchivo("peliculas.txt",peliculas);
						System.out.println("\n\tHasta luego :)\n");
						//salir=true;
						System.exit(0); // Salida del programa 
						break;

						default:
						System.out.println("Elige una opcion de menu plis :c");
						break;
					}
				//}
			}catch(Exception e2){
				System.out.println("\n\n"+e2+"Debes ingresar un numero");
				in.next();
				excep=true;
			}
		}while(excep);
	} 
}






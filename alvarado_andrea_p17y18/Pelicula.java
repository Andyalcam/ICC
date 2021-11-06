/**
* Clase que extiende a la clase Disco para peliculas
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Pelicula extends Disco{

	/**
	* Constructor para una pelicula que se crea 
	* a partir del constructor de Disco
	* @param var1 - titulo de la pelicula
	* @param var2 - director de la pelicula
	* @param var3 - año de estreno
	* @param var4 - genero de la pelicula
	* @param var5 - duracion de la pelicula en minutos
	* @param var6 - idioma de la pelicula
	*/
	public Pelicula(String var1, String var2, int var3, String var4, int var5, String var6){
		super(var1,var2,var3,var4,var5,var6);
	}

	/**
	* Metodo para imprimir la pelicula
	* @return String - imprime la pelicula de tal forma que se vea toda su informacion
	*/
	public String toString() {
		a = "\nEl titulo de la pelicula es: "+obtenerTitulo();
		b = "El director de la pelicula es: "+obtenerAutor();
		c = "El año de estreno de la pelicula es: "+obtenerAnio();
		d = "El genero de la pelicula es: "+obtenerEdit();
		e = "La duracion de la pelicula en minutos es: "+obtenerNumCan();
		f = "El idioma de la pelicula es: "+obtenerIdioma();
		return a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f;
   }
	
}
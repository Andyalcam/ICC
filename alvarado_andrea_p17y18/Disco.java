/**
* Clase que extiende a la clase Libro para discos
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Disco extends Libro{

	protected String idioma,e,f;
	protected int numCan;

	/**
	* Constructor para un disco que se crea 
	* a partir del constructor de Libro
	* @param var1 - titulo del disco
	* @param var2 - interprete del disco
	* @param var3 - año de lanzamineto
	* @param var4 - genero del disco
	* @param var5 - numero de canciones del disco
	* @param var6 - idioma del disco
	*/
	public Disco(String var1, String var2, int var3, String var4, int var5, String var6){
		super(var1,var2,var3,var4);
		this.numCan = var5;
		this.idioma = var6;
	}

	/**
	* Metodo para obtener el numero de canciones del disco
	* @return int - el numero de canciones que contiene el disco
	*/
	public int obtenerNumCan(){
		return this.numCan;
	}

	/**
	* Metodo para asignar numero de canciones a un disco
	* @param var5 - numero de la cantidad de canciones
	*/
	public void asignarNunCan(int var5) {
      this.numCan = var5;
   	}

   	/**
	* Metodo para obtener el idioma
	* @return String - el idioma del disco
	*/
   	public String obtenerIdioma(){
		return this.idioma;
	}

	/**
	* Metodo para asignar idioma a un disco
	* @param var4 - cadena con el idioma de un disco
	*/
	public void asignarIdioma(String var6) {
      this.idioma = var6;
   	}

	/**
	* Metodo para imprimir el disco
	* @return String - imprime el disco de tal forma que se vea toda su informacion
	*/
	public String toString() {
		a = "\nEl titulo del disco es: "+obtenerTitulo();
		b = "El interprete del disco es: "+obtenerAutor();
		c = "El año de lanzamiento del disco es: "+obtenerAnio();
		d = "El genero del disco es: "+obtenerEdit();
		e = "El numero de canciones del disco es: "+obtenerNumCan();
		f = "El idioma del disco es: "+obtenerIdioma();
		return a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f;
   }
	
}
/**
* Clase que extiende a la clase Articulo para libros
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Libro extends Articulo{
	//Atributo editoral el cual se va a agregar al constructor
	protected String editorial,a,b,c,d;

	/**
	* Constructor para un libro que se crea 
	* a partir del constructor de Articulo
	* @param var1 - titulo del libro
	* @param var2 - autor del libro
	* @param var3 - año de publicacion
	* @param var4 - editorial del libro
	*/
	public Libro(String var1, String var2, int var3, String var4){
		super(var1,var2,var3);
		this.editorial=var4;
	}

	/**
	* Metodo para obtener la editorial
	* @return String - la editorial del libro
	*/
	public String obtenerEdit(){
		return this.editorial;
	}

	/**
	* Metodo para asignar editorial al libro
	* @param var4 - cadena con el nombre de la editorial
	*/
	public void asignarEdit(String var4) {
      this.editorial = var4;
   	}

	/**
	* Metodo para imprimir el libro
	* @return String - imprime el libro de tal forma que se vea toda su informacion
	*/
	public String toString() {
		a = "\nEl titulo del libro es: "+obtenerTitulo();
		b = "El autor del libro es: "+obtenerAutor();
		c = "El año de publicacion del libro es: "+obtenerAnio();
		d = "La editorial del libro es: "+obtenerEdit();
		return a+"\n"+b+"\n"+c+"\n"+d;
   }
}
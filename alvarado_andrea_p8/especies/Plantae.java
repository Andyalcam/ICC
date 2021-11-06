/**
 * Clase para Plantas
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
// Definir en que paquete esta la clase
package especies;
public class Plantae {

// Atributos
    private String nomComun;
    private String nomCientifico;
    private String reino;
    private String clase;
    private String orden;

	/**
    * Constructor para crear una planta
    * @param nomComun - valor para el nombre comun de la planta
    * @param nomCientifico - valor para nombre cientifico de la planta
    * @param reino - valor para el reino al que pertenece
    * @param clase - valor para la clase a la que pertenece
    * @param orden - valor para el orden al que pertenece
    */
    public Plantae(String nomComun, String nomCientifico, String reino, String clase, String orden){
		this.nomComun = nomComun;
		this.nomCientifico = nomCientifico;
		this.reino = reino;
		this.clase = clase;
		this.orden = orden;
	}

	/**
    * Metodo para imprimir en terminal la especie
    * @return Todos los atributos de la especie
    */
	public String toString(){
    return "\nNombre Comun: "+nomComun+"\nNombre Cientifico: "+nomCientifico+
    		"\nReino: "+reino+"\nClase: "+clase+"\nOrden: "+orden+"\n";
  	}
}
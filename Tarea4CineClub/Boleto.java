/**
 * Clase de boletos que organiza a un Cine Club
 * @author Andrea Alvarado Camacho
 * @version
 */
public class Boleto{
	private String funcion;
	private int tipo;
	private int costo;

	/**
     * Constructor para un boleto del cine club
     * @param fun - nombre de la funcion
     * @param tipo - tipo de funcion
     * @param cost - costo del boleto
     */
    public Boleto (String fun, int tipo, int cost) {
        funcion = fun;
        this.tipo = tipo;
        costo = cost;
    }

    /**
     * Método para asignar la funcion
     * @param funcion -- cadena con el nombre de la funcion
     */
    public void asignarFuncion(String funcion) {
        this.funcion = funcion;
    }

    /**
     * Método para asignar el tipo de boleto
     * @param tipo -- cadena con el tipo de boleto
     */
    public void asignarTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Método para asignar el costo del boleto
     * @param costo -- valor para el costo del boleto
     */
    public void asignarCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Método para obtener la funcion
     * @return String -  la funcion del boleto
     */
    public String obtenerFuncion() {
        return funcion;
    }

    /**
     * Método para obtener el tipo de boleto
     * @return String -  tipo de boleto
     */
    public int obtenerTipo() {
        return tipo;
    }

    /**
     * Método para obtener el costo del boleto
     * @return String -  costo del boleto
     */
    public int obtenerCosto() {
        return costo;
    }

    /**
     * Método para comparar dos boletos
     * @param boleto -- boleto con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Boleto boleto) {
       if (this.obtenerFuncion().equals(boleto.obtenerFuncion()) && this.obtenerTipo()==boleto.obtenerTipo() && this.obtenerCosto()==boleto.obtenerCosto()){
       	return true;
       }else
       return false;
    }

	/**
    * Metodo para imprimir el boleto
    * @return Imprimir el boleto tal que se vea la funcion, tipo
	* de boleto y costo.
    */
	public String toString(){
    return "-----------------------------------------------------\n\tNombre de la funcion: "+funcion+"\n\t\tTipo de boleto: "+tipo+
    		"\n\t\t    Costo: "+costo+"\n-----------------------------------------------------"+"\n";
  	}

  	/**
  	* Metodo para calcular precio de un boleto
  	* @param tipo -- si es individual o general
  	*/
  	public void calcularPrecio(int tipo){
  		if(tipo==1){
  			this.costo=50; //general
  		}else{
  			if(tipo==2){
  				this.costo=10; // individual
  			}else
  			System.out.println("No es valido el tipo de boleto");
  		}

  	}
}
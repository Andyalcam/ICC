/**
* Programa para jugar Mini Black Jack que extiende de clase Baraja
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class MiniBJ extends Baraja{

	private boolean ganar;
	private String estado;

	/**
    * Constructor que tiene como parametro un string
    * @param estado - valor para el estado del juego: ganar, perder o empate
    */
    public MiniBJ(String estado){
		this.estado= estado;
	}

	/**
    * Constructor por omision
    */
    public MiniBJ(){
		super();
		this.estado= "MiniBJ: ";
	}

	/**
    * Metodo para asignar el estado del juego
    * @param estadoN - cadena con el nuevo estado del juego
    */
    public void asignarEstado(String estadoN){
    	this.estado+=estadoN;
   	}

  	/**
    * Metodo para obtener el estado del juego
    * @return estado
    */
    public String obtenerEstado(){
  		return this.estado;
   	}

	/**
    * Metodo que cambia los valores de las cartas J Q K por 10
    */
    public void cambiarValor(){
		for(int i=0; i<arreglo.length; i++){
			if(arreglo[i].obtenerValor()==11 || arreglo[i].obtenerValor()==12 || arreglo[i].obtenerValor()==13){
				arreglo[i].asignarValor(10);
			}
		}
	}
}
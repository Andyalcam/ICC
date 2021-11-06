import java.util.Random;
import java.io.Serializable;
/**
* Programa para jugar dados
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Dados implements Serializable{

	int [] dado1;
	int [] dado2;
	int tirada = 0;
	int ganar=2;
	String estado;
	Random random = new Random();

	/**
    * Constructor que tiene como parametro un string
    * @param estado - valor para el estado del juego: ganar, perder o empate
    */
    public Dados(String estado){
		this.estado=estado;
	}
	
	/**
    * Constructor por omision
    */
    public Dados(){
		this.estado = "Dados: ";
		int num=1;
		int num1=1;
		dado1 = new int [6];
    	for(int i=0; i<dado1.length; i++){
    		dado1[i]=num;
    		num++;
		}
		dado2 = new int [6];
    	for(int i=0; i<dado2.length; i++){
    		dado2[i]=num1;
    		num1++;
		}
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
    *Metodo que tira los dados al azar
    *@return int - valor de los dados sumados
    */
    public int tirarDados(){
		int i = random.nextInt(dado1.length);
		int j = random.nextInt(dado2.length);
		tirada = dado1[i]+dado2[j];
		return tirada;
	}

	/**
    *Metodo para saber si alguien ya gano
    *@return int - 1 si se gano, 0 si se perdio y 2 si se tiene que volver a tirar
    */
    public int ganar(int tirada){
		if(tirada==7){
			ganar = 1;
		}else if(tirada==11){
			ganar = 1;
		}else if(tirada==2){
			ganar = 0;
		}else if(tirada==3){
			ganar = 0;
		}else if(tirada==12){
			ganar = 0;
		}else{
			ganar = 2;
		}
		return ganar;
	}
}
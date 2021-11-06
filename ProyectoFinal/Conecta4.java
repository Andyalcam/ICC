import java.util.Random;
import java.io.Serializable;
/**
* Programa para jugar conecta 4
* @author Andrea Alvarado Camacho
* @version 1.1
*/
public class Conecta4 implements Serializable{
	private int turno;
    private String [][] tablero;
    private String marcaX = "X";
    private String marcaO = "O";
    private String estado;
    private Random random = new Random();

    /**
    * Constructor que tiene como parametro un string
    * @param estado - valor para el estado del juego: ganar, perder o empate
    */
    public Conecta4(String estado){
        this.estado = estado;
      }

    /**
    * Constructor por omision
    */
    public Conecta4(){
        this.estado = "Conecta 4: ";
        tablero = new String [4] [4];
    	for(int i=0; i<tablero.length; i++){
    		for(int j=0; j<tablero[i].length; j++){
    			tablero[i][j]=" ";
     	 	}
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
    *Metodo que coloca una figura en el tablero segun la posicion.
    *Si hay espacio la coloca  regresa true.
    *Si no hay espacio regresa false
    *@param fig - Figura que se pone en el tablero
    *@param x - Coordenada x del tablero
    *@return boolean
    */
    public boolean setTablero(String fig,int x){
    	boolean boo = true;
	    	for(int i=tablero.length-1; i>=0; i--){
		    	if(x>=1 && x<=4){
		    		if(tablero [i][x-1].equals(marcaX) || tablero [i][x-1].equals(marcaO)){
		    			boo = false;
		    		}else{
		    			tablero [i][x-1]=fig;
						turno++;
						boo = true;
						break;
		    		}
				}
			}
		return boo;
	}

	/**
    *Metodo que verifica si acabo el juego.
    *Si hay un ganador o se llega a un empate regresa true
    *Si el juego aun no acaba, regresa false
    */
    boolean termina;
    public boolean termino(){
        if (this.ganarO()==true){
            System.out.println("¡Felicidades!\n");
            termina = true;
        }else if (this.ganarX()==true){
            System.out.println("¡Felicidades!\n");
            termina = true;
        }else if(turno==32){
        	System.out.println("\nEMPATE, TERMINA EL JUEGO\n");
        	termina = true;
        }else{
            termina = false;
        }
        return termina;
    }

    /**
    *Metodo toString que imprime el tablero
    *@return tablero
    */
    public String toString(){
        String acc = getLinea()+"\n";
      	for(int i=0;i<tablero.length;i++){
        	acc+="| ";
        	for(int j=0;j<tablero[i].length;j++)
        		acc += tablero[i][j]+" | ";
        		acc +="\n"+getLinea()+"\n";
      	}
      	return acc;
    }

    /**
    *Metodo getLinea que imprime una linea en el tablero
    *@return String
    */
    private String getLinea(){
        return "-----------------";
    }

    /**
    *Metodo borrarTablero que borra el juego del tablero
    */
    public void borrarTablero(){
        for(int i=0; i<tablero.length;i++){
		    for(int j=0; j<tablero[i].length; j++){
		       	tablero[i][j]=" ";
		  	}
		}
    }

    /**
    *Metodo empate que verifica si hay empate
    */
    boolean gano;
    public boolean empate(){
        if(turno==16){
        	System.out.println("EMPATE, SEGUNDO ROUND\n");
        	gano=true;
        }
        return gano;
    }

    /**
    *Metodo ganarX que verifica si el jugador X gano
    *@return boolean
    */
    public boolean ganarX(){
        if(tablero[0][0].equals(marcaX) && tablero[0][1].equals(marcaX) && tablero[0][2].equals(marcaX) && tablero[0][3].equals(marcaX)){
            gano = true;
        }else if(tablero[1][0].equals(marcaX) && tablero[1][1].equals(marcaX) && tablero[1][2].equals(marcaX) && tablero[1][3].equals(marcaX)){
            gano = true;
        }else if(tablero[2][0].equals(marcaX) && tablero[2][1].equals(marcaX) && tablero[2][2].equals(marcaX) && tablero[2][3].equals(marcaX)){
            gano = true;
        }else if(tablero[3][0].equals(marcaX) && tablero[3][1].equals(marcaX) && tablero[3][2].equals(marcaX) && tablero[3][3].equals(marcaX)){
            gano = true;
        }else if(tablero[0][0].equals(marcaX) && tablero[1][0].equals(marcaX) && tablero[2][0].equals(marcaX) && tablero[3][0].equals(marcaX)){
            gano = true;
        }else if(tablero[0][1].equals(marcaX) && tablero[1][1].equals(marcaX) && tablero[2][1].equals(marcaX) && tablero[3][1].equals(marcaX)){
            gano = true;
        }else if(tablero[0][2].equals(marcaX) && tablero[1][2].equals(marcaX) && tablero[2][2].equals(marcaX) && tablero[3][2].equals(marcaX)){
            gano = true;
        }else if(tablero[0][3].equals(marcaX) && tablero[1][3].equals(marcaX) && tablero[2][3].equals(marcaX) && tablero[3][3].equals(marcaX)){
            gano = true;
        }else if(tablero[0][0].equals(marcaX) && tablero[1][1].equals(marcaX) && tablero[2][2].equals(marcaX) && tablero[3][3].equals(marcaX)){
            gano = true;
        }else if(tablero[0][3].equals(marcaX) && tablero[1][2].equals(marcaX) && tablero[2][1].equals(marcaX) && tablero[3][0].equals(marcaX)){
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarO que verifica si el jugador O gano
    *@return boolean
    */
    public boolean ganarO(){
        if(tablero[0][0].equals(marcaO) && tablero[0][1].equals(marcaO) && tablero[0][2].equals(marcaO) && tablero[0][3].equals(marcaO)){
            gano = true;
        }else if(tablero[1][0].equals(marcaO) && tablero[1][1].equals(marcaO) && tablero[1][2].equals(marcaO) && tablero[1][3].equals(marcaO)){
            gano = true;
        }else if(tablero[2][0].equals(marcaO) && tablero[2][1].equals(marcaO) && tablero[2][2].equals(marcaO) && tablero[2][3].equals(marcaO)){
            gano = true;
        }else if(tablero[3][0].equals(marcaO) && tablero[3][1].equals(marcaO) && tablero[3][2].equals(marcaO) && tablero[3][3].equals(marcaO)){
            gano = true;
        }else if(tablero[0][0].equals(marcaO) && tablero[1][0].equals(marcaO) && tablero[2][0].equals(marcaO) && tablero[3][0].equals(marcaO)){
            gano = true;
        }else if(tablero[0][1].equals(marcaO) && tablero[1][1].equals(marcaO) && tablero[2][1].equals(marcaO) && tablero[3][1].equals(marcaO)){
            gano = true;
        }else if(tablero[0][2].equals(marcaO) && tablero[1][2].equals(marcaO) && tablero[2][2].equals(marcaO) && tablero[3][2].equals(marcaO)){
            gano = true;
        }else if(tablero[0][3].equals(marcaO) && tablero[1][3].equals(marcaO) && tablero[2][3].equals(marcaO) && tablero[3][3].equals(marcaO)){
            gano = true;
        }else if(tablero[0][0].equals(marcaO) && tablero[1][1].equals(marcaO) && tablero[2][2].equals(marcaO) && tablero[3][3].equals(marcaO)){
            gano = true;
        }else if(tablero[0][3].equals(marcaO) && tablero[1][2].equals(marcaO) && tablero[2][1].equals(marcaO) && tablero[3][0].equals(marcaO)){
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo que hace que la computadora tire cuando sea su turno
    */
    public void tiraCompu(){
    	int j=0;
	    for(int i=tablero.length-1; i>=0; i--){
	    	j = random.nextInt(4)+1;
	    	if(tablero[i][j-1].equals(marcaX) || tablero[i][j-1].equals(marcaO)){
	   			j = random.nextInt(4)+1;
	    	}else{
	    		this.setTablero(marcaO,j);
	    		break;
	    	}
		}
    }
}
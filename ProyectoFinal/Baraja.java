/**
 * Clase que crea una baraja de cartas
 * @author Andrea Alvarado Camacho
 * @version 1.2
 */
import java.io.Serializable;
public class Baraja implements Serializable{

    protected Carta [] arreglo;
    protected int contador = 0;

    /**
     * Constructor por omision que crea un arreglo con 52 cartas
     */
    public Baraja(){
        arreglo = new Carta[53];
        for(int i =1; i<=13;i++){
            arreglo[i] = new Carta(i,"diamante");
            arreglo [i+13]= new Carta(i,"trebol");
            arreglo[i+26] = new Carta(i,"picas");
            arreglo[i+39] = new Carta(i,"corazon");
        }
        Carta [] temporal = new Carta[52];
        for(int j =0; j<temporal.length; j++){
            temporal[j] =arreglo[j+1];
        }
        arreglo = temporal;
    }

    /**
     * Método para obtener el arreglo
     * @return Carta [] -  el arreglo de la baraja
     */
    public Carta [] obtenerArreglo(){
        return arreglo;
    }

    /**
     * Método para asignar un nuevo arreglo
     * @param nuevo -- valor para el nuevo arreglo
     */
    public void asignarArreglo(Carta[] nuevo){
        arreglo = nuevo;
    }

    /**
     * Método para tomar carta
     * @return Carta -  nueva carta al azar
     */
    public Carta tomarCarta(){
        this.revolver();
        Carta nuevaCarta = this.arreglo[0];
        return nuevaCarta;
    }

    /* * Metodo que genera numeros aleatorios entre 0 y max. */
    private int random(int max) {
        return (int) Math.round(Math.random() * max + 0.5);
    }

    /**
     * Método para revolver las cartas de la baraja
     */
    public void revolver(){
        for(int k = 0; k < arreglo.length; k++){
            int numRan = random(arreglo.length -1);
            Carta temporal = arreglo[numRan];
            arreglo[numRan] = arreglo[k];
            arreglo[k] = temporal;
        }
    }

    /**
     * Método para comparar dos cartas
     * @param a -- carta con la que se va a comparar
     * @param b -- carta con la que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Carta a, Carta b){
    return (a.obtenerValor()==b.obtenerValor() || a.obtenerFigura()==b.obtenerFigura());
    }

    /**
     * Método para imprimir la baraja
     * @return String -- cadena que contiene la baraja.
     */
    public String toString(){
        String cadena = "";
        for (int m = 0; m<arreglo.length; m++){
            cadena += "\n"+ arreglo[m];
        }
        return cadena;
    }
}







/**
 * Clase para controlar la contestadora
 * @author Andrea Alvarado Camacho
 */
public class Contestadora {
    
    //Estructura de la contestadora
    Mensaje [] contestadora;

    /**
    * Constructor de una contestadora con capacidad para 10 mensajes
    */
    public Contestadora() {
        contestadora = new Mensaje[10];
    }

    /**
    * Constructor de una contestadora con capacidad para n mensajes
    * @param n - capacidad de la contestadora
    */
    public Contestadora(int n) {
        contestadora = new Mensaje[n];
    }

    /**
    *  Metodo que agrega un nuevo mensaje a la contestadora.
    *  @param nuevoMensaje Nuevo mensaje que sera agregado a la contestadora.
    */
    public void agregarMensaje(Mensaje nuevoMensaje){
        boolean estarLleno = false;
        for (int i=0; i<contestadora.length; i++) {
            if (contestadora[i]==null || contestadora[i].fueEscuchado()==true) {
                contestadora[i]=nuevoMensaje;
                estarLleno = false;
                break;
            }else{
                estarLleno = true;
            }
        }
        if (estarLleno==true){
            System.out.println("\nLa Contestadora está llena!");
        }
    }

    /**
    *  Metodo que imprime en pantalla el contenido de la contestadora.
    */
    public void escucharMensajes(){
        for (int i=0; i<contestadora.length; i++){
            int a=i+1;
            if(contestadora[i]==null){
                if(contestadora[i]==null){
                    System.out.println("\nYa no hay mas mensajes :c");
                    break;
                }else
                    System.out.println((a)+" mensaje(s) escuchados ");
            }else if (contestadora[i].fueEscuchado()==false && contestadora[i]!=null){
                System.out.print("Mensaje "+(a)+": ");
                System.out.println(contestadora[i].escucha());
            }
        }
    }

    /**
    *  Metodo que imprime en pantalla el contenido del mensaje reciente.
    */
    public void escucharMensajeReciente(){
        for (int i=0; i<contestadora.length; i++){
            if(contestadora[i]==null){
                System.out.println("\nNo hay mensajes :c");
                break;
            }else if (contestadora[i].fueEscuchado()==false && contestadora[i]!=null){
                System.out.println(contestadora[i].escucha());
                break;
            }
        }
    }
}












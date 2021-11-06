/**
 * Clase que funciones organiza a un Cine Club
 * @author Andrea Alvarado Camacho
 * @version
 */
public class Funcion{
	private final int capacidad = 10;
	private int lugDisp = capacidad;
	private String horario;
	private String pelicula;
    private int recaudadoFuncion;
    private static int dinGeneral;
    private static int dinTotal;

	/**
     * Constructor para una funcion del cine club
     * @param hora - nombre de la funcion
     * @param peli - tipo de funcion
     */
    public Funcion (String hora, String peli) {
        this.recaudadoFuncion = 0;
        this.dinGeneral = 0;
        this.dinTotal = 0;
        this.horario = hora;
        pelicula = peli;
    }

    /**
     * Método para asignar una pelicula
     * @param pelicula -- cadena con el nombre de la pelicula
     */
    public void asignarPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Método para asignar el horario
     * @param tipo -- cadena con el horaro de la funcion
     */
    public void asignarHorario(String horario) {
        this.horario = horario;
    }

    /**
     * Método para asignar lo recaudado por cada funcion
     * @param recaudadoFuncion -- valor para lo recaudado por cada funcion
     */
    public void asignarRecaudado(int recaudadoFuncion) {
        this.recaudadoFuncion = recaudadoFuncion;
    }

    /**
     * Método para asignar lo recaudado en boletos generales
     * @param dinGeneral -- valor para lo recaudado en boletos generales
     */
    public void asignarGeneral(int dinGeneral) {
        this.dinGeneral = dinGeneral;
    }

    /**
     * Método para asignar lo recaudado total
     * @param dinTotal -- valor para lo recaudado total
     */
    public void asignarTotal(int dinTotal) {
        this.dinTotal = dinTotal;
    }

    /**
     * Método para obtener la funcion
     * @return String -  la funcion del boleto
     */
    public String obtenerPelicula() {
        return pelicula;
    }

    /**
     * Método para obtener el horario
     * @return String -  horario de la funcion
     */
    public String obtenerHorario() {
        return horario;
    }

    /**
     * Método para obtener lo recaudado por cada funcion
     * @return int -  valor para lo recaudado por cada funcion
     */
    public int obtenerGeneral() {
        return dinGeneral;
    }

    /**
     * Método para obtener lo recaudado en total
     * @return int -  valor para lo recaudado en total
     */
    public int obtenerTotal() {
        return dinTotal;
    }

    /**
     * Método para obtener lugares disponibles
     * @return int -  valor para lugares disponibles
     */
    public int obtenerDisponibles() {
        return lugDisp;
    }

    /**
     * Método para comparar dos boletos
     * @param boleto -- boleto con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean comparar (Funcion f) {
       if (this.obtenerHorario().equals(f.obtenerHorario()) && this.obtenerPelicula().equals(f.obtenerPelicula())){
       	return true;
       }else
        return false;
    }

    /**
     * Método para disminuir lugares
     */
    public void disminuirLugares(){
        if(capacidad>0){
            lugDisp --;
        }else
            System.out.println("No hay lugares disponibles");
    }

    /**
     * Método para sumar lo recaudado
     * @param p --Boleto para sumar lo total recaudado sabiendo el tipo de boleto
     */
    public void sumarGeneral(Boleto b){
        dinGeneral += b.obtenerCosto();
    }

    /**
     * Método para sumar lo recaudado total
     * @param p --Boleto para sumar lo total recaudado sabiendo su costo
     */
    public void sumarTotalRecaudado(Boleto b){
        dinTotal += b.obtenerCosto();
        if(b.obtenerTipo()==1){
            dinTotal += b.obtenerCosto();
        }else if(b.obtenerTipo()==2){
            dinTotal += b.obtenerCosto();
        }
    }

    /**
     * Método para comprar boletos
     */
    public Boleto comprarBoleto(int tipo){
        Boleto b = null;
        if(lugDisp>0){
            if(tipo==1){
              b = new Boleto(pelicula,tipo,50);
              disminuirLugares();
            }else if(tipo==2){
               b = new Boleto(pelicula,tipo,10);
              disminuirLugares(); 
            }
            else
                System.out.println("Tipo de boleto invalido");
        }else{
            System.out.println("Ya no hay lugares disponibles");
        }
        return b;
    }

	/**
    * Metodo para imprimir el boleto
    * @return Imprimir la funcion tal que se vea la pelıcula y el
    * horario.
    */
	public String toString(){
    return pelicula+"\t\tHorario: "+horario;
  	}
}
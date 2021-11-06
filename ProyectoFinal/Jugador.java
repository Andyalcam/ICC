import java.util.Random;
/**
* Clase que extiende a la clase Persona para Jugador
* @author Andrea Alvarado Camacho
* @version 1.0
*/

public class Jugador extends Persona{
	protected String carrera;
	protected String clave;
   protected int puntuacion; 
   Random random = new Random();

   /**
   * Constructor que crea un objeto de tipo jugador 
   * @param nom - string con el nombre del jugador
   * @param dia - int con el dia de nacimiento
   * @param mes - int con el mes de nacimiento
   * @param año - int con el año de nacimiento
   * @param sexo - string con el sexo del jugador
   * @param carr - string con la carrera del jugador
   * @param clave - string con la clave de jugador 
   * @param punt -int con la puntuacion del jugador
   */
   public Jugador(String nom, int dia, int mes, int año, String sexo, String carr, String clave, int punt) {
      super(nom,dia,mes,año,sexo);
      this.carrera = carr;
      this.clave = clave;
      this.puntuacion = punt;
   }

   /**
   * Metodo para obtener la puntuacion del jugador
   * @return int con los puntos del jugador
   */
   public int obtenerPuntos(){
      return this.puntuacion;
   }

   /**
   * Metodo para agregar puntos a la puntuacion del jugador
   * @param puntN - int con los puntos a sumar
   */
   public void sumarPuntos(int puntN){
      this.puntuacion = this.puntuacion+puntN;
   }

   /**
   * Metodo para obtener la carrera del jugador
   * @return Cadena con el nombre de la carrera
   */
   public String obtenerCarr(){
   	return this.carrera;
   }

   /**
   * Metodo para editar la carrera del jugador
   * @param carrN - String con la carrera nueva 
   */
   public void editarCarr(String carrN){
   	this.carrera = carrN;
   }

   /**
   * Metodo para obtener la clave del jugador
   * @return Cadena con el nombre de la carrera
   */
   public String obtenerClave(){
   	return this.clave;
   }

   /**
   * Metodo para editar la clave del jugador
   * @param claveN - String con la clave nueva 
   */
   public void editarClave(String claveN){
   	this.clave = claveN;
   }

   /**
   * Metodo para asignar una clave unica de jugador
   */
   public void asignarClave(){
      String clave1="";
      String clave2="";
      String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
      String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
      int letra1 = random.nextInt(letras.length);
      int letra2 = random.nextInt(letras.length);
      int letra3 = random.nextInt(letras.length);
      int numero1 = random.nextInt(numeros.length);
      int numero2 = random.nextInt(numeros.length);
      int numero3 = random.nextInt(numeros.length);
         clave1 = numeros[numero1]+numeros[numero2]+numeros[numero3];
         clave2 = letras[letra1]+letras[letra2]+letras[letra3];
         this.editarClave(clave1+clave2);
      System.out.println("\nTu clave de registro es: "+clave1+clave2);
   }

   /**
   * Metodo para imprimir en consola el jugador y sus atributos
   * @return Cadena con toda la informacion de jugador
   */
   public String toString(){
   	return super.toString()+"\nCarrera: "+this.carrera+"\nClave: " + this.clave+"\nPuntos: " + this.puntuacion;
   }
}
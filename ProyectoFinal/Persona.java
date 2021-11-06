/**
* Clase para crear objetos persona
* @author Andrea Alvarado Camacho
* @version 1.1
*/
import java.io.Serializable;
public class Persona implements Serializable{
   protected String nombre;
   protected int dia;
   protected int mes;
   protected int año;
   protected String sexo; 

   /**
   * Constructor que crea un objeto de tipo persona 
   * @param nom - string con el nombre del persona
   * @param dia - int con el dia de nacimiento
   * @param mes - int con el mes de nacimiento
   * @param año - int con el año de nacimiento
   * @param sexo - string con el sexo del persona 
   */
   public Persona(String nom, int dia, int mes, int año, String sexo) {
      this.nombre = nom;
      this.dia = dia;
      this.mes = mes;
      this.año = año;
      this.sexo = sexo;
   }

   /**
   * Metodo para obtener la nombre del persona
   * @return Cadena con el nombre del persona
   */
   public String obtenerNombre() {
      return this.nombre;
   }

   /**
   * Metodo para editar el nombre del persona
   * @param nomN - String con el nombre nuevo
   */
   public void editarNombre(String nomN){
      this.nombre = nomN;
   }

   /**
   * Metodo para obtener la fecha de nacimiento del persona
   * @return Cadena con la fehca de nacimiento del persona
   */
   public String obtenerFecha() {
      return (this.dia + "/" + this.mes + "/" + this.año);
   }

   /**
   * Metodo para editar el dia de nacimiento del persona
   * @param diaN - int con el dia nuevo
   */
   public void editarFechaDia(int diaN){
      this.dia = diaN;
   }

   /**
   * Metodo para editar el mes de nacimiento del persona
   * @param mesN - int con el mes nuevo 
   */
   public void editarFechaMes(int mesN){
      this.mes = mesN;
   }

   /**
   * Metodo para editar el año de nacimiento del persona
   * @param añoN - int con el año nuevo
   */
   public void editarFechaAño(int añoN){
      this.año = añoN;
   }

   /**
   * Metodo para obtener el sexo del persona
   * @return Cadena con el sexo del persona
   */
   public String obtenerSexo(){
      return this.sexo;
   }

   /**
   * Metodo para editar el sexo del persona
   * @param sexoN - String con el sexo nuevo
   */
   public void editarSexo(String sexoN){
      this.sexo = sexoN;
   }

   /**
   * Metodo para imprimir en consola el persona y sus atributos
   * @return Cadena con toda la informacion de persona
   */
   public String toString() {
      return "\nNombre: " +this.nombre + "\nFecha de nacimiento: " + this.obtenerFecha()+"\nSexo: "+this.sexo;
   }
}
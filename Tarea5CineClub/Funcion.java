/**
 * Clase que crea objetos Funcion (de cine)
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
public class Funcion{
  final int capacidad = 12;
  private int lugares_disponible;
  private String horario;
  private String pelicula;
  private double recaudado; //dinero recaudado por funcion (boleto individual)
  private static double totalrecaudado; //dinero recaudado por boletos generales e individuales
  private static double totalGenerales; //dinero recaudado por boletos generales
  private boolean [][] asientos = new boolean[3][4];
  private boolean ocupado=false;


  /**
  * Constructor por parametros
  * @param horario - String indicando el inicio de la funcion
  * @param pelicula - String con el titulo de la pelicula
  */
  public Funcion(String horario, String pelicula){
    lugares_disponible = capacidad;
    this.horario = horario;
    this.pelicula = pelicula;
    recaudado = 0;
    totalGenerales = 0;
    totalrecaudado = 0;
  }

  /**
  *Metodo para obtener recaudado
  *@return double
  */
  public double obtenerRecaudado(){
    return recaudado;
  }

  /**
  *Metodo para obtener lugares_disponible
  *@return int
  */
  public int obtenerDisponibilidad(){
    return lugares_disponible;
  }

  /**
  *Metodo para obtener pelicula
  *@return String
  */
  public String obtenerPelicula(){
    return pelicula;
  }

  /**
  *Metodo para obtener horario
  *@return String
  */
  public String obtenerHorario(){
    return horario;
  }

  /**
  *Metodo para obtener totalGenerales
  *@return double
  */
  public double obtenertotalGenerales(){
    return totalGenerales;
  }

  /**
  *Metodo para obtener totalrecaudado
  *@return double
  */
  public double obtenerTotalRecaudado(){
    return totalrecaudado;
  }

  /**
  * Metodo para comprar un Boleto para la funcion que invoque al metodo
  * @param tipoBoleto - String indicando el tipo de boleto (general o individual)
  * @return Boleto - objeto de la clase Boleto
  */
  public Boleto comprarBoleto(String tipoBoleto, String asiento){
    Boleto b;
    int i ;
    if(lugares_disponible>0){
      b = new Boleto(this,tipoBoleto); //this señala al objeto actual que invoque al metodo
      sumarRecaudado(b);
      sumarTotalRecaudado(b);
      disminuirLugares();
  }else{
    i=0;
    System.out.println("Ya no hay lugares disponibles");
    b = null;
  }
    return b;
  }

  /**
  * Metodo que disminuye en uno la disponibilidad de lugares para la funcion
  */
  public void disminuirLugares(){
    if(lugares_disponible>0){
      lugares_disponible--;
    }else{
      System.out.println("Ya no hay lugares disponibles");
    }
  }

  /**
  * Metodo que suma el costo del boleto dependiendo su tipo: general o individual
  * Si es individual suma a recaudado y si es general suma a totalGenerales
  * @param b - Boleto del cual queremos extraer su tipo y costo
  */
  private void sumarRecaudado(Boleto b){
    if(b.obtenerTipoBoleto().equals("individual")){
      recaudado=recaudado + b.obtenerCosto();
    }else{
        totalGenerales+= b.obtenerCosto();
    }
  }

  /**
  * Metodo para sumar el dinero recaudado por la venta de boletos generales e individuales
  * @param b - Boleto del cual queremos extraer su costo
  */
  private void sumarTotalRecaudado(Boleto b){
      this.totalrecaudado+= b.obtenerCosto();
  }

  /**
  * Metodo para imprimir un objeto Funcion
  *@return String - representando un funcion
  */
  public String toString(){
    String p = "Película: "+ pelicula+"\n";
    String h ="Horario: "+ horario;
    return p+h;
  }

  /**
  * Metodo para comparar 2 Funciones
  *@param f - Funcion a comparar con el objeto Funcion que llame al metodo
  *@return boolean
  */
  public boolean equals(Funcion f){
    return this.pelicula.equals(f.obtenerPelicula()) &&
    this.horario.equals(f.obtenerHorario());
  }

  /**
  * Metodo para comparar horarios
  *@param horario - Horario a comparar con el objeto Funcion que llame al metodo
  *@return boolean
  */
  public boolean compararHorario(String horario){
    int hora = Integer.parseInt(this.horario.substring(0,2));
    int minutos = Integer.parseInt(this.horario.substring(3,5));
    int horaActual = Integer.parseInt(horario.substring(0,2));
    int minutosActual = Integer.parseInt(horario.substring(3,5));

    if(hora==horaActual && minutos>=minutosActual || hora<horaActual){
      return true;
    }
      return false;
  }

  /**
  * Metodo para obtener la fila
  *@param f - String que recibe para convertirlo en un entero
  *@return int
  */
  public int obtenerFila(String f){
    int fila=0;
    switch(f){
      case "A": fila=0;
      break;
      case "B": fila=1;
      break;
      case "C": fila=2;
      break;
      case "D": fila=3;
      break;
      default: fila=-1;
    }
    return fila;
  }

  /**
  * Metodo para elegir un asiento y convertirlo en ocupado
  *@param f - String que indica la fila
  *@param columna - int que indica la columna
  *@return String
  */
  public String elegirAsiento(String f, int columna){
    int fila = obtenerFila(f);
    if(this.ocupado(fila,columna)==false && fila<asientos.length && columna<asientos[0].length){
      asientos[fila][columna] = true;
      return f+columna;
    }else if(this.ocupado(fila,columna)==true){
      System.out.println("Ya esta ocupado el asiento");
    }
    return "Invalido";
  }

  /**
  * Metodo para saber si un lugar esta ocupado o libre
  *@param fila - int que indica la fila
  *@param columna - int que indica la columna
  *@return boolean - true si esta ocupado, false si esta libre
  */
  public boolean ocupado(int fila, int columna){
    if(asientos[fila][columna]==true){
      return true;
    }else{
      return false;
    }
  }

  /**
  * Metodo que imprime en consola la matriz de cada funcion
  */
  public void imprimirMatriz(){
    System.out.println("  "+"0"+"     "+"1"+"     "+"2"+"     "+"3");
    for(int i=0; i<asientos.length; i++){
      for(int j=0; j<asientos[i].length; j++){
        System.out.print(asientos[i][j]+" ");
      }
      System.out.println();
    }
  }
}

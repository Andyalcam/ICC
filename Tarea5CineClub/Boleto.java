/**
 * Clase que crea objetos Boleto
 * @author Diana Isabel Ramírez García
 * @version
 */
  public class Boleto{
  private Funcion funcion;
  private String tipoBoleto;
  private int costo;
  private String asiento;

  /**
  * Constructor por parametros
  * @param funcion - Funcion (de cine) que se desea ver
  * @param tipoBoleto - String que puede ser general o individual
  */
  public Boleto(Funcion funcion, String tipoBoleto){
    this.funcion=funcion;
    this.tipoBoleto=tipoBoleto;
    calcularPrecio(tipoBoleto); //calculamos el costo utilizando un metdo auxiliar
  }

  /**
  *Metodo para asignar un valor a tipoBoleto
  *@param tipoBoleto - String
  */
  public void asignarTipoBoleto(String tipoBoleto){
    this.tipoBoleto=tipoBoleto;
  }

  /**
  *Metodo para asignar un valor a funcion
  *@param funcion - objeto Funcion
  */
  public void asignarFuncion(Funcion funcion){
    this.funcion=funcion;
  }

  /**
  *Metodo para asignar un valor a costo
  *@param costo - int
  */
  public void asignarCosto(int costo){
    this.costo=costo;
  }

  /**
  *Metodo para obtener tipoBoleto
  *@return String
  */
  public String obtenerTipoBoleto(){
    return tipoBoleto;
  }



  /**
  *Metodo para obtener funcion
  *@return Funcion
  */
  public Funcion obtenerFuncion(){
    return funcion;
  }

  /**
  *Metodo para obtener costo
  *@return int
  */
  public int obtenerCosto(){
    return costo;
  }


  /**
  *Metodo auxiliar para calcular el precio
  *del boleto dependiendo si es general o individual
  *@param tipo - String que puede ser general (con un costo de 50)
  *o individual (con un costo de 10)
  */
  private void calcularPrecio(String tipo){
    if(tipoBoleto.equals("general")){
      costo = 50;
    }else if(tipoBoleto.equals("individual")){
      costo=10;
    }else{
      System.out.println("No es valido el tipo de boleto");
    }

  }

  /**
  * Metodo para imprimir un objeto Boleto
  *@return String - representando un boleto
  */
  public String toString(){
    String f = "Función: "+funcion+"\n";
    String t = "Tipo: "+tipoBoleto+"\n";
    String c ="Costo: "+costo+"\n";
    String a ="Asiento: ";
    return "Este es tu boleto:"+"\n"+f+t+c+a;
  }

  /**
  * Metodo para comparar 2 Boletos
  *@param b - Boleto a comparar con el objeto boleto que llame al metodo
  *@return boolean
  */
  public boolean equals(Boleto b){
    return this.funcion.equals(b.obtenerFuncion()) &&
    this.tipoBoleto.equals(b.obtenerTipoBoleto()) && this.costo == b.obtenerCosto();
  }


}

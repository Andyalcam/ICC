/**
 *  
 *  Clase que implementa la representacion de un Conjunto de numeros enteros
 *  cuyo valor esta entre 1 y 100.
 *
 *  <p>El Conjunto se representa como un arreglo de valores booleanos, donde si elementos[i]
 *  tiene valor true, significa que el entero i esta en el conjunto y si es false
 *  significa que el entero i no esta en el conjunto.
 *
 *  @author Andrea Alvarado Camacho
 *
 */
public class Conjunto {
    
    /*
     *  Arreglo que nos sirve para determinar que elementos
     *  pertenecen al Conjunto.
     */
    private boolean [] con;
    
    /**
     *  Constructor que inicializa un Conjunto vacio.
     *  Es decir, un Conjunto sin ningun elemento.
     */
    public Conjunto() {
        // Escribe aqui el codigo de este metodo
        con = new boolean[100];
    }
    
    /**
     *  Metodo que inicializa un Conjunto que contenga
     *  los enteros pasados como parametro.
     *  El arreglo pasado como parametro contiene, solamente,
     *  enteros cuyo valor esta entre 1 y 100.
     *  @param elementosIniciales Elementos que debera de contener el nuevo Conjunto.
     */
    public Conjunto(int[] elementosIniciales){
        con= new boolean[100];
        for(int i=0; i<elementosIniciales.length; i++ ){
            if(elementosIniciales[i]>0 && elementosIniciales[1]<=100){
                con[elementosIniciales[i]-1]=true;
            }
        }
    }
    
    /**
     *  Devuelve un Conjunto que contiene la union de el Conjunto
     *  que manda a llamar al metodo con el Conjunto c.
     *  @param c Conjunto que se va a unir.
     *  @return Nuevo Conjunto resultado de la union de ambos Conjuntos.
     */
    public Conjunto union(Conjunto c){
        int [] temporal = new int [100];
        for (int i=0; i <temporal.length; i++ ){
            if (this.con[i]==true || c.con[i]==true){
                temporal[i] = i+1;
            } 
        }
        return new Conjunto(temporal);
    }
    
    /**
     *  Devuelve un Conjunto que contiene la interseccion de el Conjunto
     *  que manda a llamar al metodo con el Conjunto c.
     *  @param c Conjunto que se va a unir.
     *  @return Nuevo Conjunto resultado de la interseccion de ambos Conjuntos.
     */
    public Conjunto interseccion(Conjunto c){
        int [] temporal = new int [100];
        for (int i=0; i< temporal.length; i++ ){
            if (this.con[i]==true && c.con[i]==true){
                temporal[i] = i+1;
            } 
        }
        return new Conjunto(temporal);
    }
    
    /**
     *  Devuelve un Conjunto resultado de la diferencia entre el Conjunto
     *  que llama al metodo y el Conjunto c.
     *  @param c Conjunto cuyos elementos seran restados al Conjunto que llama al metodo.
     *  @return Resultado de la diferencia entre ambos Conjuntos.
     */
    public Conjunto diferencia(Conjunto c){
        int [] temporal = new int [100];
        for (int i=0; i< temporal.length; i++ ){
        if (con[i]==true && c.con[i]==false){
                temporal[i] = i+1;
            }   
        }
        return new Conjunto(temporal);
    }
    
    /**
     *  Determina si el elemento pasado como parametro pertenece o no
     *  al Conjunto.
     *  @param elemento Elemento que sera buscado dentro del Conjunto.
     *  @return true - Si el elemento esta en el Conjunto. false - En otro caso.
     */
    public boolean pertenece(int elemento){
        if(elemento>=1 && elemento<=100)
            return con[elemento-1];
        else
            return false;
    }
    
    /**
     *  Metodo que introducir un nuevo elemento al Conjunto.
     *  @param elemento Elemento que sera introducido al Conjunto.
     */
    public void introducir(int elemento){
       if (elemento>0 && elemento<= 100){
           con[elemento-1] = true;
       } else{
           System.out.println("No se puede introducir el elemento" + elemento);
       }
    }  
    
    /**
     *  Metodo que eliminar un elemento del Conjunto.
     *  @param elemento Elemento que sera eliminado del Conjunto.
     */
    public void eliminar(int elemento){
      if (elemento>0 && elemento<= 100){
      this.con[elemento - 1]= false;
     }    
    }
    
    /**
     *  Metodo que determina si dos Conjuntos son o no iguales.
     *  @param c Conjunto que sera comparado.
     *  @return true - Si son iguales. false - En otro caso.
     */
    public boolean equals(Conjunto c){
        boolean igual = false;
        for(int i=0; i< c.con.length; i++ ){
            if(this.con[i]==true && c.con[i]==true){
                igual = true;  
            }else if (this.con[i] == false && c.con[i]==false){
                igual = false;
            }else{
                igual = false;
                break;
            }
         }
        return igual;
        }

    /**
     *  Metodo que devuelve la representacion en cadena del Conjunto.
     *  La cadena resultante tiene un formato como el que sigue:
     *  {4, 6, 80, 99}
     *  @return Representacion en cadena del Conjunto.
     */
    public String toString(){
        String conjunto = "{";
        for(int i=0; i<con.length; i++){
            if(con[i]==true){
                conjunto = conjunto + (i+1) + ",";
            }
        }
        return conjunto + "}";
    }
}
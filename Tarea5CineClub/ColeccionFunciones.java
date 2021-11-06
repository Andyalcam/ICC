/**
 * Clase que crea objetos Funcion (de cine)
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
public class ColeccionFunciones{

	Funcion f1 = new Funcion("12:00:00","Hereditary");
    Funcion f2 = new Funcion("14:00:00","Alien");
    Funcion f3 = new Funcion("16:00:00","It Follows");
    Funcion f4 = new Funcion("18:00:00","A Quiet Place");
    Funcion f5 = new Funcion("20:00:00","Jaws");
    Funcion f6 = new Funcion("12:00:00","Todas");
    Funcion[] funciones = {f1,f2,f3,f4,f5,f6};

    /**
    * Constructor por omision
    */
    public ColeccionFunciones(){
    	Funcion fun = new Funcion("","");
    }

    /**
    *Metodo para obtener arreglo
     *@return Funcion[]
    */
    public Funcion[] obtenerArreglo(){
    	return funciones;
    }

    /**
    * Metodo para ver las funciones a partir de una hora 
    * @param horario - String indicando la hora ingresada por el usuario
    * @return Funcion[] - arreglo de la clase Funcion
    */
    public Funcion[] peliculasSobrantes(String horario){
        Funcion[] pelisS;
    	int numPelis = 0;
    	int pos = 0;
    	int i,j;
    	for(i=0; i<funciones.length; i++){
    		if(funciones[i].compararHorario(horario)==false){
    			numPelis = funciones.length-i;
    			pos=i;
    			break;
    		}
    	}
    	pelisS = new Funcion[numPelis];
    	for(j=0; j<pelisS.length; j++){
    		pelisS[j]=funciones[pos];
    		pos++;
    		System.out.println(pelisS[j]);
    	}
    	return pelisS;
    }
}
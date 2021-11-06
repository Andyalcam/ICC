import java.util.Comparator;
/**
* Clase que implementa la interfaz Comparator para comparar personas
* respecto a su edad y estatura
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class PersonaComparable implements Comparator <Persona>{

	/**
	* Metodo que compara a dos personas y define quien es mas grande segun su edad
	* y si la edad es igual lo define con base en su estaura
	* @param a - Persona a
	* @param b - Persona b
	* @return int
	*/
	@Override
	public int compare(Persona a, Persona b){
		int edadA = a.obtenerEdad();
		int edadB = b.obtenerEdad();

		if(edadA==edadB){
			double estaA = a.obtenerEstatura();
			double estaB = b.obtenerEstatura();
			if(estaA<estaB){
				return -1;
			}else{
				return 1;
			}
		}

		if(edadA<edadB){
			return -1;
		}else{
			return 1;
		}
	}
}
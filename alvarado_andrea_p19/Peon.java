/**
* Clase que extiende a la clase Pieza para peones
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Peon extends Pieza{

	/**
	* Constructor para una pieza peon a partir de parametros
	* @param color - color de la pieza
	* @param x - coordenada x
	* @param y - coordenada y
	*/
	public Peon(String color, int x, int y){
		super(color,x,y);
	}

	/**
	* Metodo para obtener todos los posibles movimientos de la pieza
	* a partir de su posicion
	* @return String - cadena con todas las coordenadas posibles de movimiento
	*/
	public String posiblesMovimientos(){
		String mov = "";
		int nuevaY = this.y + 1;
		if(nuevaY<9){
			mov += "("+this.x+","+nuevaY+")"+",";
		}
		if(this.y==2){
			mov += "("+this.x+","+(nuevaY+1)+")";
		}
		return mov;
	}
}
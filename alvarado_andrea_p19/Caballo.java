/**
* Clase que extiende a la clase Pieza para caballos
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Caballo extends Pieza{

	/**
	* Constructor para una pieza caballo a partir de parametros
	* @param color - color de la pieza
	* @param x - coordenada x
	* @param y - coordenada y
	*/
	public Caballo(String color, int x, int y){
		super(color,x,y);
	}

	/**
	* Metodo para obtener todos los posibles movimientos de la pieza
	* a partir de su posicion
	* @return String - cadena con todas las coordenadas posibles de movimiento
	*/
	public String posiblesMovimientos(){
		int [] X = {1,-1,2,2,-2,-2,-1,1};
		int [] Y = {2,2,1,-1,1,-1,-2,-2};

		String mov = "";

		for (int i=0; i<X.length; i++){
			int nuevaX = this.x + X[i];
			int nuevaY = this.y + Y[i];

			if(nuevaX > 0 && nuevaY > 0 && nuevaX<9 && nuevaY<9){
				mov += "("+nuevaX+","+nuevaY+")"+",";
			}
		}
		return mov;
	}
}
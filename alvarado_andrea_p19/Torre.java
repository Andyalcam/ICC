/**
* Clase que extiende a la clase Pieza para torres
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Torre extends Pieza{

	/**
	* Constructor para una pieza torre a partir de parametros
	* @param color - color de la pieza
	* @param x - coordenada x
	* @param y - coordenada y
	*/
	public Torre(String color, int x, int y){
		super(color,x,y);
	}

	/**
	* Metodo para obtener todos los posibles movimientos de la pieza
	* a partir de su posicion
	* @return String - cadena con todas las coordenadas posibles de movimiento
	*/
	public String posiblesMovimientos(){
		String movH = "";
		String movV = "";

		for(int i=1; i<9; i++){
			int nuevaX = this.x + i;
			if(nuevaX>0 && nuevaX<9){
				movH += "("+nuevaX+","+this.y+")"+",";
			}
		}
		for(int j=1; j<9; j++){
			int nuevaY = this.y + j;
			if(nuevaY > 0 && nuevaY<9){
				movV += "("+this.x+","+nuevaY+")"+",";
			}
		}

		for(int i=8; i>0; i--){
			int nuevaX = this.x - i;
			if(nuevaX>0 && nuevaX<9){
				movH += "("+nuevaX+","+this.y+")"+",";
			}
		}
		for(int j=8; j>0; j--){
			int nuevaY = this.y - j;
			if(nuevaY > 0 && nuevaY<9){
				movV += "("+this.x+","+nuevaY+")"+",";
			}
		}
		return movH+movV;
	}
}
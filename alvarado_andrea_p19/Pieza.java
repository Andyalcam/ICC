/**
* Clase que padre para piezas de ajedrez
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public abstract class Pieza{
	protected String color;
	protected int x;
	protected int y;

	/** 
	* Constructor por omision
	*/
	public Pieza(){
		this.x=1;
		this.y=1;
	}

	/**
	* Constructor para una pieza a partir de parametros
	* @param color - color de la pieza
	* @param x - coordenada x
	* @param y - coordenada y
	*/
	public Pieza(String color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}

	/**
	* Metodo para obtener el color de una pieza
	* @return String - cadena con el color de la pieza
	*/
	public String getColor(){
		return color;
	}

	/**
	* Metodo para obtener la coordenada x de una pieza
	* @return int - entero de la coordenada x
	*/
	public int getX(){
		return x;
	}

	/**
	* Metodo para obtener la coordenada y de una pieza
	* @return int - entero de la coordenada y
	*/
	public int getY(){
		return y;
	}

	/**
	* Metodo para asignar color a una pieza
	* @param color - cadena con el nuevo color de la pieza
	*/
	public void setColor(String color){
		this.color = color;
	}

	/**
	* Metodo para asignar coordenada x a una pieza
	* @param x - entero con nueva coordenada x para la pieza
	*/
	public void setX(int x){
		this.x = x;
	}

	/**
	* Metodo para asignar coordenada y a una pieza
	* @param y - entero con nueva coordenada y para la pieza
	*/
	public void setY(int y){
		this.y = y;
	}

	/**
	* Metodo abstracto para clases hijas para obtener todos los
	* posibles movimientos de la pieza a partir de su posicion
	* @return String - cadena con todas las coordenadas posibles de movimiento
	*/
	public abstract String posiblesMovimientos();
}
public class Gato{
	int turno;
    String [][] tablero;
    
    /**
    *Constructor por omision
    */
    public Gato(){
        tablero = new String [3] [3];
    	for(int i=0; i<tablero.length; i++){
    		for(int j=0; j<tablero[i].length; j++){
    			tablero[i][j]=" ";
     	 	}
		}
   }

    /**
    *Metodo que coloca una figura en el tablero segun la posicion.
    *Si hay espacio la coloca  regresa true.
    *Si no hay espacio regresa false
    *@param fig - Figura que se pone en el tablero
    *@param x - Coordenada x del tablero
    *@param y - Coordenada Y del tablero
    *@return boolean
    */
    public boolean setTablero(String fig,int x,int y){
    	if ((x>2||y>2)|| x<0||y<0 || (tablero [x][y].equals("X") || tablero [x][y].equals("O"))){
      		System.out.println("Las coordenadas no son validas");
            return false;	
    	}else{
			tablero [x][y]=fig;
			turno++;
			return true;
		}
	}
    
    /**
    *Metodo que verifica si acabo el juego.
    *Si hay un ganador o se llega a un empate regresa true
    *Si el juego aun no acaba, regrea false
    *@return boolean
    */
    boolean termina;
    public boolean termino(){
        if (this.ganarHorizontal0()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if (this.ganarHorizontal1()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if (this.ganarHorizontal2()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if (this.ganarVertical0()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if (this.ganarVertical1()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if (this.ganarVertical2()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if (this.ganarDiagonal()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if (this.ganarDiagonalIn()==true){
            System.out.println(", felicidades!\n");
            termina = true;
        }else if(turno==9){
            System.out.println("\tEMPATE :c\n");
            termina = true;
        }else{
            termina = false;
        }
        return termina;
    }

    /**
    *Metodo toString que imprime el tablero
    *@return tablero
    */
    public String toString(){
        String acc = getLinea()+"\n";
      	for(int i=0;i<tablero.length;i++){
        	acc+="| ";
        	for(int j=0;j<tablero[i].length;j++)
        		acc += tablero[i][j]+" | ";
        		acc +="\n"+getLinea()+"\n";
      	}
      	return acc;
    }

    /**
    *Metodo getLinea que imprime una linea en el tablero
    *@return String
    */
    private String getLinea(){
        return "-------------";
    }

    /**
    *Metodo ganarHorizontal0 que verifica si alguno de 
    *los dos jugadores ganaron en la fila 0
    *@return boolean
    */
    boolean gano;
    public boolean ganarHorizontal0(){
        if(tablero[0][0].equals("X") && tablero[0][1].equals("X") && tablero[0][2].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[0][0].equals("O") && tablero[0][1].equals("O") && tablero[0][2].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarHorizontal1 que verifica si alguno de 
    *los dos jugadores ganaron en la fila 1
    *@return boolean
    */
    public boolean ganarHorizontal1(){
        if(tablero[1][0].equals("X") && tablero[1][1].equals("X") && tablero[1][2].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[1][0].equals("O") && tablero[1][1].equals("O") && tablero[1][2].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarHorizontal2 que verifica si alguno de 
    *los dos jugadores ganaron en la fila 2
    *@return boolean
    */
    public boolean ganarHorizontal2(){
        if(tablero[2][0].equals("X") && tablero[2][1].equals("X") && tablero[2][2].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[2][0].equals("O") && tablero[2][1].equals("O") && tablero[2][2].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarVertical0 que verifica si alguno de 
    *los dos jugadores ganaron en la columna 0
    *@return boolean
    */
    public boolean ganarVertical0(){
        if(tablero[0][0].equals("X") && tablero[1][0].equals("X") && tablero[2][0].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[0][0].equals("O") && tablero[1][0].equals("O") && tablero[2][0].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarVertical1 que verifica si alguno de 
    *los dos jugadores ganaron en la columna 1
    *@return boolean
    */
    public boolean ganarVertical1(){
        if(tablero[0][1].equals("X") && tablero[1][1].equals("X") && tablero[2][1].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[0][1].equals("O") && tablero[1][1].equals("O") && tablero[2][1].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarVertical2 que verifica si alguno de 
    *los dos jugadores ganaron en la columna 2
    *@return boolean
    */
    public boolean ganarVertical2(){
        if(tablero[0][2].equals("X") && tablero[1][2].equals("X") && tablero[2][2].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[0][2].equals("O") && tablero[1][2].equals("O") && tablero[2][2].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarDiagonal que verifica si alguno de 
    *los dos jugadores ganaron en la diagonal
    *@return boolean
    */
    public boolean ganarDiagonal(){
        if(tablero[0][0].equals("X") && tablero[1][1].equals("X") && tablero[2][2].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[0][0].equals("O") && tablero[1][1].equals("O") && tablero[2][2].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

    /**
    *Metodo ganarDiagonalIn que verifica si alguno de 
    *los dos jugadores ganaron en la diagonal invertida
    *@return boolean
    */
    public boolean ganarDiagonalIn(){
        if(tablero[0][2].equals("X") && tablero[1][1].equals("X") && tablero[2][0].equals("X")){
            System.out.print("\nGano el jugador X");
            gano = true;
        }else if(tablero[0][2].equals("O") && tablero[1][1].equals("O") && tablero[2][0].equals("O")){
            System.out.print("\nGano el jugador O");
            gano = true;
        }else{
            gano = false;
        }
        return gano;
    }

}


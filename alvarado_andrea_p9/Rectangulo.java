/**
 * Clase para trabajar con rectangulos
 * @author Andrea Alvarado Camacho
 * @see Punto
 * @version 
 */
public class Rectangulo {
    private Punto pto1, pto2, pto3, pto4;

    /**
     * Constructor de un rectangulo a partir los dos puntos que representan 
     * los extremos de su diagonal.
     * @param a - vertice a
     * @param b - vertice b
     */
    public Rectangulo(Punto a, Punto b) {
	   if(a.distancia(b)!=0){
            pto1 = a;
            pto2 = b;
            pto3 = new Punto(a.obtenerX(),b.obtenerY());
            pto4 = new Punto(b.obtenerX(),a.obtenerY());
       }
    }

    /**
     * Constructor que crea un rectangulo a partir de otro.
     * @param recto - el rectangulo a partir del cual se estableceran 
     * los datos del nuevo rectangulo.
     */
    public Rectangulo(Rectangulo recto) {
        this.pto1 = recto.pto1;
        this.pto2 = recto.pto2;
        this.pto3 = recto.pto3;
        this.pto4 = recto.pto4;
    }

    /** Metodo privado que regresa la x mayor
    * @return mayor -- x maxima
    */
    private int obtenerXMax(){
        Punto a = obtenerPuntoA();
        Punto b = obtenerPuntoB();
        int xA = a.obtenerX();
        int xB = b.obtenerX();
        int mayor;
        if (xA>xB){
            mayor = xA;
        }else{
            mayor = xB;
        }
        return mayor;
    }

    /** Metodo privado que regresa la x menor
    * @return menor -- x minima
    */
    private int obtenerXMin(){
        Punto a = obtenerPuntoA();
        Punto b = obtenerPuntoB();
        int xA = a.obtenerX();
        int xB = b.obtenerX();
        int menor;
        if (xA<xB){
            menor = xA;
        }else{
            menor = xB;
        }
        return menor;
    }

    /** Metodo privado que regresa la y mayor
    * @return mayor -- y maxima
    */
    private int obtenerYMax(){
        Punto a = obtenerPuntoA();
        Punto b = obtenerPuntoB();
        int yA = a.obtenerY();
        int yB = b.obtenerY();
        int mayor;
        if (yA>yB){
            mayor = yA;
        }else{
            mayor = yB;
        }
        return mayor;
    }

    /** Metodo privado que regresa la y menor
    * @return menor -- y minima
    */
    private int obtenerYMin(){
        Punto a = obtenerPuntoA();
        Punto b = obtenerPuntoB();
        int yA = a.obtenerY();
        int yB = b.obtenerY();
        int menor;
        if (yA<yB){
            menor = yA;
        }else{
            menor = yB;
        }
        return menor;
    }

    /**
     * Constructor por omision. Crea el rectangulo con los puntos
     * (0,0) y (10,20)
     */
    public Rectangulo () {
        pto1 = new Punto(0,0);
        pto2 = new Punto(10,20);
        pto3 = new Punto(pto1.obtenerX(),pto2.obtenerY());
        pto4 = new Punto(pto2.obtenerX(),pto1.obtenerY());
    }
    /**
     * Obtiene el vertice a del rectangulo
     * @return Punto - vertice a
     */
    public Punto obtenerPuntoA() {
        return pto1;
    }

    /**
     * Obtiene el vertice b del rectangulo
     * @return Punto - vertice b
     */
    public Punto obtenerPuntoB() {
        return pto2;
    }

    /**
     * Regresa true si el rectangulo  es un cuadrado.
     * @return boolean - true si es cuadrado, false en caso contrario
     */
    public boolean esCuadrado() {
	   if(pto1.distancia(pto2)==pto2.distancia(pto3)){
        return true;
       }else{
        return false;
       }
    }

    /**
     * Calcula el perimetro del rectangulo.
     * @return double - valor del perimetro
     */
    public double perimetro() {
        double lado1 = pto1.distancia(pto3);
        double lado2 = pto1.distancia(pto4); 
        double perimetro = (lado1+lado2)*2;
        return perimetro;
    }

    /**
     * Calcula el area del rectangulo.
     * @return double - valor del area
     */
    public double area() {
        double lado1 = pto1.distancia(pto3);
        double lado2 = pto1.distancia(pto4);
        double area = lado1*lado2;
        return area;
    }

    /**
     * Metodo para encontrar la union de dos rectangulos
     * @param rec -- segundo rectangulo
     * @return Rectangulo -- rectangulo que tiene a los dos rectangulos dados.
     */
    public Rectangulo union(Rectangulo rect) {
        int xmax;
        if(this.obtenerXMax() > rect.obtenerXMax()){
            xmax = this.obtenerXMax();
        }else{
            xmax = rect.obtenerXMax();
        }

        int xmin;
        if(this.obtenerXMin() < rect.obtenerXMin()){
            xmin = this.obtenerXMin();
        }else{
            xmin = rect.obtenerXMin();
        }

        int ymax;
        if(this.obtenerYMax() > rect.obtenerYMax()){
            ymax = this.obtenerYMax();
        }else{
            ymax = rect.obtenerYMax();
        }

        int ymin;
        if(this.obtenerYMin() < rect.obtenerYMin()){
            ymin = this.obtenerYMin();
        }else{
            ymin = rect.obtenerYMin();
        }


        Punto a = new Punto(xmin, ymin);
        Punto b = new Punto(xmax, ymax);
        Rectangulo c = new Rectangulo(a,b);
        return c;
    }


    /**
     * Metodo equals() 
     * @param rec - Rectangulo a comparar con el rectangulo que hace la llamada
     * @return boolean - true si son iguales false en caso contrario
     */
    public boolean equals(Rectangulo rec) {
	   if (this.obtenerPuntoA().equals(rec.obtenerPuntoA())&&this.obtenerPuntoB().equals(rec.obtenerPuntoB())){
        return true;
       }else
        return false;
    }

    /**
     * Metodo toString
     * @return String -- representacion en cadena del rectangulo
     */
    public String toString() {
        return pto1+" "+pto2+" "+pto3+" "+pto4+"\n";
    }

}

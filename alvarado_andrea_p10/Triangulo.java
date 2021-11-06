import java.util.Scanner;

/**
 * Clase para trabajar con triangulos.
 * @author Andrea Alvarado Camacho
 * @see Punto
 * @version 1.0
 */
public class Triangulo {
    private Punto a, b, c;
    private double ladoAB, ladoAC, ladoBC;

    /**
     * Constructor de un triangulo a partir los tres puntos que representan sus vertices
     * @param a - vertice a
     * @param b - vertice b
     * @param c - vertice c
     */
    public Triangulo(Punto a, Punto b, Punto c) {
        if(a.distancia(b)!=0){
            this.a = a;
            this.b = b;
            this.c = c;
       }
    }

    /**
     * Constructor que crea un triangulo a partir de otro.
     * @param t2 - el triangulo a partir del cual se estableceran los datos del nuevo triangulo.
     */
    public Triangulo(Triangulo t2) {
        this.a = t2.a;
        this.b = t2.b;
        this.c = t2.c;
    }

    /**
     * Constructor por omision. Crea el triangulo con los puntos
     * (0,0),(10,0) y (5,10).
     */
    public Triangulo () {
        a = new Punto(0,0);
        b = new Punto(10,0);
        c = new Punto(5,10);
    }
    /**
     * Obtiene el vertice a del triangulo
     * @return Punto - vertice a
     */
    public Punto obtenerPuntoA() {
        return a;
    }

    /**
     * Obtiene el vertice b del triangulo
     * @return Punto - vertice b
     */
    public Punto obtenerPuntoB() {
        return b;
    }

    /**
     * Obtiene el vertice c del triangulo
     * @return Punto - vertice c
     */
    public Punto obtenerPuntoC() {
        return c;
    }

    /**
     * Regresa true si el triangulo  es Isosceles.
     * @return boolean - true si es isosceles, false en caso contrario
     */
    public boolean esIsosceles() {
        if(ladoAC == ladoBC && ladoAC!=ladoAB){
        return true;
        }else
        return false;
    }

    /**
     * Regresa true si el triangulo  es escaleno.
     * @return boolean - true si es escaleno, false en caso contrario
     */
    public boolean esEscaleno() {
        if(ladoAB!=ladoBC && ladoBC==ladoAC && ladoAB!=ladoAC){
        return true;
        }else
        return false;
    }

    /**
     * Regresa true si el triangulo <code>t</code> es Equilatero.
     * @return boolean - true si es equilatero, false en caso contrario
     */
    public boolean esEquilatero() {
        if(ladoAB==ladoBC && ladoBC==ladoAC && ladoAB==ladoAC){
        return true;
        }else
        return false;
    }

    /**
     * Calcula el perimetro del triangulo.
     * @return double - valor del perimetro
     */
    public double perimetro() {
        ladoAB = a.distancia(b);
        ladoBC = b.distancia(c); 
        ladoAC = a.distancia(c); 
        double perimetro = ladoAB+ladoBC+ladoAC;
        return perimetro;
    }

    /**
     * Calcula el area del triangulo.
     * @return double - valor del area
     */
    public double area() {
        double s = (ladoAB + ladoBC + ladoAC)/2;
        double area = Math.sqrt(s*(s-ladoAB)*(s-ladoBC)*(s-ladoAC));
        return area;
    }
    /**
     * Regresa el tipo de triangulo del cual se trata.
     * @return String - El tipo al que pertenece t
     */
    public String tipo() {
        if(esEquilatero()==true){
            return "Equilatero";
        }else if(esIsosceles()==true){
            return "Isosceles";
        }else{
            return "Escaleno";
        }
    }

    /**
     * Metodo equals() 
     * @param t - Triangulo a comparar con el triangulo que hace la llamada
     * @return boolean - true si son iguales false en caso contrario
     */
    public boolean equals(Triangulo t) {
        if (this.ladoAB==t.ladoAB&&this.ladoBC==t.ladoBC&&this.ladoAC==t.ladoAC){
        return true;
       }else
        return false;
    }

    /**
     * Método toString
     * @return String -- representacion en cadena del triangulo
     */
    public String toString() {
        return "ab: "+a+"-"+b+" bc: "+b+"-"+c+" ac: "+c+"-"+a+"\n";
    }
}

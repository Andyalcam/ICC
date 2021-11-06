/**
 * Clase que simula el comportamiento de un robot
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
public class Robot {

    private String nombre;
    private String marca;
    private String numSerie;
    private boolean estaDormido;
    private long restar,sumar,multiplicar,dividir;

    /**
     * Constructor de un robot a partir de su nombre, marca y numero de serie //Contructor que recibe los datos del robot
     * @param n - nombre del robot
     * @param m - marca del robot
     * @param num - número de serie del robot
     */
    public Robot (String n, String m, String num) {
        nombre=n;
        marca=m;
        numSerie=num;
    }

    /**
     * Metodo para asignar nombre al robot
     * @param nombre -- cadena con el nombre del robot
     */
    public void asignarNombre(String nombre) {
        this.nombre=nombre;
    }

    /**
     * Metodo para asignar marca al robot
     * @param marca -- cadena con la marca del robot
     */
    public void asignarMarca(String marca) {
        this.marca=marca;
    }

    /**
     * Metodo para asignar numSerie al robot
     * @param numSerie -- cadena con el numero de serie del robot
     */
    public void asignarNumSerie(String numSerie) {
        this.numSerie=numSerie;
    }

    /**
     * Metodo para obtener el nombre del robot
     * @return String -  nombre del robot
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener la marca del robot
     * @return String -  marca del robot
     */
    public String obtenerMarca() {
        return marca;
    }

    /**
     * Metodo para obtener el número de Serie del robot
     * @return String -  numero de serie del robot
     */
    public String obtenerNumSerie() {
        return numSerie;
    }

    /** 
     * Metodo para mandar a dormir al robot
     */
    public void dormir() {
        estaDormido=true;
        System.out.println("Zzz Zzz");
    }

    /** 
     * Metodo para despertar al robot
     */
    public void despertar() {
        estaDormido=false;
    }

    /**
     * Metodo para saber si el robot esta despierto
     * @return boolean -- Si es true el robot está despierto y false si esta dormindo
     */
    public boolean estaDespierto() {
        if (estaDormido==true){
        return false ;
        }else
        return true;
    }

    /**
     * Metodo para que el robot repita lo que se le dice
     * @param rollo -- cadena con el rollo que se desea repita el robot
     */
    public void repetir(String rollo) {
        if (estaDespierto()==true){
            System.out.println(rollo);
        }
    }
    /**
     * Metodo para determinar si dos robots son iguales
     * @param robot -- robot con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Robot robot) {
        if (this.obtenerNombre().equals(robot.obtenerNombre()) && this.obtenerMarca().equals(robot.obtenerMarca()) && this.obtenerNumSerie().equals(robot.obtenerNumSerie())){
        return true;
       }else
        return false;
    }

    /**
     * Metodo para devolver una cadaena con el nombre del robot.
     * @return String -- cadena que devolvera
     */
    public String toString () {
        return nombre;
    }

    /**
     * Metodo para que el robot reste los numeros que se le dan
     * @param num1 -- minuendo
     * @param num2 -- sustraendo
     */
    public void restar(long num1, long num2) {
        if (estaDespierto()==true){
        restar=num1-num2;
        System.out.println("El resultado de la resta de "+num1+" y "+num2+" es: "+restar);
        }
    }

    /**
     * Metodo para que el robot sume los numeros que se le dan
     * @param num1 -- primer sumando
     * @param num2 -- segundo sumando
     */
    public void sumar(long num1, long num2) {
        sumar=num1+num2;
        System.out.println("El resultado de la suma de "+num1+" y "+num2+" es: "+sumar);
    }

    /**
     * Metodo para que el robot multiplique los numeros que se le dan
     * @param num1 -- primer factor
     * @param num2 -- segundo factor
     */
    public void multiplicar(long num1, long num2) {
        multiplicar=num1*num2;
        System.out.println("El resultado de la multiplicacion de "+num1+" y "+num2+" es :"+multiplicar);
    }

    /**
     * Metodo para que el robot divida los numeros que se le dan
     * @param num1 -- dividendo
     * @param num2 -- divisor
     */
    public void dividir(long num1, long num2) {
        if (num2==0){
            System.out.println("No se puede dividir entre cero.");
        }else{
            dividir=num1/num2;
            System.out.println("El resultado de la division de "+num1+" entre "+num2+" es: "+ dividir);
        }
    }
}
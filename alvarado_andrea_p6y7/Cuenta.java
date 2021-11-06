/**
 * Clase para manejar cuentas
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
public class Cuenta {
    private double saldo;
    private int numCta, telefono;
    private String nombre, direccion;
    
    /**
    * Constructor para crear una cuenta a partir de nombre, telefono, direccion,
    * numero de cuenta y saldo de la cuenta
    * @param nom - valor para el nombre del cliente
    * @param telef - valor para el telefono del cliente
    * @param direc - valor para la direccion del cliente
    * @param nCta - valor para el numero de cuenta del cliente
    * @param disponibleInicial - valor para el saldo de la cuenta
    */
    public Cuenta(String nom, int telef, String direc, int nCta, double disponibleInicial) {
        nombre = nom;
        telefono = telef;
        direccion = direc;
        numCta = nCta;
        saldo = disponibleInicial;
    }

    /**
    * Metodo para obtener nombre del cliente
    * @return Nombre del cliente
    */
    public String obtenerNombre(){
        return nombre;
    }

    /**
    * Metodo para asignar un nuevo nombre de cliente
    * @param nombre - valor para el nuevo nombre
    */
    public void asignarNombre(String nombre){
        this.nombre = nombre;
    }

    /**
    * Metodo para obtener telefono del cliente
    * @return Telefono del cliente
    */
    public int obtenerTelefono(){
        return telefono;
    }

    /**
    * Metodo para asignar nuevo telefono
    * @param telefono - valor para nuevo telefono
    */
    public void asignarTelefono(int telefono){
        this.telefono = telefono;
    }

    /**
    * Metodo para obtener direccion del cliente
    * @return Direccion del cliente
    */
    public String obtenerDireccion(){
        return direccion;
    }

    /**
    * Metodo para asignar una nueva direccion
    * @param direccion - valor para la nueva direccion
    */
    public void asignarDireccion(String direccion){
        this.direccion = direccion;
    }

    /**
    * Metodo para retirar dinero de una cuenta
    * @param monto - valor para la cantidad deseada a retirar
    */
    public void retirar(double monto) {
        if (monto >= 0){                        // Este if condiciona al monto para no ser una cantidad negativa
            if (saldo > monto){                 // Este if condiciona al monto para no ser menor al saldo disponible
                saldo = saldo - monto;
            }
            else{
                System.out.println("No cuentas con el saldo disponible");
            }
        }
        else{
            System.out.println("No se puede retirar una cantidad negativa");
        }
    }

    /** 
    * Metodo para depositar dinero en una cuenta
    * @param monto - valor para la cantidad deseada a depositar
    */
    public void depositar(double monto) {
        if (monto >= 0){                        // Este if condiciona al monto a no ser una cantidad negativa
            saldo = saldo +monto;
        }
        else{
            System.out.println("No se puede depositar una cantidad negativa");
        }
    }

	/**
    * Metodo para obtener el saldo de una cuenta
    * @return El saldo disponible de la cuenta
    */
    public double obtenerDisponible(){
        return saldo;
    }
    
    /**
    * Metodo para obtener el numero de cuenta
    * @return El numero de cuenta del cliente
    */
    public int obtenerNumCuenta(){
        return numCta;
    }
    
    
}
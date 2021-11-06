/**
 * 
 * @author
 * @version
 */

public class Transaccion {
    public static void main(String[] pps) {

    	Cuenta cuentaA = new Cuenta("Paco", 551756, "Ciudad de Mexico", 1234, 2000);
    	Cuenta cuentaB = new Cuenta("Luis", 556312, "Guadalajara", 5678, 1500);

    	System.out.println("\nEl saldo disponible de la cuenta A es: "+cuentaA.obtenerDisponible());
    	System.out.println("El saldo disponible de la cuenta B es: "+cuentaB.obtenerDisponible());

    	cuentaA.retirar(500);
        cuentaB.depositar(500);
        System.out.println("\n            Transfiriendo 500...\n");
    	
    	double saldoFinalA = cuentaA.obtenerDisponible();
    	System.out.println("El saldo actual de la cuenta A es: "+saldoFinalA);
    	double saldoFinalB = cuentaB.obtenerDisponible();
    	System.out.println("El saldo actual de la cuenta B es: "+saldoFinalB);


        System.out.println("\n              Retirando 5000...\n");
        cuentaA.retirar(5000);
        System.out.println("\n            Depositandando -500...\n");
        cuentaB.depositar(-500);
        
        double saldoFinal2A = cuentaA.obtenerDisponible();
        System.out.println("\nEl saldo actual de la cuenta A es: "+saldoFinal2A);
        double saldoFinal2B = cuentaB.obtenerDisponible();
        System.out.println("El saldo actual de la cuenta B es: "+saldoFinal2B+"\n");

        System.out.println("El dueño de la cuenta A es: "+cuentaA.obtenerNombre());
        cuentaA.asignarNombre("Elena");
        System.out.println("La nueva dueña de la cuenta A es: "+cuentaA.obtenerNombre());

        System.out.println("\nEl numero de telefono de la cuenta A es: "+ cuentaA.obtenerTelefono());
        cuentaA.asignarTelefono(657100);
        System.out.println("El nuevo numero de telefono de la cuenta A es: "+cuentaA.obtenerTelefono());

        System.out.println("\nLa direccion de la cuenta A es : "+cuentaA.obtenerDireccion());
        cuentaA.asignarDireccion("Estados Unidos");
        System.out.println("La nueva direccion de la cuenta A es: "+cuentaA.obtenerDireccion()+"\n");



        
    }
}
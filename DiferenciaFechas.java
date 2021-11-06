import java.util.Date;
import java.util.Scanner;

/**Programa para calcular la diferencia en dias entre dos fechas
*@author Andrea
*
*/



public class DiferenciaFechas{
	public static void main (String[] pps) {
//Declaracion de variables
		Scanner in = new Scanner(System.in);
		Date hoy = new Date (); //Fecha actual
		Date cumple; //Fecha de cumpleaños
		long dias = 0;
//Muestra de las fechas
		System.out.println("Hoy es "+hoy);

		System.out.println("Dame los datos del cumpleaños, uno por linea");
		System.out.println("Todos deben ser numeros: dia, mes y año");
		int dia = in.nextInt();
		int mes = in.nextInt() -1;
		int año = in.nextInt() -1900;
		cumple = new Date(año, mes, dia);

		System.out.println("Tu cumpleaños sera el "+cumple);
//Calculo de la diferencia
	//	dias = cumple.getTime()-hoy.getTime();
	//	dias = dias/(3600000*24);
	//	System.out.println("Faltan "+dias+ " dias para tu cumpleaños.");
//Obtiene el dia en que caera el cumpleaños




	}








}
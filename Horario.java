import java.util.Scanner;
public class Horario{
	public static void main (String[] pps) {
		String nombre, tratamiento;
		Scanner in = new Scanner (System.in);
		int horas, minutos, segundos, intervalo;
		Hora inicial;

		System.out.println("Ingrese el nombre delmpaciente");
		nombre = in.nextLine();
		System.out.println("Ingresa el nombre del tratamiento");
		tratamiento = in.nextLine();
		System.out.println("A que hora inicia el tratamiento, ingresa solo la hora");
		horas = in.nextInt();
		System.out.println("A que hora inicia el tratamiento, ingresa solo en minutos");
		minutos = in.nextInt();

		inicial = new Hora(horas, minutos, 0);

		System.out.println("Ingrese el intervalo en minutos");
		intervalo = in.nextInt();
		inicial.sumar(intervalo);

		System.out.println("La seguiente hora del medicamento es: "+inicial);

	}

}
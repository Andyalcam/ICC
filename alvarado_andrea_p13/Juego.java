/**
* @author Alvarado Camacho Andrea 
* @version 1.0
*/
import java.util.Scanner;

public class Juego{
    public static void main(String[] pps){

        Scanner in = new Scanner(System.in);
        boolean resp = true;
        Baraja barajita = new Baraja();
        int res, op;

        System.out.println("\n\t*********** HOLA BIENVENIDO ***********\n");

        do{
            Carta carta1= barajita.tomarCarta();
            Carta carta2= barajita.tomarCarta();

            System.out.println("\nLas dos cartas son: ");
            System.out.println("1. "+carta1);
            System.out.println("2. "+carta2);

            System.out.println("¿Cual escojes? (1 o 2)");
            op=in.nextInt();

            while (op!=1 && op!=2){
                System.out.println("Opcion invalida"+"\n"+ "Elije entre la res 1 o 2");
                op=in.nextInt();
            }

            System.out.println("\nLas cartas son:");
            Carta ncar = barajita.tomarCarta();

            while(!barajita.equals(carta1,ncar)&& !barajita.equals(carta2,ncar)){
                System.out.println(barajita.tomarCarta() );
                ncar=barajita.tomarCarta();
            }

            System.out.println(ncar.toString());

            if (op==1 && barajita.equals(carta1,ncar)|| op==2 && barajita.equals(carta2,ncar)){
                System.out.println("\n\t¡Ganasteeeee!");
            }else{
                System.out.println("\n\tPerdiste :c");
            }

            System.out.print("\n¿Quieres volver a jugar?\t");
            System.out.println("Si=1 No=2\n");
            res = in.nextInt();
        }while (res==1);

        System.out.println("\n\t*********** HASTA PRONTO ***********\n");
    }
}
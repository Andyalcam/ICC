import java.util.Scanner;
public class Prueba{
    public static void main(String []pps){
        Scanner lector = new Scanner(System.in);
        Gato juego = new Gato();
        String jugador = "X";
        int i,j;
        String tupla = "";
        System.out.println(juego);
        while(!juego.termino()){
        do{
            System.out.println("Jugador "+jugador+" : ");
          	System.out.print("coordenada x,y : ");
          	tupla = lector.nextLine().trim();
          	i = Integer.parseInt(tupla.split(",")[1]);
          	j = Integer.parseInt(tupla.split(",")[0]);
        }while(!juego.setTablero(jugador,i));
            System.out.println(juego);
          	jugador = jugador.equals("X")?"O":"X";
            /*if(jugador.equals('X')){
                jugador ='O';
            }else{
                jugador = 'X';
            }*/
        }

    }
}

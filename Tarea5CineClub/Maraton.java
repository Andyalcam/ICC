/**
 * Clase Maraton donde interactuamos con el usuario
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
import java.util.Scanner;
public class Maraton{
  public static void main(String [] pps) {
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    ColeccionFunciones c = new ColeccionFunciones();
    Funcion[] fn = c.obtenerArreglo();


    int condicion =1;
    while(condicion == 1){
    System.out.println("Bienvenido al Maratón de Terror");
    System.out.println("------------------------------------");
    System.out.println("Elige una opcion del menu");
    System.out.println("1. Ver las funciones disponibles a partir de un horario");
    System.out.println("2. Comprar un boleto");
    System.out.println("3. Salir");
    System.out.println("------------------------------------");
    int res = in2.nextInt();
    switch(res){
      case 1: System.out.println("Escribe el horario (ejemplo: 14:00)");
              String horario = in.nextLine();
              c.peliculasSobrantes(horario);
      break;
      case 2:
    System.out.println("------------------------------------");
    System.out.println("Las funciones que se muestran son: "+"\n");
    System.out.println("1)"+fn[0]);
    System.out.println("2)"+fn[1]);
    System.out.println("3)"+fn[2]);
    System.out.println("4)"+fn[3]);
    System.out.println("5)"+fn[4]);
    System.out.println("------------------------------------"+"\n");

    System.out.println("¿Qué tipo de boleto deseas comprar?(individual/general)");
    String tipo =in.nextLine();
    Boleto boleto;
    //Boleto general
    if(tipo.equals("general")){
      String asientos = "";
      for(int i=0; i<fn.length-1; i++){
        System.out.println("Elige un lugar para "+fn[i].obtenerPelicula());
        fn[i].imprimirMatriz();
        System.out.println("Ingresa la fila: A B C");
        String fila = in.nextLine();
        System.out.println("Ingresa la columna: 0 1 2 3");
        int columna = in2.nextInt();
        String asiento = fn[i].elegirAsiento(fila,columna);
        fn[i].disminuirLugares();
        asientos = asientos+","+asiento;
      }
      boleto = fn[5].comprarBoleto(tipo,asientos);
      System.out.print(boleto);
      System.out.println(asientos);
      //Boleto individual
    }else if(tipo.equals("individual")){
      System.out.println("¿Para qué función?(Ingresa el número)"+"\n"+" Recuerda que son:");
      System.out.println("------------------------------------"+"\n");
      System.out.println("1)"+fn[0]);
      System.out.println("2)"+fn[1]);
      System.out.println("3)"+fn[2]);
      System.out.println("4)"+fn[3]);
      System.out.println("5)"+fn[4]);
      System.out.println("------------------------------------"+"\n");

      //Elegimos funcion, podemos cambiar los ifs por un switch
      int op = in2.nextInt();
      fn[op-1].imprimirMatriz();
      System.out.println("Ingresa la fila: A B C");
      String fila = in.nextLine();
      System.out.println("Ingresa la columna: 0 1 2 3");
      int columna = in2.nextInt();
      int filaa = fn[op-1].obtenerFila(fila);
      if(fn[op-1].ocupado(filaa,columna)==false){
        String asiento = fn[op-1].elegirAsiento(fila,columna);
        boleto = fn[op-1].comprarBoleto(tipo,asiento);
        System.out.print(boleto);
        System.out.println(asiento);
      }else
      System.out.println("YA ESTA OCUPADO :C");
      /*if(op==1){
        boleto = fn[0].comprarBoleto(tipo);
        System.out.println(boleto);
      }else if(op == 2){
        boleto = fn[1].comprarBoleto(tipo);
        System.out.println(boleto);
      }else if(op==3){
        boleto = fn[2].comprarBoleto(tipo);
        System.out.println(boleto);
      }else if(op==4){
        boleto = fn[3].comprarBoleto(tipo);
        System.out.println(boleto);
      }else if(op==5){
        boleto = fn[4].comprarBoleto(tipo);
        System.out.println(boleto);
      }else{
        System.out.println("No es opción válida");
      }*/
      //No se ingreso ni general ni individual
    }else{
      System.out.println("No es un tipo válido");
    }

    //Se muestra las cantidades recaudadas
    System.out.println("------------------------------------"+"\n");
    System.out.println("Dinero recaudado y disponibilidad: ");
    System.out.println(fn[0].obtenerPelicula()+": $"+fn[0].obtenerRecaudado()+" disponibilidad : "+fn[0].obtenerDisponibilidad());
    System.out.println(fn[1].obtenerPelicula()+": $"+fn[1].obtenerRecaudado()+" disponibilidad : "+fn[1].obtenerDisponibilidad());
    System.out.println(fn[2].obtenerPelicula()+": $"+fn[2].obtenerRecaudado()+" disponibilidad : "+fn[2].obtenerDisponibilidad());
    System.out.println(fn[3].obtenerPelicula()+": $"+fn[3].obtenerRecaudado()+" disponibilidad : "+fn[3].obtenerDisponibilidad());
    System.out.println(fn[4].obtenerPelicula()+": $"+fn[4].obtenerRecaudado()+" disponibilidad : "+fn[4].obtenerDisponibilidad());
    System.out.println("Boletos generales"+": $"+fn[3].obtenertotalGenerales()); //cualquier funcion podria llamar al metodo
    System.out.println(fn[5].obtenerPelicula()+": $"+fn[0].obtenerTotalRecaudado());// y nos daría el mismo valor por ser static
    System.out.println("------------------------------------"+"\n");

    //Aqui podemos concluir el ciclo cambiando el valor de condicion por 0
    System.out.println("¿Deseas comprar otro boleto?(Ingresa el número:si=1/no=0)");
    condicion = in2.nextInt();
    break;
    case 3: condicion=2;
    break;
    default: System.out.println("Opcion invalida :c");
    }
  }
    System.out.println("\t\t*** HASTA PRONTO ***\n");
  }
}

/**
 * Programa para trabajar con metodos de la clase String
 * @author  Francisco Manuel Monreal Gamboa
 * @version 1
 */
public class Mosca {
    public static void main (String [] pps) {
        String frase = new String ("Una mosca parada en la pared, en la pared      ");
        String sinBlancos = frase.trim();
        String vocales = sinBlancos.toUpperCase();
        String agregarFrase = "PINTADA DE ROJO";
        String fecha = "Octubre 15 2020";
        String mes = fecha.substring(0,7);
        String dia = fecha.substring(8,10);
        String año = fecha.substring(11,15);

        System.out.println("La frase original es: "+frase);
        System.out.println("El largo de tu frase original: "+frase.length());
        System.out.println("La frase sin blancos es: "+frase.trim());
        System.out.println("El largo de tu nueva frase: "+sinBlancos.length());
        System.out.println("Frase en mayusculas: "+sinBlancos.toUpperCase());
        System.out.println("Cambio de vocales: "+vocales.replace("A","i").replace("O","i").replace("E","i").replace("U","i"));
        System.out.println("Segundo cambio de vocales: "+vocales.replace("U","I"));
        System.out.println("Cambio de palabra: "+frase.replace("mosca","MOSCOTA"));
        System.out.println("Agregar frase: "+frase+agregarFrase);
        System.out.println("La fecha original es: "+fecha);
        System.out.println("Fecha Nueva: "+dia+" "+mes+" "+año);



    }
}

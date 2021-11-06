import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class PruebaOrden
{
    public static void main(final String[] array) {

        final Punto[] array2 = { new Punto(19, 4), new Punto(-3, 2), new Punto(10, 10), new Punto(89, 8), new Punto(-2, -10), new Punto(34, 56) };
        final Persona[] array3 = { new Persona("Maria", 15, 1.5), new Persona("Daniela", 15, 1.51), new Persona("Alejandra", 15, 1.48), new Persona("Andrea", 19, 1.57), new Persona("Blanca", 23, 1.56), new Persona("Jorge", 23, 1.7), new Persona("Paco", 26, 1.8), new Persona("Mariana", 8, 1.2), new Persona("Diego", 8, 1.22), new Persona("Mario", 3, 0.9) };
        System.out.println("Los datos que se van a ordenar son:");
        for (int i = 0; i < array2.length; ++i) {
            System.out.print(array2[i] + " ");
        }

        Arrays.sort(array2, new PuntoComparable());
        System.out.println("\n\nLos puntos ordenados son ");
        for (int j = 0; j < array2.length; ++j) {
            System.out.print(array2[j] + " ");
        }

        System.out.println("\n\nLas personas que se van a ordenar son:");
        for (int k = 0; k < array3.length; ++k) {
            System.out.println(array3[k]);
        }
        
        Arrays.sort(array3, new PersonaComparable());
        System.out.println("\nLas personas ordenadas por edad y estatura son:");
        for (int l = 0; l < array3.length; ++l) {
            System.out.println(array3[l]);
        }
    }
}
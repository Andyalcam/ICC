/*
 * Practica2
 * Clase que muestra el uso de operaciones aritmeticas, tipos de datos primitivos
 * e identificadores
 *
 * @autor Francisco Manuel Monreal Gamboa
 * @version 1.0
 */

public class Practica2{
   public static void main(String [] args){

     int radioCirculo = 50;
     double areaCirculo;
     double pi = 3.1416;
     areaCirculo = ((radioCirculo*radioCirculo) * pi); //Formula que calula el area de un circulo
     String mensaje = "Area del Circulo: ";
     System.out.println (mensaje + areaCirculo);

     int altura = 10;
     double volumenCilindro = pi*radioCirculo*radioCirculo*altura; //Formula que calcula el volumen de un cilindro
     mensaje+= volumenCilindro;
     System.out.println("Volumen del Cilindro: "+volumenCilindro);

     //Area de un triangulo
     int baseTriangulo = 5;
     int alturaTriangulo =10;
     int areaTriangulo;

     areaTriangulo = (baseTriangulo*alturaTriangulo)/2 ; //Formula que calcula de Area de un triangulo

     System.out.println("Area del triangulo: "+areaTriangulo);

     //Volumen de un prisma rectangular
     int alturaPrisma = 20;
     int volumen;
     volumen = areaTriangulo*alturaPrisma;

     System.out.println("Volumen del prisma triangular: "+volumen);
     
     //Formula
     double a=2.0;
     double b=3.0;
     double c=4.0;
     double d=5.0;
     double r=6.0;
     double resultado1, resultado2, resultado3, resultadoFin;

     resultado1= (30.0)/(3*(r+34.0));
     resultado2= (a+(b*c))*9.0;
     resultado3= (a+(b*d))/(((3.0)+d)*(2.0+a));
     resultadoFin= resultado1-resultado2+resultado3;
     System.out.println("El resultado de la formula es: "+resultadoFin);

   }
 }

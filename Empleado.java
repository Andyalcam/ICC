public class Empleado {
String nombre;
int numEmpleado;
String area;

public Empleado registrarEmpleado(String nombre, int numEmpleado, String area) {
  switch(area) {
    case "carnes":
       Empleado em = new Empleado(nombre, numEmpleado, area);
       System.out.println(nombre + " es empleado de "+area);
       break;
    case "verduras":
       Empleado em = new Empleado(nombre, numEmpleado, area);
       System.out.println(nombre + " es empleado de "+area);
       break;       
    case "abarrotes":
       Empleado em = new Empleado(nombre, numEmpleado, area);
       System.out.println(nombre + " es empleado de "+area);
       break;
       return em;
       }
}
}
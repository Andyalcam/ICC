public class Nombre {
	public static void main (String [] args) {

		String nombre1="";
		
		if(args.length < 3){
			System.out.println("Debes ingresar al menos tres cadenas para el nombre.");
		
		}else{
			for(int i= 0; i<args.length-2; i++){
				nombre1 = nombre1 + args[i]+ " ";
			}
			System.out.println("El nombre completo es: "+args[args.length-2]+" "+args[args.length-1]+" "+nombre1);
			System.out.println("El nombre es: "+nombre1);		
		}
	}
}
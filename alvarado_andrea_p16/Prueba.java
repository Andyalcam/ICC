public class Prueba {
	public static void main (String [] args) {

		
		if(args.length < 3){
			System.out.println("Debes ingresar al menos tres cadenas.");
		
		}else{

			if(args[0].equals("-s")){
				System.out.println( new Double(args[1]) + new Double(args[2]));
			}

			if(args[0].equals("-d")){
				System.out.println( new Double(args[1]) / new Double(args[2]));
			}
		
		}

		/*for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}*/
	}
}
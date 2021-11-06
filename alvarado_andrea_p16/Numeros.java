public class Numeros {
	public static void main (String [] args) {
		
		if(args.length !=4){
			System.out.println("\nCantidad incorrecta de datos!!!\n");
		
		}else if(args[0].equals("-M")){
			if(new Double (args[1])>new Double (args[2]) && new Double (args[1])>new Double (args[3])){
				System.out.println("\nEl numero mayor es: "+new Double (args[1])+"\n");
			}else if(new Double (args[2])>new Double (args[1]) && new Double (args[2])>new Double (args[3])){
				System.out.println("\nEl numero mayor es: "+new Double (args[2])+"\n");
			}else if(new Double (args[3])>new Double (args[1]) && new Double (args[3])>new Double (args[2])){
				System.out.println("\nEl numero mayor es: "+new Double (args[3])+"\n");
			}else{
				System.out.println("\nOh no, creo que tus numeros son iguales :c\n");
			}
		}else if (args[0].equals("-m")){
			if(new Double (args[1])<new Double (args[2]) && new Double (args[1])<new Double (args[3])){
				System.out.println("\nEl numero menor es: "+new Double (args[1])+"\n");
			}else if(new Double (args[2])<new Double (args[1]) && new Double (args[2])<new Double (args[3])){
				System.out.println("\nEl numero menor es: "+new Double (args[2])+"\n");
			}else if(new Double (args[3])<new Double (args[1]) && new Double (args[3])<new Double (args[2])){
				System.out.println("\nEl numero menor es: "+new Double (args[3])+"\n");
			}else{
				System.out.println("\nOh no, creo que tus numeros son iguales :c\n");
			}
		}else if(args[0].equals("-p")){
			double suma = new Double (args[1])+new Double (args[2])+new Double (args[3]);
			double prom = suma/3;
			System.out.println("\nEl promedio de tus numeros es: "+prom+"\n");
		}else if(args[0].equals("-o")){
			if(new Double (args[1])>new Double (args[2]) && new Double (args[1])>new Double (args[3])){
				if(new Double (args[2])>new Double (args[3])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[1])+", "+new Double (args[2])+", "+new Double (args[3])+"\n");
				}else if(new Double (args[3])>new Double (args[2])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[1])+", "+new Double (args[3])+", "+new Double (args[2])+"\n");
				}
			}else if(new Double (args[2])>new Double (args[1]) && new Double (args[2])>new Double (args[3])){
				if(new Double (args[1])>new Double (args[3])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[2])+", "+new Double (args[1])+", "+new Double (args[3])+"\n");
				}else if(new Double (args[3])>new Double (args[1])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[2])+", "+new Double (args[3])+", "+new Double (args[1])+"\n");
				}
			}else if(new Double (args[3])>new Double (args[1]) && new Double (args[3])>new Double (args[2])){
				if(new Double (args[2])>new Double (args[1])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[3])+", "+new Double (args[2])+", "+new Double (args[1])+"\n");
				}else if(new Double (args[1])>new Double (args[2])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[3])+", "+new Double (args[1])+", "+new Double (args[2])+"\n");
				}
			}else{
				System.out.println("\nOh no, creo que tus numeros son iguales :c\n");
			}
		}else if(args[0].equals("-t")){
			if(new Double (args[1])>new Double (args[2]) && new Double (args[1])>new Double (args[3])){
				System.out.println("\nEl numero mayor es: "+new Double (args[1])+"\n");
			}else if(new Double (args[2])>new Double (args[1]) && new Double (args[2])>new Double (args[3])){
				System.out.println("\nEl numero mayor es: "+new Double (args[2])+"\n");
			}else if(new Double (args[3])>new Double (args[1]) && new Double (args[3])>new Double (args[2])){
				System.out.println("\nEl numero mayor es: "+new Double (args[3])+"\n");
			}else{
				System.out.println("\nOh no, creo que tus numeros son iguales :c\n");
			}

			if(new Double (args[1])<new Double (args[2]) && new Double (args[1])<new Double (args[3])){
				System.out.println("\nEl numero menor es: "+new Double (args[1])+"\n");
			}else if(new Double (args[2])<new Double (args[1]) && new Double (args[2])<new Double (args[3])){
				System.out.println("\nEl numero menor es: "+new Double (args[2])+"\n");
			}else if(new Double (args[3])<new Double (args[1]) && new Double (args[3])<new Double (args[2])){
				System.out.println("\nEl numero menor es: "+new Double (args[3])+"\n");
			}else{
				System.out.println("\nOh no, creo que tus numeros son iguales :c\n");
			}

			double suma = new Double (args[1])+new Double (args[2])+new Double (args[3]);
			double prom = suma/3;
			System.out.println("\nEl promedio de tus numeros es: "+prom+"\n");

			if(new Double (args[1])>new Double (args[2]) && new Double (args[1])>new Double (args[3])){
				if(new Double (args[2])>new Double (args[3])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[1])+", "+new Double (args[2])+", "+new Double (args[3])+"\n");
				}else if(new Double (args[3])>new Double (args[2])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[1])+", "+new Double (args[3])+", "+new Double (args[2])+"\n");
				}
			}else if(new Double (args[2])>new Double (args[1]) && new Double (args[2])>new Double (args[3])){
				if(new Double (args[1])>new Double (args[3])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[2])+", "+new Double (args[1])+", "+new Double (args[3])+"\n");
				}else if(new Double (args[3])>new Double (args[1])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[2])+", "+new Double (args[3])+", "+new Double (args[1])+"\n");
				}
			}else if(new Double (args[3])>new Double (args[1]) && new Double (args[3])>new Double (args[2])){
				if(new Double (args[2])>new Double (args[1])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[3])+", "+new Double (args[2])+", "+new Double (args[1])+"\n");
				}else if(new Double (args[1])>new Double (args[2])){
					System.out.println("\nLos numeros ordenados son: "+new Double (args[3])+", "+new Double (args[1])+", "+new Double (args[2])+"\n");
				}
			
			}
		}else{
			System.out.println("Opcion incorrecta!!!");
		}
	}
}
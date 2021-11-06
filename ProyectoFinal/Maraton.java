/**
 * Clase para dividir a una lista de nombres de jugadores y asignar parejas
 * @author Andrea Alvarado Camacho
 * @version 1.1
 */
public class Maraton{
	String [] nombres;
	String [] grupoA;
	String [] grupoB;

	/** Constructor que recibe un parametro
	* @param nombres - arreglo de tipo string 
	* que contiene los nombres de los jugadores
	*/
	public Maraton(String[] nombres){
		this.nombres = nombres;
		grupoA = new String[(int)Math.ceil((double)this.nombres.length/2)];
		grupoB = new String[(int)Math.ceil((double)this.nombres.length/2)];
	}

	/** Metodo para divir el grupo segun su indice
	* grupo A si son pares y grupoB B si son impares
	*/
	public void dividirGrupo(){
		int pos = 0;
		for(int i=0; i<nombres.length; i++){
			if(i%2==0){
				grupoA[pos]=nombres[i];
			}else if(i%2!=0){
				grupoB[pos]=nombres[i];
				pos++;	
			}
		}
	}

	/** Metodo para imprimir el grupo de parejas para el dia 1
	*/
	public void imprimeParejas1(){
		System.out.println("\n----------------------------------------------");
		System.out.println("Las parejas para el dia 1 son:\n");
		int cont=grupoB.length-1;
		for(int i=0; i<grupoA.length; i++){
			if(grupoB[cont]==null){
				grupoB[cont]="la computadora";
			}
			System.out.println("\t"+(i+1)+".- "+grupoA[i]+" vs "+grupoB[cont]);
			cont--;
		}
	}

	/** Metodo para imprimir el grupo de parejas para el dia 2
	*/
	public void imprimeParejas2(){
		System.out.println("\n----------------------------------------------");
		System.out.println("Las parejas para el dia 2 son:\n");
		int cont=0;
		for(int i=0; i<grupoA.length; i++){
			if(grupoB[cont]==null){
				grupoB[cont]="la computadora";
			}
			System.out.println("\t"+(i+1)+".- "+grupoA[i]+" vs "+grupoB[cont]);
			cont++;
		}
	}

	/** Metodo para imprimir el grupo de parejas para el dia 3
	*/
	public void imprimeParejas3(){
		System.out.println("\n----------------------------------------------");
		System.out.println("Las parejas para el dia 3 son:\n");
		int cont=0;
		for(int i=grupoA.length-1; i>=0; i--){
			if(grupoB[cont]==null){
				grupoB[cont]="la computadora";
			}
			System.out.println("\t"+(cont+1)+".- "+grupoA[i]+" vs "+grupoB[cont]);
			cont++;
		}
	}
}
/**
 * Clase para dividir a una lista de alumnos en dos versiones de examen
 * @author Andrea Alvarado Camacho
 */
public class Examen{
	String [] nombres;
	String [] examenA;
	String [] examenB;

	/** Constructor que recibe un parametro
	* @param nombres - arreglo de tipo string 
	* que contiene los nombres de los alumnos
	*/
	public Examen(String[] nombres){
		this.nombres = nombres;
		examenA = new String[(int)Math.ceil((double)this.nombres.length/2)];
		examenB = new String[(int)Math.ceil((double)this.nombres.length/2)];
	}

	/** Metodo para divir el grupo segun su indice
	* examen A si son pares y examen B si son impares
	*/
	public void dividirGrupo(){
		int pos = 0;
		for(int i=0; i<nombres.length; i++){
			if(i%2==0){
				examenA[pos]=nombres[i];
			}else if(i%2!=0){
				examenB[pos]=nombres[i];
				pos++;	
			}
		}
	}

	/** Metodo imprimir en reversa la lista de alumnos
	*/
	public void enReversa(){
		System.out.println("\n----------------------------------------------");
		System.out.println("Los enanitos en reversa son:\n");
		for (int i=nombres.length; i>0 ;i--) {
			System.out.println("\t"+(i)+".- "+nombres[i-1]);
		}
	}

	/** Metodo para imprimir a los alumnos que
	* hayan quedado en examen A
	*/
	public void imprimeExaA(){
		System.out.println("\n----------------------------------------------");
		System.out.println("Los enanitos que realizaran el examen A son:\n");
		for(int i=0; i<examenA.length; i++){
			System.out.println("\t"+(i+1)+".- "+examenA[i]);
		}
	}

	public void imprimeParejas(){
		System.out.println("\n----------------------------------------------");
		System.out.println("Los enanitos son:\n");
		int cont=examenB.length-1;
		for(int i=0; i<examenA.length; i++){
			if(examenB[cont]==null){
				examenB[cont]="la computadora";
			}
			System.out.println("\t"+(i+1)+".- "+examenA[i]+" vs "+examenB[cont]);
			cont--;
		}
	}

	/** Metodo para imprimir a los alumnos que
	* hayan quedado en examen B
	*/
	public void imprimeExaB(){
		System.out.println("\n----------------------------------------------");
		System.out.println("Los enanitos que realizaran el examen B son:\n");
		for(int i=0; i<examenB.length; i++){
			System.out.println("\t"+(i+1)+".- "+examenB[i]);
		}
	}
}
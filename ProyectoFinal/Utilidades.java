import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
* Clase de utilidades para mantener consistencia de los objetos guardados
* @author Andrea Alvarado Camacho
* @version 1.1
*/
public class Utilidades {
	Jugador[] arreglo = new Jugador[0];
	Conecta4[] arreglo2 = new Conecta4[0];
	MiniBJ[] arreglo3 = new MiniBJ[0];
	Carta[] arreglo4 = new Carta[0];
	Dados[] arreglo5 = new Dados[0];

	/**
	* Metodo para agregar jugadores a un arreglo
	* @param elem - objeto de tipo jugador
	* @return arreglo de tipo jugador
	*/
	public Jugador[] agregarJugadorArreglo(Jugador elem){
		Jugador[] nuevo = new Jugador[arreglo.length+1];
		for(int i=0; i<arreglo.length; i++){
			nuevo[i] = arreglo[i];
		}
		nuevo[nuevo.length-1] = elem;
		arreglo = nuevo;
		return arreglo;
	}

	/**
	* Metodo para agregar conecta4 a un arreglo
	* @param elem1 - objeto de tipo conecta4
	* @return arreglo de tipo conecta4
	*/
	public Conecta4[] agregarJuegoC4(Conecta4 elem1){
		Conecta4[] nuevo1 = new Conecta4[arreglo2.length+1];
		for(int i=0; i<arreglo2.length; i++){
			nuevo1[i] = arreglo2[i];
		}
		nuevo1[nuevo1.length-1] = elem1;
		arreglo2 = nuevo1;
		return arreglo2;
	}

	/**
	* Metodo para agregar black jack a un arreglo
	* @param elem2 - objeto de tipo black jack
	* @return arreglo de tipo black jack
	*/
	public MiniBJ[] agregarJuegoBJ(MiniBJ elem2){
		MiniBJ[] nuevo2 = new MiniBJ[arreglo3.length+1];
		for(int i=0; i<arreglo3.length; i++){
			nuevo2[i] = arreglo3[i];
		}
		nuevo2[nuevo2.length-1] = elem2;
		arreglo3 = nuevo2;
		return arreglo3;
	}

	/**
	* Metodo para agregar cartas a un arreglo
	* @param elem3 - objeto de tipo carta
	* @return arreglo de tipo carta
	*/
	public Carta[] agregarCartaArreglo(Carta elem3){
		Carta[] nuevo3 = new Carta[arreglo4.length+1];
		for(int i=0; i<arreglo4.length; i++){
			nuevo3[i] = arreglo4[i];
		}
		nuevo3[nuevo3.length-1] = elem3;
		arreglo4 = nuevo3;
		return arreglo4;
	}

	/**
	* Metodo para agregar dados a un arreglo
	* @param elem4 - objeto de tipo dados
	* @return arreglo de tipo dados
	*/
	public Dados[] agregarJuegoDados(Dados elem4){
		Dados[] nuevo4 = new Dados[arreglo5.length+1];
		for(int i=0; i<arreglo5.length; i++){
			nuevo4[i] = arreglo5[i];
		}
		nuevo4[nuevo4.length-1] = elem4;
		arreglo5 = nuevo4;
		return arreglo5;
	}

	/**
	* Metodo para leer objetos de tipo Jugador
	* @param ruta_del_archivo - nombre del archivo
	* @return arreglo de tipo Jugador
	*/
	public Jugador[] leerObjetoArchivo(String ruta_del_archivo){
		ObjectInputStream lect = null;

		try{
			lect = new ObjectInputStream(new FileInputStream(ruta_del_archivo));
			Object objeto;
			do{
				objeto = lect.readObject();
				if(objeto != null){
					agregarJugadorArreglo((Jugador)objeto);
				}
			}while (objeto != null);
		}catch(java.lang.ClassNotFoundException e){
		}catch(java.io.EOFException e){
		}catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}finally{
			if(lect != null){
				try{
					lect.close();
				}catch(IOException e){}
			}
		}
		return arreglo;
	}

	/**
	* Metodo para leer objetos de tipo conecta4
	* @param ruta_del_archivo1 - nombre del archivo
	* @return arreglo de tipo conecta4
	*/
	public Conecta4[] leerObjetoConecta4(String ruta_del_archivo1){
		ObjectInputStream lect1 = null;

		try{
			lect1 = new ObjectInputStream(new FileInputStream(ruta_del_archivo1));
			Object objeto1;
			do{
				objeto1 = lect1.readObject();
				if(objeto1 != null){
					agregarJuegoC4((Conecta4)objeto1);
				}
			}while (objeto1 != null);
		}catch(java.lang.ClassNotFoundException e){
		}catch(java.io.EOFException e){
		}catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}finally{
			if(lect1 != null){
				try{
					lect1.close();
				}catch(IOException e){}
			}
		}
		return arreglo2	;
	}

	/**
	* Metodo para leer objetos de tipo Black Jack
	* @param ruta_del_archivo2 - nombre del archivo
	* @return arreglo de tipo Black Jack
	*/
	public MiniBJ[] leerObjetoBJ(String ruta_del_archivo2){
		ObjectInputStream lect2 = null;

		try{
			lect2 = new ObjectInputStream(new FileInputStream(ruta_del_archivo2));
			Object objeto2;
			do{
				objeto2 = lect2.readObject();
				if(objeto2 != null){
					agregarJuegoBJ((MiniBJ)objeto2);
				}
			}while (objeto2 != null);
		}catch(java.lang.ClassNotFoundException e){
		}catch(java.io.EOFException e){
		}catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}finally{
			if(lect2 != null){
				try{
					lect2.close();
				}catch(IOException e){}
			}
		}
		return arreglo3	;
	}

	/**
	* Metodo para leer objetos de tipo carta
	* @param ruta_del_archivo3 - nombre del archivo
	* @return arreglo de tipo carta
	*/
	public Carta[] leerObjetoCarta(String ruta_del_archivo3){
		ObjectInputStream lect3 = null;

		try{
			lect3 = new ObjectInputStream(new FileInputStream(ruta_del_archivo3));
			Object objeto3;
			do{
				objeto3 = lect3.readObject();
				if(objeto3 != null){
					agregarCartaArreglo((Carta)objeto3);
				}
			}while (objeto3 != null);
		}catch(java.lang.ClassNotFoundException e){
		}catch(java.io.EOFException e){
		}catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}finally{
			if(lect3 != null){
				try{
					lect3.close();
				}catch(IOException e){}
			}
		}
		return arreglo4	;
	}

	/**
	* Metodo para leer objetos de tipo dados
	* @param ruta_del_archivo4 - nombre del archivo
	* @return arreglo de tipo dados
	*/
	public Dados[] leerObjetoDados(String ruta_del_archivo4){
		ObjectInputStream lect4 = null;

		try{
			lect4 = new ObjectInputStream(new FileInputStream(ruta_del_archivo4));
			Object objeto4;
			do{
				objeto4 = lect4.readObject();
				if(objeto4 != null){
					agregarJuegoDados((Dados)objeto4);
				}
			}while (objeto4 != null);
		}catch(java.lang.ClassNotFoundException e){
		}catch(java.io.EOFException e){
		}catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}finally{
			if(lect4 != null){
				try{
					lect4.close();
				}catch(IOException e){}
			}
		}
		return arreglo5	;
	}

	/**
	* Metodo para escribir objetos de cualquier tipo
	* @param ruta_del_archivo - nombre del archivo
	* @param arreglo - arreglo del tipo de objeto deseado a escribir
	*/
	public void EscribirObjetosArchivo(String ruta_del_archivo, Object[] arreglo){
		ObjectOutputStream escritor = null;
		try{
			escritor = new ObjectOutputStream(new FileOutputStream(ruta_del_archivo));
			for(int i=0; i<arreglo.length; i++){
				escritor.writeObject(arreglo[i]);
			}
		}catch(IOException e){
			System.out.println("Error en la grabacion: "+e);
		}finally{
			try{
				escritor.close();
			}catch(IOException e){}
		}
	}
}
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
* Clase de utilidades para mantener consistencia de los objetos guardados
* @author Andrea Alvarado Camacho
* @version 1.0
*/
public class Utilidaddes {
	Libro[] arreglo = new Libro[0];
	Disco[] arreglo1 = new Disco[0];
	Pelicula[] arreglo2 = new Pelicula[0];

	/**
	* Metodo para agregar libros a un arreglo
	* @param elem - objeto de tipo libro
	* @return arreglo de tipo Libro
	*/
	public Libro[] agregarLibroArreglo(Libro elem){
		Libro[] nuevo = new Libro[arreglo.length+1];
		for(int i=0; i<arreglo.length; i++){
			nuevo[i] = arreglo[i];
		}
		nuevo[nuevo.length-1] = elem;
		arreglo = nuevo;
		return arreglo;
	}

	/**
	* Metodo para agregar discos a un arreglo
	* @param elem1 - objeto de tipo disco
	* @return arreglo1 de tipo Disco
	*/
	public Disco[] agregarDiscoArreglo(Disco elem1){
		Disco[] nuevo1 = new Disco[arreglo1.length+1];
		for(int i=0; i<arreglo1.length; i++){
			nuevo1[i] = arreglo1[i];
		}
		nuevo1[nuevo1.length-1] = elem1;
		arreglo1 = nuevo1;
		return arreglo1;
	}

	/**
	* Metodo para agregar peliculas a un arreglo
	* @param elem2 - objeto de tipo pelicula
	* @return arreglo de tipo Pelicula
	*/
	public Pelicula[] agregarPeliArreglo(Pelicula elem2){
		Pelicula[] nuevo2 = new Pelicula[arreglo2.length+1];
		for(int i=0; i<arreglo2.length; i++){
			nuevo2[i] = arreglo2[i];
		}
		nuevo2[nuevo2.length-1] = elem2;
		arreglo2 = nuevo2;
		return arreglo2;
	}

	/**
	* Metodo para leer objetos de tipo libro
	* @param ruta_del_archivo - nombre del archivo
	* @return arreglo de tipo Libro
	*/
	public Libro[] leerObjetoArchivo(String ruta_del_archivo){
		ObjectInputStream lect = null;

		try{
			lect = new ObjectInputStream(new FileInputStream(ruta_del_archivo));
			Object objeto;
			do{
				objeto = lect.readObject();
				if(objeto != null){
					agregarLibroArreglo((Libro)objeto);
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
	* Metodo para leer objetos de tipo disco
	* @param ruta_del_archivo1 - nombre del archivo
	* @return arreglo de tipo Disco
	*/
	public Disco[] leerObjetoArchivoD(String ruta_del_archivo1){
		ObjectInputStream lect1 = null;

		try{
			lect1 = new ObjectInputStream(new FileInputStream(ruta_del_archivo1));
			Object objeto1;
			do{
				objeto1 = lect1.readObject();
				if(objeto1 != null){
					agregarDiscoArreglo((Disco)objeto1);
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
		return arreglo1;
	}

	/**
	* Metodo para leer objetos de tipo Pelicula
	* @param ruta_del_archivo2 - nombre del archivo
	* @return arreglo de tipo Pelicula
	*/
	public Pelicula[] leerObjetoArchivoP(String ruta_del_archivo2){
		ObjectInputStream lect2 = null;

		try{
			lect2 = new ObjectInputStream(new FileInputStream(ruta_del_archivo2));
			Object objeto2;
			do{
				objeto2 = lect2.readObject();
				if(objeto2 != null){
					agregarPeliArreglo((Pelicula)objeto2);
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
		return arreglo2;
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
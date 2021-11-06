// Editado por Andrea Alvarado Camacho 
public class Articulo {
   protected String titulo;
   protected String autor;
   protected int anio;

   public Articulo(String var1, String var2, int var3) {
      this.titulo = var1;
      this.autor = var2;
      this.anio = var3;
   }

   public int obtenerAnio() {
      return this.anio;
   }

   public String obtenerTitulo() {
      return this.titulo;
   }

   public String obtenerAutor() {
      return this.autor;
   }

   public void asignarAutor(String var1) {
      this.autor = var1;
   }

   public void asignarTitulo(String var1) {
      this.titulo = var1;
   }

   public void asignarAnio(int var1) {
      this.anio = var1;
   }

   public String toString() {
      return "\nTitulo: " + this.titulo + "\nAnio: " + this.anio + "\nAutor: " + this.autor;
   }
}
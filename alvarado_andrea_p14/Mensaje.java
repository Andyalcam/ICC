public class Mensaje {
   private String contenido;
   private boolean escuchado;

   public Mensaje(String var1) {
      this.contenido = var1;
      this.escuchado = false;
   }

   public boolean fueEscuchado() {
      return this.escuchado;
   }

   public String escucha() {
      this.escuchado = true;
      return this.contenido;
   }
}
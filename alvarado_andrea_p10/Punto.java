public class Punto {
   private int x;
   private int y;

   public void asignarX(int var1) {
      this.x = var1;
   }

   public void asignarY(int var1) {
      this.y = var1;
   }

   public int obtenerX() {
      return this.x;
   }

   public int obtenerY() {
      return this.y;
   }

   public void desplazar(int var1, int var2) {
      this.x += var1;
      this.y += var2;
   }

   public double distancia(Punto var1) {
      return Math.sqrt((double)((this.x - var1.obtenerX()) * (this.x - var1.obtenerX()) + (this.y - var1.obtenerY()) * (this.y - var1.obtenerY())));
   }

   public boolean estanAlineados(Punto var1, Punto var2) {
      return (this.y - var1.y) * (var2.x - var1.x) == (var2.y - var1.y) * (this.x - var1.x);
   }

   public Punto() {
      this.x = this.y = 0;
   }

   public Punto(int var1, int var2) {
      this.x = var1;
      this.y = var2;
   }

   public Punto(Punto var1) {
      this.x = var1.x;
      this.y = var1.y;
   }

   public boolean equals(Object var1) {
      Punto var2 = (Punto)var1;
      return this.x == var2.obtenerX() && this.y == var2.obtenerY();
   }

   public String toString() {
      return "(" + this.x + "," + this.y + ")";
   }
}
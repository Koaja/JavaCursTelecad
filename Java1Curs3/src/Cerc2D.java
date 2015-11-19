public class Cerc2D{
   public Punct2D p;
   public double r;
   
   public Cerc2D(){
   }
    
   public Cerc2D(Punct2D p, double r){
       this.p = p;
       this.r = r;
   }
   
   public Cerc2D(int x, int y, double r){
       this.p = new Punct2D();
       this.p.x = x;
       this.p.y = y;
       this.r = r;
   }
}
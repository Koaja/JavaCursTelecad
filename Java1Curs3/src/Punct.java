public class Punct {

   private int x;
   private int y;
   private boolean z;
   
   public Punct(){

   } 
    
   public Punct(int x, int y){
       this.x = x;
       this.y = y;
   }
   
   //getter
   public int getX(){
       return this.x;
   }
   
   //setter 
   public void setX(int x){
    if (x < 10) {
       this.x = x;
    }else {
        this.x = 0;
    }
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public boolean isZ(){
        return this.z;
    }
    
    public void setZ(boolean z){
        this.z = z;
    }
}
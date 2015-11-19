public class Punct{
   int x;
   int y;
   
   Punct(){  
    }
   
   Punct(int x, int y){
       this.x = x;
       this.y = y;
    }
    
   double calculeazaDistanta(Punct p){ //
     double distanta = Math.sqrt(((this.x - p.x) * (this.x - p.x)) +
                                  (this.y - p.y) * (this.y - p.y));
     
     return distanta;
    }
}


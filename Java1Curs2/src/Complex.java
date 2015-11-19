public class Complex{
   double a;
   double b;
   static double s;
   
   Complex(){
   }
    
   Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
   /* 
   Complex calculeazaSuma(Complex c){
       Complex rezultat = new Complex();
       
       rezultat.a = this.a + c.a;
       rezultat.b = this.b + c.b;
    
       return rezultat;
    }
    */
    
   static Complex calculeazaSuma(Complex c1, Complex c2){
       Complex rezultat = new Complex();
       rezultat.a = c1.a + c2.a;
       rezultat.b = c1.b + c2.a;
       return rezultat;
    }
}

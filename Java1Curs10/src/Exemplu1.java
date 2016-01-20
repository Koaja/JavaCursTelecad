public class Exemplu1 {
    public static void main(String [] args){
        // insiruire de instructiuni
        
        Fir1 f1 = new Fir1();
       
        
        f1.start();
         Fir2 f2 = new Fir2();
        new Thread(f2).start();
        
    }
}
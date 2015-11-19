public class Exemplu7{
    public static void main (String [] args){
        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(7, 9);
        
        //Complex rezultat = c1.calculeazaSuma(c2);
        
        //System.out.println(rezultat.a + " + " + rezultat.b + "i");
        
        Complex.s = 10;
        
        System.out.println(Complex.s);
        c1.s = 15;
        System.out.println(c2.s);
        
        Complex  rezultat2 = Complex.calculeazaSuma(c1,c2);
        System.out.println(rezultat2.a + " + " + rezultat2.b + "i");
    }
}


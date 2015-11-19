package TipuriImbricate;

/*
 * inner classes: class, interface, enum - clase ce se pot declara in alte clase
 * local classes: class, interface - clase puse in metode - RAR FOLOSITE - FUCK THIS SHIT
 * anonymous types: non final class, interface

 */

public class Exemplu4 {
    
   private static int x ;
    
    //inner type non static
   class C1{
       public void m1(){
           x = 10;
       }
    }
    
    //inner type static
   public static class C2{
       public void m2() {
           x = 15;
        }
    }
    
    //local type non static
    public void metoda1(){
        final int a = 5; // must be final to be accessed from m3();
        class c3 {
            public void m3(){
                System.out.println(a);
            }
        }
    }
    
    //local type static
    public static void metoda2(){
        final int b = 5; // must be final to be accessed from m4();
        class c4{
            public void m4(){
              System.out.println(b);
            }
        }
    }
    
    //anonymous types
}

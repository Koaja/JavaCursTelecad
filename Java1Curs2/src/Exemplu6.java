public class Exemplu6{
    public static void main (String [] args){
        
        Punct p1 = new Punct(2, 10);
        Punct p2 = new Punct(3, 7);
        
        double dist = p1.calculeazaDistanta(p2);
        System.out.println(dist);
        
        double dist2 = p1.calculeazaDistanta(new Punct(20, 9));
        System.out.println(dist2);
    }
}


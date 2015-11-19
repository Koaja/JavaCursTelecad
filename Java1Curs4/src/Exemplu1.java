public class Exemplu1{
    public static void main(String [] args){
       // Punct p = new Punct();
        Forma f1 = new Punct();
       //f1.x = 10;
        f1.nume = "Forma1";
        
        Punct p2 = (Punct)f1;
        p2.x = 10;
        System.out.println(p2.getClass());
        
        
        
        Forma [] vectorForme = new Forma[3];
        vectorForme[0] = new Punct(2,4);
        vectorForme[1] = new Cerc (new Punct (3, 6) , 10.5);
        vectorForme[2] = new Dreptunghi(new Punct(1, 6), 2.0 , 3.0);
        
        for(Forma f : vectorForme){
            //calcul perimetru pentru f
            System.out.println(f.calculPerimetru());
        }
    }
}
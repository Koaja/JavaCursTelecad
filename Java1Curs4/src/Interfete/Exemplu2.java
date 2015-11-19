package Interfete;

public class Exemplu2{
    public static void main (String [] args){
        Instrument i1 = new Pian();
        i1.canta();
        
        Instrument i2 = new Vioara();
        i2.canta();
        
       // Instrument [] i = new Instrument[2];
       // i[0] = new Pian();
       // i[1] = new Vioara();
        
       // for(Instrument d : i){
       // System.out.println(d.canta());
       // }
    }
}

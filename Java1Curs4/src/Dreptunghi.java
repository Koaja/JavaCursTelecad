public class Dreptunghi extends Forma{
    
    public Punct p;
    public double lungime;
    public double latime;
    
    Dreptunghi(){
    }
    
    Dreptunghi (Punct p, double lungime, double latime){
        this.p = p;
        this.lungime = lungime;
        this.latime = latime;
    }
    
    public double calculPerimetru(){
        return 2 * this.lungime + 2 * this.latime;
    }
}
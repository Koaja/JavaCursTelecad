public class Cerc extends Forma{
    
    public Punct p;
    public double raza;
    
    Cerc(){

    }
    
    Cerc (Punct p, double raza){
        this.p = p;
        this.raza = raza;
    }
    
    public double calculPerimetru(){
        return 2 * 3.14 * this.raza;
    }
}
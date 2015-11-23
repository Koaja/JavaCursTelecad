public class Produs {
    private String nume;
    private double pret;
    
    public Produs(){
        
    }
    
    public Produs(String nume, double pret){
        this.nume = nume;
        this.pret = pret;
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public String getNume(){
        return this.nume;
    }
    
    public void setPret(double pret){
        this.pret = pret;
    }
    
    public double getPret(){
        return this.pret;
    }
    
    public String toString(){
        return this.nume + " - " + this.pret;
    }
}
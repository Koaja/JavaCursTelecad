public class Angajat{
    private String nume;
    private double salariu;
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public String getNume(){
        return nume;
    }
    
    public void setSalariu(double salariu){
        this.salariu = salariu;
    }
    
    public double getSalariu(){
        return salariu;
    }
    
    public String toString(){
        return this.nume + " - " + this.salariu;
    }
}
package model;

public class Sejur implements java.io.Serializable{
    private String destinatie;
    private int nrZile;
    
    public Sejur(){
        
    }
    
    public Sejur(String destinatie, int nrZile){
        this.destinatie = destinatie;
        this.nrZile = nrZile; 
    }

    public String getDestinatie() {
        return destinatie;
    }

    public int getNrZile() {
        return nrZile;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public void setNrZile(int nrZile) {
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        return destinatie + " " + nrZile;
    }
    
   
}

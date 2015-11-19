package DesignPattern;

public class Conexiune {
  
    /*
     * constructor private
     * instanta a clasei se declara ca zona de memorie;
     * metoda publica ce da access la instanta
     */
    
    private static Conexiune singleton;
    private Conexiune(){
    }
    
    public static Conexiune getInstance(){
        if(singleton == null) 
        singleton = new Conexiune();
        return singleton;
    }
}

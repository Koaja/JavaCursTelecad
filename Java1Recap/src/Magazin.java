public class Magazin{
    Produs [] produse = new Produs[100];
    int nr = 0;
    
    public void adaugaProdus(Produs p){
        produse[nr] = p;
        nr++;
    }
    
    public void afiseazaProdus(){        
        for(int i = 0 ; i < this.nr ; i++){
            System.out.println(produse[i]);
        }
    }
    
}
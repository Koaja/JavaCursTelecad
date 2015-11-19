public class Masina{
    /*
     * atribute
     */
    
    int nrRoti; 
    String culoare; 
    String marca; 
    double pret; 
    
    /*
     * Constructor 
     * - creeaza o instanta
     * - 
     */
    
    /* BAD
    Masina(int r, String c, String m, double p){
        nrRoti = r;
        culoare = c;
        marca = m;
        pret = p;
    }
    */
   
   Masina(int nrRoti,String culoare, String marca, double pret){
       this.nrRoti = nrRoti;
       this.culoare = culoare;
       this.marca = marca;
       this.pret = pret;
   }
   
   Masina(){
    }
    
 /*
  * comportamente - Metode
  * modificatori - public , private ..
  * tipul - tipul valorii returnate
  * void - cand metoda nu returneaza nimic
  * numele metodei - incepe cu litera mica
  */
  void facePana(){
      System.out.println("Masina " + this.marca + " a facut pana");
    }
 
}
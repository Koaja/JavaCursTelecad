public class Exemplu5{
    public static void main (String [] args){
      Masina m = new Masina(); // new = operator instantiere  
                               // Masina() = constructor
                               // m = referinta
                               // Masina = zona memorie
      m.nrRoti = 4; // ( . ) punct = operator deferentiere
      m.culoare = "albastru";
      m.marca = "BMW";
      m.pret = 1000.5;
      
      System.out.println(m.nrRoti + "\t" + m.culoare + "\t" + m.marca + "\t" + m.pret);
      
      Masina m2 = new Masina(2,"negru","VW", 100.3);
      System.out.println(m2.nrRoti + "\t" + m2.culoare + "\t" + m2.marca + "\t" + m2.pret);
      
      m2.facePana();
    }
}
package TipuriImbricate;
//anonymous types
public class Exemplu6{
    public static void main(String [] args){
        Comestibil c = new Comestibil(){
        public void seMananca(){
              System.out.println(":)");
            }
        };
        
        c.seMananca();
    }
}
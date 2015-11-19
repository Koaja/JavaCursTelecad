import java.util.*;

public class Exemplu3 {
    public static void main (String [] args){
        Random rng = new Random(12);
        
        for(int i = 0 ; i < 10 ; i++){
            int x = rng.nextInt(6) + 1;
            int y = rng.nextInt(6) + 1;
            
            if(x == y){
                System.out.println("Dubla " + x + " " + y);
            } else {
                System.out.println("Mai incearca " + x + " " + y);
            }
        }
    }
}

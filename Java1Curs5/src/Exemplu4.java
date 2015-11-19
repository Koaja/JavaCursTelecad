import java.util.*;

public class Exemplu4{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        String line = input.nextLine();
        
        StringBuffer line1 = new StringBuffer(line);
        line1.reverse();
        
        System.out.println(line1);
    }
}
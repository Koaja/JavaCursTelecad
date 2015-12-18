import java.util.*;

public class Exemplu6 {
    public static void main(String [] args){
        HashSet<String> set = new HashSet<>();
        //display random
        set.add("Maria");
        set.add("Razvan");
        set.add("Ion");
        set.add("Laura");
        set.add("Ana");
        set.add("Vasile");
        set.add("Cristian");
        
        set.remove(new String("Cristian"));
        
        for(String elem : set){
            System.out.println(elem);
        }
        
        System.out.println("---------");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        //display in added order
        set2.add("Maria");
        set2.add("Razvan");
        set2.add("Ion");
        set2.add("Ana");
        set2.add("Vasile");
        set2.add("Cristian");
        
         for(String elem2 : set2){
            System.out.println(elem2);
        }
        
        System.out.println("---------");
        
        TreeSet<String> set3 = new TreeSet<>();
        //display in order
        
        set3.add("Maria");
        set3.add("Maria");
        set3.add("Razvan");
        set3.add("Ion");
        set3.add("Ana");
        set3.add("Vasile");
        set3.add("Cristian");
        
        for(String elem3 : set3){
            System.out.println(elem3);
        }
    }
}

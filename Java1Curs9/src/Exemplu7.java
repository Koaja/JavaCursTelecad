import java.util.*;

public class Exemplu7 {
    public static void main (String [] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(1, 100);
        map.put(3, 200);
        map.put(4, 300);
        map.put(7, 400);
        map.put(8, 500);
        map.put(3, 600);
        
        for(Integer elem : map.keySet()){
            System.out.println(map.get(elem));
        }
        
        System.out.println("-----------");
        
        LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();
        
        map2.put(1, 100);
        map2.put(3, 200);
        map2.put(4, 300);
        map2.put(7, 400);
        map2.put(8, 500);
        map2.put(3, 600);
        
         for(Integer elem : map2.keySet()){
            System.out.println(map2.get(elem));
        }
        
        System.out.println("-----------");
        
        TreeMap<Integer, Integer> map3 = new TreeMap<>();
        
        map3.put(1, 100);
        map3.put(3, 200);
        map3.put(4, 300);
        map3.put(7, 400);
        map3.put(8, 500);
        map3.put(3, 600);
        
         for(Integer elem : map3.keySet()){
            System.out.println(map3.get(elem));
        }
    }
}

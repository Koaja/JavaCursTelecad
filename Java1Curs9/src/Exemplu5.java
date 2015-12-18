import java.util.*;
public class Exemplu5 {

    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        
        /*
         * stiva -> addFirst(); removeFirst();
         * coada -> addLast(); removeFirst();
         * 
         */
        
        list.addFirst(4);
        list.addFirst(5);
        list.addLast(10);
        list.addFirst(15);
        list.addLast(14);
        
        list.removeFirst();
        list.removeLast();
        
        for(Integer i : list){
            System.out.println(i);
        }
    }
}

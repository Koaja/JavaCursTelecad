public class Exemplu2{
    public static void main (String [] args){
        int [] v;
        v = new int [10];
        
        v[0] = 1;
        v[1] = 2;
        v[3] = 4;
        
        System.out.println(v[0]);
        
        for (int i = 0 ; i < v.length ; i++){
            v[i] = i;
            
            System.out.println(v[i]);

        }
        
       // int [] [] m = new [5][];
    }
}
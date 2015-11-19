public class Exemplu5{
    public static void main (String [] args){
        int a = 20;
        int b = -2;
        
        if(a % 2 == 0){
            System.out.println("a este par" );
        }else{
            System.out.println("a este impar");
        }
        
        if (b > 0){
            System.out.println("b este pozitiv");
        } else if (b < 0){
            System.out.println("b este negativ");
              
        }else {
            System.out.println("b=0");
        }
    }
}


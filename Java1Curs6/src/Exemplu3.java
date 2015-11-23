import java.io.*;

public class Exemplu3 {
    
    public static void main (String [] args){
        try{
         suma();
        }catch(IOException e){
         e.printStackTrace();
        }
    }
   
 public static  void suma() throws IOException, NumberFormatException{
        BufferedReader in = null;
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        int firstNumber = Integer.parseInt(in.readLine());
        System.out.println("Enter second number: ");
        int secondNumber = Integer.parseInt(in.readLine());
            
        System.out.println("Their sum is " + (firstNumber + secondNumber));
        in.close();
    }  
}

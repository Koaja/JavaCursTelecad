import java.io.*;

public class Exemplu4{
    public static void main (String [] args){
        BufferedReader in = null;
        PrintStream out = null;
        
        try{
            in = new BufferedReader(new InputStreamReader(new FileInputStream("Exemplu1.java")));
            out = new PrintStream("test.txt");
            
            String line = "";
            while(( line = in.readLine()) != null){
                out.println(line);
            }
           
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
            in.close();
            out.close();
            }catch(IOException e2){
            e2.printStackTrace();
            }
        }
    }
}
import java.io.*;

public class Exemplu1{
    
    /*
     * 1.input
     * -low level: System.in
     *             InputStreamReader
     *             FileInputStream - citeste din fisier
     *             
     * -high level:BufferedReader - lucreaza cu siruri de chars
     *             ObjectInputStream - lucreaza cu instante
     *             DataInputStream
     *             
     * 2.output
     * -low level: OutputStream - 
     *             ByteArrayOutputStream - 
     *             FileOutputStream -
     * 
     * -high level: PrintStream -
     *              PrintWriter -
     *              ObjectOutputStream -
     *              DataOutputStream -
     */ 
    public static void main (String [] args){
        BufferedReader in = null;
    try{
        in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = in.readLine();
        System.out.println(line + " Timmeh");
    }catch(IOException e){
        e.printStackTrace();
    }finally{
        try{
        in.close();
        }catch(IOException e2){
        e2.printStackTrace();
        }
    }
    }
}


import java.io.*;

public class Exemplu5 {
    public static void main(String [] args){
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        
        try{
            out = new ObjectOutputStream(new FileOutputStream("test2.dat"));
            in = new ObjectInputStream(new FileInputStream("test2.dat"));
        Carte carte = new Carte("Crima si pedeapsa", 100);
        
        out.writeObject(carte);
        
        Carte carte2 =(Carte) in.readObject();
        System.out.println(carte2.getNume() + " " + carte2.getPret());
       }catch(IOException e){
           e.printStackTrace();
       }catch (ClassNotFoundException e3){
           e3.printStackTrace();
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
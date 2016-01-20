import java.util.*;

public class Producator extends Thread{

    public Producator(String nume){
        super(nume);
    }

    public void run(){
        Random r = new Random();

        while(true){
            synchronized(Exemplu2.list){
                if(Exemplu2.list.size() < 100){
                    int x = r.nextInt();
                    Exemplu2.list.add(x);
                    Exemplu2.list.notifyAll();
                    System.out.println("Producatorul " + Thread.currentThread().getName() 
                        + "  a adaugat " + x);
                }else {
                    try{
                    Exemplu2.list.wait();
                }catch(InterruptedException e){
                    
                }
                }
            }
        }
    }

}
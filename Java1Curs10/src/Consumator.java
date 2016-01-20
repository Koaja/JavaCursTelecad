import java.util.*;

public class Consumator extends Thread{

    public Consumator(String nume){
        super(nume);
    }

    public void run (){

        while(true){
            synchronized(Exemplu2.list){
                if(Exemplu2.list.size() > 0){
                    int x = Exemplu2.list.get(0);
                    Exemplu2.list.remove(0);
                    Exemplu2.list.notifyAll();
                    System.out.println("Consumatorul " + Thread.currentThread().getName() + 
                        " a sters numarul " + x);
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
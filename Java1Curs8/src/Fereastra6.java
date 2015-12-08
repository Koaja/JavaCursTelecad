import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra6 extends JFrame{
   JButton [] b = new JButton[9];
   int j = 0;
   
   public Fereastra6(){
       setTitle("Grid Layout");
       setSize(900,900);
       setLocationRelativeTo(null);
       setLayout(new GridLayout(3, 3));
       
       for(int i = 1 ; i <= b.length; i++){
           JButton b = new JButton("Button" + i);
           add(b);
        }
       
       setVisible(true);
   }
   
   public static void main(String [] args){
       new Fereastra6();
    }
}

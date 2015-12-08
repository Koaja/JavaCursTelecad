import javax.swing.*;
import java.awt.*;

public class Fereastra extends JFrame{
    
    JButton buton;
    JButton buton2;
    
    public Fereastra(){
        setSize(500,800);
        setLocationRelativeTo(null);
        setTitle("Welcome");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        buton = new JButton("Apasa"); // buton name
        add(buton);
        
        buton2 = new JButton("Home");
        add(buton2);
        
        
        
        setVisible(true);
    }
    
    public static void main(String [] args){
        new Fereastra();
    }
}
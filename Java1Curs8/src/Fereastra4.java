import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra4 extends JFrame {
    JButton buton1, buton2;
    int i = 1;
    int j = 2;
    
    public Fereastra4(){
        setTitle("Count");
        setSize(600,600);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        buton1 = new JButton(i + "");
        buton2 = new JButton(j + "");
        
        add(buton1);
        buton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                i += 2;
                buton1.setText("" + i);
            }
        });
        
        add(buton2);
        buton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                j += 4;
                buton2.setText("" + j);
            }
        });
        
        setVisible(true);
    }
       
    public static void main(String [] args){
        new Fereastra4();
    }
}
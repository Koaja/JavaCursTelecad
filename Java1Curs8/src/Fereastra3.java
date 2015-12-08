import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra3 extends JFrame implements ActionListener{
    JButton buton1, buton2;
    int i = 1;
    int j = 2;
    
    public Fereastra3(){
        setTitle("Count");
        setSize(600,600);
        setLocationRelativeTo(null);
        //setLayout(new FlowLayout());
        
        buton1 = new JButton("1");
        buton2 = new JButton("2");
        
        add(buton1, FlowLayout.RIGHT);
        buton1.addActionListener(this);
        
        add(buton2, FlowLayout.LEFT);
        buton2.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ev){
        JButton source = (JButton) ev.getSource();
        if(source == buton1){
            i += 2;
            buton1.setText("" + i);
        }else {
            j += 4;
            buton2.setText("" + j);
        }
    }
    
    public static void main(String [] args){
        new Fereastra3();
    }
}
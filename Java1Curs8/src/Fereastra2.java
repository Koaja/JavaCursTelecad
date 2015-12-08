import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Fereastra2 extends JFrame implements ActionListener{
    
    JButton button;
    
    public Fereastra2(){
       
        setSize(300,300);
        setTitle("Hello World");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        button = new JButton("Hello");
        add(button);
        
        button.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ev){
        if(button.getText().equals("Hello")){
            button.setText("World");
        }else {
            button.setText("Hello");
        }
    }
    
    public static void main(String [] args){
        new Fereastra2();
    }
}
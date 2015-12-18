import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplu1 extends JFrame{
    /*
     * Evenimente ale mouse-ului
     * 
     * mouseListener
     *  public void mouseClicked(MouseEvent ev)
     *  public void mousePressed(MouseEvent ev)
     *  ----------- mouseReleased
     *              mouseEntered
     *              mouseExited
     * 
     * mouseMotionListener
     *  public void mouseMoved(MouseEvent ev)
     *  ----------- mouseDragged
     *  
     *  MouseAdapter
     */
    
    JPanel panel;
    
    public Exemplu1(){
        setTitle("Paint");
        setSize(500, 500);
        setLocationRelativeTo(null);
        
        panel = new JPanel();
        add(panel);
        
        panel.addMouseListener(
            new MouseAdapter(){
                public void mousePressed(MouseEvent ev){
                    int x = ev.getX();
                    int y = ev.getY();
                    
                    Graphics g = panel.getGraphics();
                    g.setColor(Color.RED);
                    
                    if(ev.getClickCount() == 2){
                      g.fillOval(x-10, y-10, 20, 20);  
                    }                  
                }
            }
        );
        
        setVisible(true);
    }
    
    public static void main(String [] args){
        new Exemplu1();
    }
}
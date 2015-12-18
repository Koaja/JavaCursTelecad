import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fereastra<T extends JPanel> extends JFrame{
    T componenta;
    
    public Fereastra(){
        add(componenta);
    }
}
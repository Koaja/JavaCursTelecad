import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class Exemplu2 extends JFrame {
	JPanel panou;
	JMenuBar mb;
	JMenu menu;
	JRadioButtonMenuItem mi1;
	JRadioButtonMenuItem mi2;
	JRadioButtonMenuItem mi3;
	ButtonGroup bg;

	public Exemplu2() {
		setTitle("Paint");
		setSize(500, 500);
		setLocationRelativeTo(null);

		panou = new JPanel();
		mb = new JMenuBar();
		menu = new JMenu("Color");
		mi1 = new JRadioButtonMenuItem("RED");
		mi2 = new JRadioButtonMenuItem("BLUE");
		mi3 = new JRadioButtonMenuItem("GREEN");
		bg = new ButtonGroup();

		setJMenuBar(mb);
		mb.add(menu);
		menu.add(mi1);
		menu.add(mi2);
		menu.add(mi3);

		bg.add(mi1);
		bg.add(mi2);
		bg.add(mi3);

		add(panou);

		panou.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent ev) {
				int x = ev.getX();
				int y = ev.getY();

				Graphics g = panou.getGraphics();

				if (mi1.isSelected()) {
					g.setColor(Color.RED);
				}

				if (mi2.isSelected()) {
					g.setColor(Color.BLUE);
				}

				if (mi3.isSelected()) {
					g.setColor(Color.GREEN);
				}

				g.fillOval(x - 5, y - 5, 10, 10);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplu2();
	}
}
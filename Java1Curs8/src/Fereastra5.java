import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fereastra5 extends JFrame {
	JButton b1, b2, b3, b4, b5;

	public Fereastra5() {
		setTitle("Multiple Buttons");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		/*
		 * CENTER , NORTH , SOUTH , EAST , WEST
		 */
		b1 = new JButton("Cartman");
		add(b1, BorderLayout.CENTER);

		b1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent ev) {
				if (ev.getClickCount() == 3) {
					b1.setText("multiple pressed");
				}
			}

		});

		b2 = new JButton("Kenny");
		add(b2, BorderLayout.NORTH);

		b3 = new JButton("Stan");
		add(b3, BorderLayout.SOUTH);

		b4 = new JButton("Kyle");
		add(b4, BorderLayout.EAST);

		b5 = new JButton("Butters");
		add(b5, BorderLayout.WEST);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Fereastra5();
	}
}

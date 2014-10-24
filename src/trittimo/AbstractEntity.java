package trittimo;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class AbstractEntity extends JComponent {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.fillRect(15, 15, 100, 100);
	}

	@Override
	public void repaint() {
		super.repaint();
	}

}

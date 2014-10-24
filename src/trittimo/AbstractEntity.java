package trittimo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public abstract class AbstractEntity extends JComponent {
	protected abstract BufferedImage getSprite();

	public AbstractEntity() {

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public void repaint() {
		super.repaint();
	}

}

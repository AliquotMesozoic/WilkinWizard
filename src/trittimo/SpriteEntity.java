package trittimo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class SpriteEntity extends Entity {
	protected abstract BufferedImage getSprite();

	protected abstract Dimension getSpriteSize();

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public void repaint() {
		super.repaint();
	}

}

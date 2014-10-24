package trittimo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public abstract class SpriteEntity extends Entity {
	protected abstract String getSpritePath();

	private BufferedImage image;

	public SpriteEntity() {
		try {
			URL pathToSprite = getClass().getResource(getSpritePath());
			this.image = ImageIO.read(new File(pathToSprite.getPath()));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.rotate(getRotation());

		g2.drawImage(this.image, (int) getPosition().getX(),
				(int) getPosition().getY(), (int) getSize().getHeight(),
				(int) getSize().getWidth(), null);

		g2.rotate(-getRotation());
	}

}

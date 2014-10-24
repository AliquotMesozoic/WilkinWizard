package trittimo;

import java.awt.Dimension;
import java.awt.Point;

public class CageSorcerer extends SpriteEntity {
	private static final String CAGE_IMG_PATH = "cage-sorcerer.png";

	private Dimension size = new Dimension(100, 100);
	private Point position = new Point(300, 300);

	public CageSorcerer() {
		setSize(this.size);
		setPosition(this.position);
	}

	@Override
	protected String getSpritePath() {
		return CAGE_IMG_PATH;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}

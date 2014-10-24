package trittimo;

import java.awt.Dimension;
import java.awt.Point;

public class WilkinWizard extends SpriteEntity {
	private static final String WILKIN_IMG_PATH = "wilkin-wizard.png";

	private Dimension size = new Dimension(100, 100);
	private Point position = new Point(30, 30);

	public WilkinWizard() {
		setSize(this.size);
		setPosition(this.position);
	}

	@Override
	protected String getSpritePath() {
		return WILKIN_IMG_PATH;
	}

	@Override
	public void update() {
		System.out.println("hi");
		setRotation(getRotation() + Math.PI / 20);
	}
}

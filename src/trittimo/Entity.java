package trittimo;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JComponent;

public abstract class Entity extends JComponent {

	public abstract void update();

	private Point position = new Point(0, 0);
	private Dimension size = new Dimension(30, 30);
	private double rotation = 0;

	@Override
	public void repaint() {
		update();
		super.repaint();
	}

	@Override
	public Dimension getSize() {
		return this.size;
	}

	public Point getPosition() {
		return this.position;
	}

	@Override
	public void setSize(Dimension d) {
		this.size = d;
	}

	public void setPosition(Point p) {
		this.position = p;
	}

	public void setRotation(double amount) {
		this.rotation = amount % this.rotation;
	}

	public double getRotation() {
		return this.rotation;
	}
}

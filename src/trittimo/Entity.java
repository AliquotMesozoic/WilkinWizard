package trittimo;

import java.awt.Point;

import javax.swing.JComponent;

public abstract class Entity extends JComponent {
	protected abstract double getRotation();

	protected abstract Point getPosition();
}

package trittimo;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class WizardPanel extends JPanel {

	private ArrayList<Entity> entities = new ArrayList<Entity>();

	public WizardPanel() {
		GameUpdater updater = new GameUpdater(this);
		new Thread(updater).start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Entity entity : this.entities) {
			// entity.update();
			entity.repaint();
		}
	}

	public void addEntity(SpriteEntity entity) {
		this.entities.add(entity);
		this.add(entity);
	}

}

package trittimo;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class WizardPanel extends JPanel {

	private ArrayList<AbstractEntity> entities = new ArrayList<AbstractEntity>();

	public WizardPanel() {
		GameUpdater updater = new GameUpdater(this, this.entities);
		new Thread(updater).start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	public void addEntity(AbstractEntity entity) {
		this.entities.add(entity);
		this.add(entity);
	}

}

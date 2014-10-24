package trittimo;

import java.util.ArrayList;

import javax.swing.JPanel;

public class WizardPanel extends JPanel {

	ArrayList<AbstractEntity> entities = new ArrayList<AbstractEntity>();

	public WizardPanel() {

	}

	public void addEntity(AbstractEntity entity) {
		this.entities.add(entity);
		this.add(entity);
	}

}

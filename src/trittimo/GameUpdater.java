package trittimo;

import java.util.ArrayList;

public class GameUpdater implements Runnable {
	public static final int SLEEP_MS = 33;

	private WizardPanel panel;
	private ArrayList<AbstractEntity> entities;

	public GameUpdater(WizardPanel panel, ArrayList<AbstractEntity> entities) {
		this.panel = panel;
		this.entities = entities;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(SLEEP_MS);
				for (AbstractEntity entity : this.entities) {
					entity.repaint();
				}
				this.panel.repaint();
			}
		} catch (Exception e) {
			System.out.println("Yo somethin went wrong");
		}
	}

}

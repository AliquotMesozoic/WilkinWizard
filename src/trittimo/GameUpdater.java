package trittimo;


public class GameUpdater implements Runnable {
	public static final int SLEEP_MS = 33;

	private WizardPanel panel;

	public GameUpdater(WizardPanel panel) {
		this.panel = panel;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(SLEEP_MS);
				this.panel.repaint();
			}
		} catch (Exception e) {
			System.out.println("Yo somethin went wrong");
		}
	}

}

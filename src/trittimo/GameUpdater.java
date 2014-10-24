package trittimo;

public class GameUpdater implements Runnable {
	public static final int SLEEP_MS = 33;

	private AbstractEntity entity;

	public GameUpdater(AbstractEntity entity) {
		this.entity = entity;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(SLEEP_MS);
			this.entity.repaint();
		} catch (Exception e) {
			System.out.println("Yo somethin went wrong");
		}
	}

}

package trittimo;

import javax.swing.JFrame;

public class WizardInit {
	public static final double version = 0.1;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Wilkin Wizard Version " + version);

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		WizardPanel panel = new WizardPanel();

		frame.add(panel);

		frame.setVisible(true);

	}

}

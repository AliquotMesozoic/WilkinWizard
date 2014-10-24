package trittimo;

import javax.swing.JFrame;

public class WizardInit {
	public static final double version = 0.1;

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Wilkin Wizard Version " + version);

		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFrame.setVisible(true);

	}

}

package pong.game;

import javax.swing.JFrame;

/**
 * This is the entry point for our Pong game. The main method gets called when the program starts, and that
 * starts the UI and then updates the GameGod
 */
public class Runner {

	public static void main(String[] arr) throws InterruptedException {

		Ball ball = new Ball(100, 100, 32, 32);
		
		GameGod god = new GameGod(ball);
		
		PongUI ui = new PongUI(god);
		
		System.out.println("Puts some pants on, Danny!");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(ui);
		
		while(true) {
			god.update();
			ui.repaint();
			Thread.sleep(1000 / 30);
		}
	}
}

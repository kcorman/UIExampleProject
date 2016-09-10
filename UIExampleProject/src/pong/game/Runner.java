package pong.game;

/**
 * This is the entry point for our Pong game. The main method gets called when the program starts, and that
 * starts the UI and then updates the GameGod
 */
public class Runner {

	public static void main(String[] arr) throws InterruptedException {
		GameGod god = new GameGod();
		while(true) {
			god.update();
			// Update the UI when we have it
			Thread.sleep(1000 / 30);
		}
	}
}

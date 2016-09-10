package pong.game;

import java.awt.Graphics;

/**
 * This is where the core game logic resides. the update() method will get called periodically by the main game thread
 */
public class GameGod {
	private Ball ball;
	
	public GameGod(Ball ball) {
		this.ball = ball;
	}
	
	public void update() {
		ball.update();
	}
	
	public void draw(Graphics g) {
		ball.draw(g);
	}
}

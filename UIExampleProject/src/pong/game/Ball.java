package pong.game;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	int x;
	int y;
	int width;
	int height;
	int dy = 1;
	
	public Ball(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update() {
		y = y + dy;
		dy += 1;
		
		if(y > 600) {
			dy = -dy;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
}

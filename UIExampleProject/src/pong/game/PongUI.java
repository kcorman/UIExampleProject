package pong.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class PongUI extends JPanel {
	private final GameGod god;

	public PongUI(GameGod god) {
		this.god = god;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		god.draw(g);
	}
}

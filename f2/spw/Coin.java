package f2.spw;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;

public class Coin extends Sprite{
	
	private int step = 10;
	private boolean collected = true;
	
	public Coin(int x, int y) {
		super(x, y, 8, 10);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		
	}

	public void proceed(){
		y += step;
	}
	
	public boolean getCollected(){
		return collected;
	}
}
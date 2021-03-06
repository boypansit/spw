package f2.spw;

import javax.swing.*;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private BufferedImage bi;	
	Graphics2D big;
	ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	private Button bt =new Button();
	public GamePanel() {
		bi = new BufferedImage(400, 600, BufferedImage.TYPE_INT_ARGB);
		big = (Graphics2D) bi.getGraphics();
		big.setBackground(Color.black);
	}
	public void updateGameUI(GameReporter reporter){
		big.clearRect(0, 0, 400, 600);
		
		big.setColor(Color.white);		
		big.drawString(String.format("dodge score %08d", reporter.getScore()), 250, 20);
		big.drawString(String.format("%08d", reporter.getScoreC()), 50, 20);
		if(reporter.getwin()){
			big.drawString(String.format(" win "), 150, 20);
		}
		for(Sprite s : sprites){
			s.draw(big);
		}

		repaint();
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(bi, null, 0, 0);
		
	}

}

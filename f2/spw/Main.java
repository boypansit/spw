package f2.spw;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.lang.Exception;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		BorderLayout layouts = new BorderLayout();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
		JButton bt= new JButton(">W<");
		JPanel test=new JPanel();
		/*test.setLayout(new BorderLayout());
		test.add(bt,BorderLayout.CENTER);*/
		SpaceShip v = new SpaceShip(180, 550, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp, v);
		
		frame.addKeyListener(engine);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		//frame.getContentPane().add(test, BorderLayout.SOUTH);
		frame.setVisible(true);
		
		engine.start();
	}
}

/**
 * Alex Love period 2
 */
import javax.swing.JFrame;
import java.awt.*;

public class Cow extends JFrame{
	
	public Cow(){
	init();
		
	}
	public void init() {
		setSize(700,600);
		setBackground(Color.BLUE);
		repaint();
	}
	public void paint(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillRect(50, 100, 400, 200);
		g.setColor(Color.WHITE);
		g.fillOval(350, 50, 150, 100);
		g.setColor(Color.BLACK);
		g.drawOval(350, 50, 150, 100);
		g.fillRect(360, 300, 10, 50);
		g.fillRect(80, 300, 10, 50);
		g.fillRect(50, 300, 10, 50);
		g.fillRect(440, 300, 10, 50);
		
	}
	public static void main(String[] args) {
		
	Cow cow = new Cow();
	cow.setVisible(true);
	cow.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}


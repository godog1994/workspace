import javax.swing.JFrame;
import java.awt.*;

public class Flag extends JFrame{
	private int flagLength = 627;
	private int flagWidth = 330;
	private int redStripeWidth = flagWidth/13;
	
	
	public Flag()
	{
	
	init();
	}
	
	public void init() {
		setSize(flagLength,flagWidth);
		setBackground(Color.WHITE);
		repaint();
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 30, 627,redStripeWidth);
		}
	
	
	public static void main(String[] args) {
		
	Flag flag = new Flag();
	flag.setVisible(true);
	flag.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
public class Star {

	public Star()
	{
		
	}
}


}
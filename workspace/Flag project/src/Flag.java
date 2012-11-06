import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;

public class Flag extends JFrame implements ActionListener{
	private int flagLength = 494;
	private int flagWidth = 260;
	private int unionWidth = 7*flagWidth/13;
	private int unionLength = (int)19*flagWidth/25;
	private int redStripeWidth = flagWidth/13;
	private int widthInc = (int)63*flagWidth/1000;
	private int lengthInc = (int)27*flagWidth/500;
	private int starRadius = 77*flagWidth/2500; 
	
	private JPanel stripesPanel, starsPanel;
	
	
	public Flag()
	{
	
	init();
	}
	
	public void init() {
		setSize(flagLength,flagWidth + 20);
		setBackground(Color.WHITE);
		
		repaint();
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		for (int i = 0; i < 7; i++)
		{
			g.fillRect(0, 20 + 40*i, flagLength, redStripeWidth);
		}
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 20, unionLength , unionWidth);
		g.setColor(Color.WHITE);
	
		int[] xPoints = new int[10];
		int[] yPoints = new int[10];
		for (int i = 0; i < 10; i++)
		{
			if( i % 2 == 0)
			{
				xPoints[i] = (int) (starRadius*Math.sin(i *Math.PI/5)/2);
				yPoints[i] = (int) (starRadius*Math.cos(i *Math.PI/5)/2);
			}
			else
			{
				xPoints[i] = (int) (starRadius*Math.sin(i *Math.PI/5));
				yPoints[i] = (int) (starRadius*Math.cos(i *Math.PI/5));
			}
			
			//System.out.println(xPoints[i] + " " + yPoints[i]);
			
		}
		
		for (int i = 0; i< 5; i++)
		{
			
			for (int j = 0; j<6; j++)
			{
				//g.fillRect((2*j+1)*widthInc, (2*i+1)*lengthInc + 20, 5, 5);
				
				int[] customxPoints = new int[10];
				int[] customyPoints = new int[10];
				for (int k = 0; k < 10; k++)
				{
					customxPoints[k] = (2*j+1)*widthInc + xPoints[k];
					customyPoints[k] = (2*i+1)*lengthInc + yPoints[k] + 20;
					//System.out.println(customxPoints[k] + " " + customyPoints[k]);
				}
				
				g.fillPolygon(customxPoints, customyPoints, 10);
			}
		}
		for (int i = 0; i< 4; i++)
		{
			
			for (int j = 0; j<5; j++)
			{
				
				
				int[] customxPoints = new int[10];
				int[] customyPoints = new int[10];
				for (int k = 0; k < 10; k++)
				{
					customxPoints[k] = (2*j+2)*widthInc + xPoints[k];
					customyPoints[k] = (2*i+2)*lengthInc + yPoints[k] + 20;
					//System.out.println(customxPoints[k] + " " + customyPoints[k]);
				}
				g.fillPolygon(customxPoints, customyPoints, 10);
			}
		}
		
		
		}
	
	 public void componentDragged(ComponentEvent e) {
	        
	    }
	 
	
	
	public static void main(String[] args) {
		
	Flag flag = new Flag();
	flag.setVisible(true);
	
	
	//flag.addWindowListener(l)
	flag.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
		
	}
	

}


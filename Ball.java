import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent {
	private Ellipse2D.Double circle; 
	public Ball(int x, int y){
		circle = new Ellipse2D.Double(0,0,15,15);
		this.setSize(new Dimension(16,16));
		this.setLocation(x,y);
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.green);
		g2.fill(circle);
	}
}

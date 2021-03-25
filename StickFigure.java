import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JComponent;

public class StickFigure extends JComponent{
	
	private Rectangle2D.Double main;
	private Ellipse2D.Double head;
	private Rectangle2D.Double arms;
	private Rectangle2D.Double body;
	private Rectangle2D.Double legLeft;
	private Rectangle2D.Double legRight;
	private Ellipse2D.Double racket;
	private Rectangle2D.Double handle;
	
	public StickFigure(int x, int y){
		main = new Rectangle2D.Double(0,0,50,120);
		head = new Ellipse2D.Double(13,0,24,30);
		arms = new Rectangle2D.Double(0,30,50,13);
		body = new Rectangle2D.Double(17.5,43,15,40);
		legLeft = new Rectangle2D.Double(6,83,12,37);
		legRight = new Rectangle2D.Double(32,83,12,37);
		handle = new Rectangle2D.Double(4,15,5,15);
		racket = new Ellipse2D.Double(0,2,12,12);
		
		this.setSize(new Dimension(51,121));
		this.setLocation(x,y);
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		//g2.setColor(new Color(255, 0, 0, 0));
		//g2.draw(main);
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(head);
		g2.fill(body);
		g2.fill(arms);
		g2.fill(legLeft);
		g2.fill(legRight);
		
		g2.setColor(Color.black);
		g2.fill(handle);
		g2.draw(racket);
	}
}

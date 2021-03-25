import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	boolean started = false;

	public MainFrame() {
		setTitle("Shreeniket's Amazing Stick Figure.");
		//getContentPane().setBackground(Color.black);


		setBounds(100,100,800,600);
		setLayout(null);

		StickFigure figure = new StickFigure(200,100);
		add(figure);

		Ball ball = new Ball(100, 125);
		add(ball);

		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent componentEvent) {
				figure.setLocation(10,10);
				//Next line commented so ball wont reset. Feel free to uncomment if you would like it to.
				//ball.setLocation(100,125); 
			}
		});

		this.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_W && figure.getY()>getContentPane().getY()){
					figure.setLocation(figure.getX(),figure.getY()-10);

					if ((figure.getY()<(ball.getY()+ball.getHeight())) 
							&& (figure.getX()<ball.getX()+ball.getWidth() && !(figure.getX()+figure.getWidth()<ball.getX()))
							&& (figure.getY()+figure.getHeight()>ball.getY())) {
						ball.setLocation(ball.getX(), figure.getY()-ball.getHeight()-1);

					}
				}
				else if(e.getKeyCode() == e.VK_S && figure.getY()+figure.getHeight()<getContentPane().getY()+getContentPane().getHeight())
				{
					figure.setLocation(figure.getX(),figure.getY()+10);

					if ((figure.getY()+figure.getHeight()>(ball.getY()))
							&& (figure.getX()<ball.getX()+ball.getWidth() && !(figure.getX()+figure.getWidth()<ball.getX()))
							&& (figure.getY()<ball.getY()+ball.getHeight())) {
						ball.setLocation(ball.getX(), figure.getY()+figure.getHeight()+1);
					}
				}
				else if(e.getKeyCode() == e.VK_A && figure.getX()>getContentPane().getX())
				{
					figure.setLocation(figure.getX()-10,figure.getY());

					if((figure.getX()<(ball.getX()+ball.getWidth()))
							&& (figure.getY()<ball.getY()+ball.getHeight() && !(figure.getY()+figure.getHeight()<ball.getY()))
							&& (figure.getX()+figure.getWidth()>ball.getX())){
						ball.setLocation(figure.getX()-ball.getWidth()-1, ball.getY());
					}
				}

				else if(e.getKeyCode() == e.VK_D && figure.getX()+figure.getWidth()<getContentPane().getX()+getContentPane().getWidth())
				{
					figure.setLocation(figure.getX()+10,figure.getY());

					if((figure.getX()+figure.getWidth()>(ball.getX()))
							&&(figure.getY()<ball.getY()+ball.getHeight() && !(figure.getY()+figure.getHeight()<ball.getY()))
							&& (figure.getX()<ball.getX()+ball.getWidth())){
						ball.setLocation(figure.getX()+figure.getWidth()+1, ball.getY());
					}
				}

			}

			@Override
			public void keyReleased(KeyEvent arg0) 
			{

			}

			@Override
			public void keyTyped(KeyEvent arg0) 
			{

			}
		});
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new MainFrame();
	}
}

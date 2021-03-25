//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//
//import javax.swing.JFrame;
//
//public class BallFrame extends JFrame
//{
//	
//	public BallFrame()
//	{
//		setBounds(100,100,800,600);
//		setLayout(null);
//		
//		Ball ball = new Ball(200,300);
//		add(ball);
//		this.addKeyListener(new KeyListener() {
//
//			@Override
//			public void keyPressed(KeyEvent e) 
//			{
//				
//				
//				if(e.getKeyCode() == e.VK_W)
//				{
//					ball.setLocation(ball.getX(),ball.getY()-10);
//					
//					
//				}
//				else if(e.getKeyCode() == e.VK_S)
//				{
//					ball.setLocation(ball.getX(),ball.getY()+10);
//					
//				}
//				else if(e.getKeyCode() == e.VK_A)
//				{
//					ball.setLocation(ball.getX()-10,ball.getY());
//					
//				}
//					
//				else if(e.getKeyCode() == e.VK_D)
//				{
//					ball.setLocation(ball.getX()+10,ball.getY());
//					
//				}
//					
//				
//				
//				
//			}
//
//			@Override
//			public void keyReleased(KeyEvent arg0) 
//			{
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void keyTyped(KeyEvent arg0) 
//			{
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
//		
//		
//		
//		setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}
//
//		
//		
//
//		
//	
//	public static void main(String[] args) 
//	{
//		new BallFrame();
//
//	}
//
//}

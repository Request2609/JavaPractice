//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//import java.util.*;
//
//public class Practices {
//	public static void main(String[]args){
//		
//		MyFrame ff= new MyFrame();
//	}
//}
//
//class MyFrame extends JFrame{
//	
//	MyPanel pp=null;
//	JButton jb1=null,jb2=null,jb3=null,jb4=null;
//	public MyFrame(){
//		
//		jb1 = new JButton("Up");
//		jb2= new JButton("Right");
//		jb3 = new JButton("Down");
//		jb4 = new JButton("Left");
//		
//		pp=new MyPanel();
//		
//		this.setTitle("Move Circle");
//		this.setBounds(100, 100, 400, 400);
//		this.add(pp);
//		this.addKeyListener(pp);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
//		
//		
//	}
//	public void KeyEventsListener(KeyEvent e){
//		
//	}
//}
//
//class MyPanel extends JPanel implements KeyListener{
//	
//	int speed;
//	double x;
//	double y;
//	int width,height;
//	double r;
//	double angle =0;
//	double startx,starty;
//	int X,Y;
//	int flag;
//	public MyPanel(){
//		
//		setSize(400,400);
//		x= 200;
//		speed=0;
//		y=200;
//		width = 30;
//		height = 30;
//		r = y-10;
//		flag=0;
//		X = (int)(x+width/2);
//		Y=(int) y;
//		
//		startx = this.getWidth()/2.0;
//		starty= 20;
//		
//		Timer timer = new Timer();
//		
//		timer.schedule(new TimerTask() 
//		{
//			       public void run(){
//			    	   if(angle<60&&flag ==0) {
//			    		   angle +=1;
//			    	   }
//			    	   if(angle == 60&&flag ==0) {
//			    		   flag =1 ;
//			    	   }
//			    	   if(angle<60&&angle>-60&&flag == 1) {
//			    		   angle--;
//			    	   }
//			    	   if(angle == -60&&flag== 1) {
//			    		   angle++;
//			    		   flag=0;
//			    	   }
//						System.out.println(startx+ " " + starty + "  " + r);
//						double q,p;
//						if(angle>0) {
//								q = r*Math.sin(Math.toRadians(angle));
//						}
//						else {
//							q = -r*Math.sin(Math.toRadians(angle));
//						}
//						double tx = startx - r*Math.sin(Math.toRadians(angle));
//					    double ty  = 20 +r* Math.cos(Math.toRadians(angle));
//					    x = tx - 15;
//					    y = ty - 15;
//					    System.out.println(x+ " " + y);
//			    	    repaint();
//			    	   }
//		},1000,100) ;
//		
//	}
//	
//	
//	public void paint(Graphics g){
//		super.paint(g);
//		g.setColor(Color.GREEN);
//		g.fillOval((int)x,(int) y, 30, 30);
//		g.drawLine((int)startx,(int)starty,(int)x+15,(int)y+15);
//		
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {		
//		 System.out.println(x+ " " + y);
//		int i=0;
//		if(e.getKeyCode()==KeyEvent.VK_DOWN){
//			
//			}
//		if(speed!=0&&e.getKeyCode()==KeyEvent.VK_UP){
//				speed-=5;
//			}
//		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
//				speed+=5;
//			}	
//		if(e.getKeyCode()==KeyEvent.VK_LEFT){		
////			angle +=1;
////			System.out.println(startx+ " " + starty + "  " + r);
////			double tx = startx - r*Math.sin(Math.toRadians(angle));
////		    double ty  = 20 + r* Math.cos(Math.toRadians(angle));
////		    x = tx - 15;
////		    y = ty - 15;
////		    System.out.println(x+ " " + y);
//			}
//		//run();
//		repaint();
//	}
//	
//	public boolean isoutxl(){
//		if(X-0.5*r<startx&&X+0.5*x>startx)
//			return false;
//		return true;
//	}
//	public boolean isoutxr(){
//		if(X+0.5*x>startx)
//			return false;
//		return true;
//	}
//	public void run(){
//		
//		while(true){
//			if(!isoutxl()&&flag==0){
//				x = startx -speed;
//			}
//			
//			
//		}
//	}
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//}
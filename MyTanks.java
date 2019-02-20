import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTanks {
	public static void main(String[]args) {
		MyFrame dd = new MyFrame();
	}
}

@SuppressWarnings("serial")
class MyFrame extends JFrame{
	
	MyPanel panel = null ;
	public MyFrame(){
		panel = new MyPanel();
		this.setTitle("Tank War!");
		this.setSize(300, 400);
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class Tanks{
	
	//横坐标
	public int x = 0 ;
	//坦克的纵坐标
	public int y =0 ;
	public Tanks(int x,int y){
		this.x =x ;
		this.y =y ;
	}
	
	public int getX() {
		return this.x ;
	}
	public void setX(int x) {
		this.x = x ;
	}
	public int getY() {
		return this.y ;
	}
	public void setY(int y) {
		this.y = y ;
	}
	
	
}
class Hero extends Tanks{
	
	//继承父类
	public Hero(int x, int y) {
		super(x,y);
	}
}

@SuppressWarnings("serial")
class MyPanel extends JPanel{
	
	//重写paint 函数
	int dir ;
	Hero hero = null;
	public MyPanel() {
		hero= new Hero(10,10);
	}
	
	public void paint(Graphics g) {
		//初始化坦克
		super.paint(g);
		g.fillRect(0,0,400,300);
//		画出我的坦克
		this.drawTank(hero.getX(),hero.getY(), g, 0, 0);
	}
	
	//画出坦克的函数
	public void drawTank(int x,int y,Graphics g,int dir,int type) {
		//判断坦克类型
		switch(type){
			case 0:
				g.setColor(Color.cyan);
				break;
			case 1:
				g.setColor(Color.yellow);
				break;
		}
		//判断坦克方向
		switch(dir) {
		case 0:
			g.fill3DRect(x,y, 5,30, false);
			g.fill3DRect(x+15,y,5,30,false);
			g.fill3DRect(x+5,y+5,10,20,false);
			g.setColor(Color.BLACK);
			g.fillOval(x+4, y+7, 10, 10);
			g.setColor(Color.RED);
			g.fill3DRect(x+9,y,2, 12, false);
			break;
		case 1:
			g.fill3DRect(x,y, 30,5, false);
			g.fill3DRect(x+15,y,30,5,false);
			g.fill3DRect(x+5,y+5,10,20,false);
			g.setColor(Color.BLACK);
			g.fillOval(x+4, y+7, 10, 10);
			g.setColor(Color.RED);
			g.fill3DRect(x+9,y,2, 12, false);
		}
	}
}
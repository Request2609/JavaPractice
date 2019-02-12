import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mouse {
	public static void main(String[]args) {
		MyFrame mf = new MyFrame();
	}
}

//让mypanel 知道鼠标点击的位置
//让Mypanel 知道那个健按下
class MyFrame extends JFrame{
	
	MyPanel mp =null;
	public MyFrame(){
		this.setSize(300,300);
		this.setTitle("KeyListener");
		mp = new MyPanel();
		this.add(mp);
		this.addMouseListener(mp);
		this.addMouseMotionListener(mp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class MyPanel extends JPanel implements WindowListener,KeyListener,MouseListener,MouseMotionListener{

	@Override
	//鼠标被点击
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("go in");
		System.out.println(e.getX()+"    "+e.getY());
	}
	//鼠标移动到panel了
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//鼠标松开
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("go out");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	//鼠标拖拽方法
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getX()+"    "+e.getY());
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX()+"    "+e.getY());
		// TODO Auto-generated method stub
		
	}
	@Override
	//窗口打开
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	//窗口正在关闭
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	//窗口关闭
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	//窗口重新打开
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	//窗口最小化
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口最小化");
	}
}

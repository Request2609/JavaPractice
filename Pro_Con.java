package JavaPractice;

//生产者和消费者模型
//wait等待

public class Pro_Con{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie() ;
		
		Player p = new Player(m);
		Watcher w = new Watcher(m);
		
		new Thread(p).start() ;
		new Thread(w).start() ;
	
	}
}

class Movie{
	private String pic ;
	//生产者生产,消费者等待
	private boolean flag = true ;
	
	public synchronized void play(String pic) {
		
		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pic = pic ;
		System.out.println("生产了"+"  "+pic) ;
		this.notify();
		this.flag = false ;
	}
	
	public synchronized void watch() {
		if(flag) {
			try {
				this.wait() ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("消费了"+ "  " +pic) ;
		this.notifyAll();
		this.flag = true ;
	}
}

class Watcher implements Runnable{
	
	private Movie m ;
	public Watcher(Movie m) {
		super() ;
		this.m = m ;
	}
	
	public void run() {
		for(int i=0;i<20;i++) {
			m.watch() ;
		}
	}
}

class Player implements Runnable{
	
	private Movie m ;

	public Player(Movie m) {
		super() ;
		this.m = m ;
	}
	
	public void run() {
		
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				m.play("0");
			}
			else {
				m.play("1");
			}
		}
	}
}
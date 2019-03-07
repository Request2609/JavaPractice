
public class Mysql {
	
	public static void main(String args)  {
		Study s = new Study() ;
		
		//使用匿名对象
		new Thread(s).start() ;
		Thread t = new Thread(s) ;
		s.start();
		for(int i=0 ;i<100 ;i++) {
			//外部干涉
			if(i == 50) {
				s.stop() ;
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i+"...threads stop...");
		}
	}
}

class Study extends Thread implements Runnable{
	
	public boolean flag = true ; 
	
	public void run() {
		
		while(flag) {
			System.out.println("hello!") ;
		}
	}
	public void stop() {
		flag = false ;
	}
}

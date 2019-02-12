
public class Thread3 {
	public static void main(String[]args){
		
		Bird bb = new Bird(10);
		Thread t1 = new Thread(bb);
		Pig pp = new Pig();
		Thread t2= new Thread(pp);
		t1.start();
		t2.start();
	}
}

class Pig implements Runnable{
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello world!");
	
		}
	}
}
class Bird implements Runnable{
	
	int n;
	int times=0;
	int res =0;
	public Bird(int n) {
		this.n = n;
	}
	public void run() {
		while(true) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res+=(times++);
		System.out.println("current times"+times);
		if(times == n) {
			System.out.println("Current No"+times+"->"+res);
			break;
		}
		}
	}
}

//由于java不能实现多继承，所以通过实现runable接口重写run函数
public class Thread2 {
	public static void main(String[]args){
		Dog dd=new Dog();
		Thread t = new Thread(dd);
		t.start();		
	}
}

class Dog implements Runnable{
	
	public void run() {
		
		while(true) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello world!");
	}
	}
}
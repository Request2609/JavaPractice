
public class Thread1 {
	public static void main(String[]args) {
		
		Cat cat = new Cat();
		//导致run函数的运行
		cat.start();
	}
}
//类通过继承重写run函数使用线程。通过jvm跑线程
class Cat extends Thread{
	
	public Cat() {
	}
	public void run() {
		while(true) {
			//每隔一秒打印一次,让线程进入阻塞状态，并释放资源
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello world~~");
		}
	}
}

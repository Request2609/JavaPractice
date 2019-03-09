package JavaPractice;
import java.util.*;
public class Timer {
	
	public static void main(String[]args) {
		Timer timer = new Timer() ;
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("so easy!");
			}
		},new Date(System.currentTimeMillis()+1000),100);
	}

}

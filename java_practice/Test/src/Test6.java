import java.util.Scanner;

public class Test6{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long a ;
		a = in.nextLong();
		System.out.println(convertMillis(a));
	}
	public static String convertMillis(long millis) {
		
		long seconds=0 ,minutes=0,hours=0;
		seconds = millis/1000;
		if(seconds>60) {
			minutes = seconds/60;
			seconds = seconds-minutes*60;
			if(minutes>60) {
				hours = minutes/60;
				minutes = minutes-hours*60;
			}
		}
		return hours+":"+minutes+":"+hours;
	}
}
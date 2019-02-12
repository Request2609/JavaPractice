import java.text.DecimalFormat;
import java.util.Scanner;

public class Test3 {
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in); 
		double speed,fa;
//		DecimalFormat s =new DecimalFormat(".#####");
		fa = input.nextDouble();
		speed = input.nextDouble();
		double win = 35.74+0.6215*fa-35.75*Math.pow(speed, 0.16)+0.4275*fa*Math.pow(speed, 0.16);
		System.out.printf("The wind chill index is %.5f\n",win);
	}
}

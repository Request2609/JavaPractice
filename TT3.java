import java.util.Scanner;

public class TT3 {
	public static void main(String[]args) {
		Scanner in  = new Scanner(System.in);
		double x1,y1;
		double x2,y2;
		double x3,y3;
		double x4,y4;
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		x3 = in.nextDouble();
		y3 = in.nextDouble();
		x4 = in.nextDouble();
		y4 = in.nextDouble();
		if(x3!=x4&&x2!=x1&&(y3-y4)*1.0/(x3-x4)==(y2-y1)*1.0/(x2-x1)) {
			System.out.println("The two lines are parallel");
		}
			

	}
}

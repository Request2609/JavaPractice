import java.util.Scanner;

public class Trangle {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
		double x1,x2,x3,y1,y2,y3;
		x1 =input.nextDouble();
		y1=input.nextDouble();
		x2=input.nextDouble();
		y2=input.nextDouble();
		x3=input.nextDouble();
		y3=input.nextDouble();
		double s;
		double side1,side2,side3;
		side1 = getLenth(x1,x2,y1,y2);
		side2 = getLenth(x1,x3,y1,y3);
		side3 = getLenth(x3,x2,y3,y2);
		s = (side1+side2+side3)*1.0/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.printf("The area of the triangle is %.2f.",area);
	}
	public static double getLenth(double x1,double x2,double y1,double y2) {
			
		double s ;
		s = Math.pow(x1-x2, 2)+Math.pow(y1-y2,2);		
		return Math.sqrt(s);
	}
}



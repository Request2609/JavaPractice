import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner input  = new Scanner(System.in);
		String str ;
		str =input.next();
		int i =0 ;
		int sum =0 ;
		for(i=0;i<9;i++) {
			int a = str.charAt(i)-48;
			sum+= a*(i+1);
		}
		
		int s = sum%11;
		if(s==10) {
			System.out.println("The ISBN-10 number is "+str+"X");
		}
		else {
			System.out.println("The ISBN-10 number is "+str+s);
		}
	}
}

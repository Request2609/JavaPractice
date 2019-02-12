import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int i =0 ;
		int count =0 ;
		for(i=0;i<str.length();i++) {
			if((str.charAt(i)<='z'&&str.charAt(i)>='a')||(str.charAt(i)<='Z'&&str.charAt(i)>='A')) {
				count++;
			}
		}
		System.out.println("The number of letters inside the string is: "+count);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str =input.next();
		int flag =0 ;
		for(int i =0 ; i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag =1 ;
				break;
			}
		}
		
		if(flag ==1) {
			System.out.println(str+" is NOT a palindrome.");
		}
		else {
			System.out.println(str+" is a palindrome.");
		}
	}
}

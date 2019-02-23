import java.util.Scanner;

public class PaiLie {
	
	public static void swap(int i, int j, char[]c) {
		char temp = c[i] ;
		c[i] = c[j] ;
		c[j] = temp ;
	}
	
	public static void f(int k, char[]c) {
		
		if(k == c.length) {	
			System.out.println(c) ;
			return ;
		}
		
		for(int i = k; i < c.length ;i++) {
			
			//不和与自身相同元素进行交换
			if((i != k && c[i]==c[k]) ) continue ;
			swap(i , k , c) ;
			f(k+1 , c) ;
			swap(i,k,c) ;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		f(0 , in.nextLine().toCharArray()) ;
	}
}

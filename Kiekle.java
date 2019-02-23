import java.util.Arrays;

public class Kiekle {
	
	public static int Check(int []a, int []b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int j = 0 ;
		
		for(int i=0 ;i< a.length ;i++) {

			if(b[j] <= a[i] && j < b.length) {
				j++ ;
			}
		}
		return j ;
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {1,3,2,4};
		int b[] = {2,3,1,1} ;
		System.out.println(Check(a,b));
	}
}

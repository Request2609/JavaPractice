import java.util.Scanner;

public class DPTest2 {
	
	static Scanner in = new Scanner(System.in);
	public static int Solution(int m,int n) {
		
		int[][] a = new int[1000][1000] ;
		a[0][0]=0 ;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0) {
					a[i][j] = 1 ;
				}
				else {
						a[i][j]+=a[i-1][j]+a[i][j-1];
					}
				}
			}
		return a[m-1][n-1] ;
	}
	
	public static void main(String[] args) {
		System.out.println(Solution(7,3));
	}
}

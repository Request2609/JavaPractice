
public class Test003 {
	
	static int count = 0 ;
	public static void swap(int i, int j, int[]c) {
		int temp = c[i] ;
		c[i] = c[j] ;
		c[j] = temp ;
	}
	
	public static void print(int []a) {
		
		int l=1 ;
		for(int i =0 ;i<a.length ;i++) {
			
			for(int j=0;j<l;j++) {
				System.out.print(a[i]+"  ");
			}
			l++ ;
		}
	}
	public static void f(int k ,int a[]) {
		
		if(k == a.length) {
			if(a[0]>=a[1])return ;
			if(a[0]>=a[2])return ;
			if(a[1]>=a[3])return ;
			if(a[1]>=a[4])return ;
			if(a[2]>=a[4])return ;
			if(a[2]>=a[5])return ;
			if(a[3]>=a[6])return ;
			if(a[3]>=a[7])return ;
			if(a[4]>=a[7])return ;
			if(a[4]>=a[8])return ;
			if(a[5]>=a[8])return ;
			if(a[5]>=a[9])return ;
//			print(a);
			count++ ;
		}
		for(int i =0 ;i < a.length ;i++) {
			swap(i,k,a);
			f(k+1,a) ;
			swap(i,k,a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0,new int[] {0,1,2,3,4,5,6,7,8,9});
		System.out.println(count);
	}
}

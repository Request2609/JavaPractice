
public class Main {
	
	public static void main(String[] args) {
		long i =0 ;
		long a[]= new long[100];
		a[0]=2;
		int index=1;
		int j =0;
		for(i=3;;i++) {
			int flag =0;
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag =1;
					break;
				}
			}
			if(flag==0&&isReNum(i)) {
				a[index]=i;
				index++;
			}
			if(index==100)break;
		}
		for(j=0;j<100;j++) {
			System.out.printf("%d ",a[j]);
			if((j+1)%10==0) {
				System.out.println();
			}
		}
	}
	public static boolean isReNum(long i) {
		String a=i+"";
		int flag =0;
		for(int k =0;k<a.length();k++) {
			if(a.charAt(k)!=a.charAt(a.length()-1-k)) {
				flag =1;
				break;
			}
		}
		if(flag ==1) {
			return false;
		}
		else {
			return true;
		}
	}
}

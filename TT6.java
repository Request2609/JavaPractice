import java.util.Scanner;

public class TT6 {
	public static void main(String[]args) {
		
		int a[][]=new int[100][100];
		Scanner in = new Scanner(System.in);
		int i,j;
		int row,column;
		row = in.nextInt();
		column =in.nextInt();
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				a[i][j]=in.nextInt();
			}
		}
	
		int sumr[]=new int[100];
		int sumc[]=new int[100];
		int k=0,l=0;
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				sumr[k]+=a[i][j];
				sumc[l]+=a[j][i];
			}
			k++;
			l++;
		}
		sort(sumr);
		int min =sumr[0];
		System.out.printf("Highest row: [0，");
		for(i =1;i<sumr.length;i++) {
			if(min==sumr[i]) {
				System.out.printf("%d，",i);
			}
			else {
				System.out.printf("]");
			}
		}
		sort(sumc);
		 min =sumc[0];
			System.out.printf("Highest row: [0，");
			for(i =1;i<sumc.length;i++) {
				if(min==sumc[i]) {
					System.out.printf("%d，",i);
				}
				else {
					System.out.printf("]");
				}
			}
	}
	public static void sort(int a[]) {
		int i =0 ,j=0;
		int tmp;
		for(i=0;i<a.length;i++) {
			int flag=1;
			for(j=1;j<=a.length-i-1;j++) {
				if(a[j]<a[j-1]) {
					flag=0;
					tmp = a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
				}
			}
			if(flag==1) {
				break;
			}
		}
	}
}

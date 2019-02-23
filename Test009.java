import java.util.HashSet;
import java.util.Set;
/*
 * A A 2 2 3 3 4 4 一共4种扑克牌,请把他们排成一行
 * 在两个A中间有一张扑克,量个2中间有两张,3中间有3张,4中间有4张
 * 
 * 
 * **/
public class Test009 {
	
	static char[]a = new char[] {'A','A','2','2','3','3','4','4'}; 
	
	static Set<String>set = new HashSet<String>();
	public static void swap(int i,int j,char []a) {
		char temp = a[i] ;
		a[i] = a[j] ;
		a[j] = temp ;
	}
	
	public static void f(int k , char[] a) {
		
		if(k==a.length) {
			String s = new String(a) ;
			if(s.lastIndexOf('A')- s.indexOf('A') != 2)return ;
			if(s.lastIndexOf('2')- s.indexOf('2') != 3)return ;
			if(s.lastIndexOf('3')- s.indexOf('3') != 4)return ;
			if(s.lastIndexOf('4')- s.indexOf('4') != 5)return ;
			set.add(s) ;
			return ;
		}
		for(int i= k ;i<a.length ;i++) {
			if(i!=k&&a[i]==a[k])continue ;
			swap(i,k,a);
			f(k+1,a) ;
			swap(i,k,a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0,a);
		for(String s : set) {
			System.out.println(s);
		}
	}
}

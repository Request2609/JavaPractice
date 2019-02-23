
//找零钱  最小为5元,5,10,15

public class Test0007 {
	
	public static boolean Can(int[]a) {
		
		int five = 0 , ten= 0 ;
		for(int s : a) {
			if( s == 5 ) {
				five ++ ;
			}
			else if( s == 10 ) {
				if( five != 0 ) {
					five -- ;
				}
				else {
					return false ;
				}
				ten ++ ;
			}
			else {
				
				int t = 15 ;
				if( ten != 0 ) {
					t -= 10 ;
					ten -- ;
				}
				while(five != 0 && t != 0) {
					t-=5 ;
					five -- ;
				}
				if( t!=0 )return false ;
			}
		}
		return true ;
	}
	public static void main(String[] args) {
		int a[] = {5,10,10};
		System.out.println(Can(a));
	}
}

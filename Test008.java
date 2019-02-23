
/*
 * 给定一个非负整数数组，你最初位于数组的第一个位置。

数组中的每个元素代表你在该位置可以跳跃的最大长度。

判断你是否能够到达最后一个位置。

示例 1:

输入: [2,3,1,1,4]
输出: true
解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。

示例 2:

输入: [3,2,1,0,4]
输出: false
解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 * 
 * */
//超级跳跃
//[2,3,1,1,4]
public class Test008 {
	
	//超级跳跃2   计算调到终点的最小次数
	public static int CanOut1(int []a) {
		if(a.length == 1) return 0 ;
		int l = 0 ,r = 0 ,step =0;
	
		while( l<=r ) {
			
			int max_r = 0 ;
			for(int i = l;i <= r;i++) { 
				max_r = Math.max(max_r, i+a[i]);
			}
			l = r+1 ;
			r = max_r ;
			step++ ;
			if(r >= a.length-1)break ;
		}
		return step ;
	}
	
	//计算是否能跳到终点
	public static boolean CanOut(int [] a) {

		int maxs = 0 ;
		for(int i = 0 ; (i<a.length) && (i <= maxs) ;i++) {
			maxs = Math.max(maxs,a[i]+i) ;			
		}
		
		return maxs>=a.length-1 ;
	}
	
	public static void main(String[] args) {
		
		int a[] = {2,1,1,1,4};
		System.out.println(CanOut1(a));
	}
}

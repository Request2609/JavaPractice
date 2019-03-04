
public class DPTest4 {
	//物品体积/
	static int w[] = {0,2,1,3,2} ;
	//物品价值
	static int v[] = {0,3,2,4,2} ;
	//背包容量
	static int W = 5 ;
	//物品个数
	static int n = 4 ;
	//f[i][j]表示放入第i个物品背包容量为j时背包中的物品的价值
	static int f[][] = new int[10][10];
	
	public int value(int n) {
		
		if(W == 0)return 0 ;
		for(int i = 1 ;i<=n;i++) {
			//???????????容量递增????
			for(int k=0;k<=W;k++) {
				if(k<w[i]) {
					f[i][k] = f[i-1][k];
				}
				else {
					f[i][k] = Math.max(f[i-1][k-w[i]]+v[i] , f[i-1][k]);
				}
			}
		}
		return f[n][W] ;
	}
	public static void main(String[] args) {
		
	}
}

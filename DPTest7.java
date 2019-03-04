
class Solution{
        public int minPathSum(int[][] grid) {
        	if(grid[0].length ==0) {
        		return 0 ;
        	}
        	
        	int m = grid.length;
        	int n = grid[0].length ;
        	int a[][] = new int[m][n];
        	
        	for(int i=0;i<m;i++) {
        		for(int j=0;j<n;j++) {
        			if(i==0&&j==0) {
        				a[0][0] = grid[0][0];
        			}
        			else {
        				if(i==0) {
        					a[i][j] = a[i][j-1]+grid[i][j] ;
        				}
        				else if(j==0) {
        					a[i][j] = a[i-1][j]+grid[i][j];
        				}
        				else {
        					a[i][j] = Math.min(a[i-1][j], a[i][j-1])+grid[i][j];
        				}
        			}
        			System.out.print(a[i][j]+"->");
        		}
        		System.out.println();
        	}
        	return a[m-1][n-1];
        }
}
public class DPTest7 {
	
	public static void main(String []args) {
		int a[][] = {
				{1,3,1},{1,5,1},{4,2,1}
		};
		Solution s = new Solution();
		s.minPathSum(a);
	}
}

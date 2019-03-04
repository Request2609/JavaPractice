

import java.util.Scanner;

class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length ;
		int n = obstacleGrid[0].length ;
        int[][] a= new int[m][n] ;
	
		for(int i=0;i<m;i++) {
			   if(obstacleGrid[i][0] ==1)break ;
			   a[i][0] = 1 ;
		   }
		   for(int j = 0;j<n ;j++) {
			   if(obstacleGrid[0][j] ==1)break ;
			   a[0][j] = 1 ;
		   }

		   for(int i=1;i<m;i++) {
			 	for(int j=1;j<n;j++) {
			 		if(obstacleGrid[i][j]==0)
			 			a[i][j] =a[i-1][j]+a[i][j-1];
			   }
		   }
		   return a[m-1][n-1];
    }
}
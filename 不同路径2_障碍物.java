package com.leetcode;

public class 不同路径2_障碍物 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid.length < 2)
			return 1;
		
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		
		if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1)
			return 0;
		
		int[][] dp = new int[m][n];
		dp[0][0] = 1;
		
		for (int i = 1; i < m; i++) {
			if(obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 1)
				obstacleGrid[i][0] = 1;
		}
		for (int j = 1; j < n; j++) {
			if(obstacleGrid[0][j] == 0 && obstacleGrid[0][j-1] == 1)
				obstacleGrid[0][j] = 1;
		}
	
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(obstacleGrid[i][j] == 1)
					continue;
				if(i > 0) {
					dp[i][j] += dp[i-1][j];
				}
				if(j > 0)
					dp[i][j] += dp[i][j-1];
			}
		}
		
		return dp[m-1][n-1];
		
	}
	
	public int uniquePathsWithObstacles_2(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		
		if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1)
			return 0;
		
		int[][] dp = new int[m][n];
		dp[0][0] = 1;
		obstacleGrid[0][0] = 1;
		
		for (int i = 1; i < m; i++) {
			if(obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 1)
				obstacleGrid[i][0] = 1;
			else 
				obstacleGrid[i][0] = 0;
		}
		for (int j = 1; j < n; j++) {
			if(obstacleGrid[0][j] == 0 && obstacleGrid[0][j-1] == 1)
				obstacleGrid[0][j] = 1;
			else 
				obstacleGrid[0][j] = 0;
		}
	
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if(obstacleGrid[i][j] == 0)
					obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
				else
					obstacleGrid[i][j] = 0;
			}
		}
		
		return obstacleGrid[m-1][n-1];
		
	}

}

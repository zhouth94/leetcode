package com.leetcode;

public class 第六十二题不同路径 {
	public static int uniquePaths(int m,int n) {
		//m行n列，右下角的坐标(m-1,n-1)
		//dp[i][j]表示走到(i,j)这个格子的不同路径的总和
		int[][] dp = new int[m][n];
		
		//初始化
		dp[0][0] = 1;
		for (int i = 1; i < m; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < n; i++) {
			dp[0][i] = 1;
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		
		return dp[m-1][n-1];
	}
	
	public static void main(String[] args) {
		int res = 第六十二题不同路径.uniquePaths(7, 3);
		System.out.println(res);
	}

}

package com.leetcode;

public class 编辑距离 {
	public int minDistance(String word1,String word2) {
		int m = word1.length();
		int n = word2.length();
		
		int[][] dp = new int[m + 1][n + 1]; //表示word1的前m个字符与word2的前n个字符 最少操作数
		
		if(m == 0)
			return n;
		if(n == 0)
			return m;
		
		//i<=m
		for (int i = 0; i <= m; i++) {
			dp[i][0] = i;
		}
		//j<=n
		for (int j = 0; j <= n; j++) {
			dp[0][j] = j;
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if(word1.charAt(i-1) == word2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					dp[i][j] = Math.min(dp[i-1][j] + 1, Math.min(dp[i][j-1]+ 1, dp[i-1][j-1]+ 1));
				}
				
			}
		}
		
		return dp[m][n];
		
	}

}

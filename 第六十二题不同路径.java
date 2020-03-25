package com.leetcode;

public class ����ʮ���ⲻͬ·�� {
	public static int uniquePaths(int m,int n) {
		//m��n�У����½ǵ�����(m-1,n-1)
		//dp[i][j]��ʾ�ߵ�(i,j)������ӵĲ�ͬ·�����ܺ�
		int[][] dp = new int[m][n];
		
		//��ʼ��
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
		int res = ����ʮ���ⲻͬ·��.uniquePaths(7, 3);
		System.out.println(res);
	}

}

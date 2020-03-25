package com.leetcode;

public class ��¥�� {
	public static int climbStairs(int n) {
		if(n <= 1)
			return n;
		
		//dp[i]��ʾ ����i��̨���м��ֲ�ͬ�ķ��� 
		//0��̨��dp[0]��1��̨��...3��̨��dp[3]
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		int out = ��¥��.climbStairs(3);
		System.out.println(out);
	}
	

}

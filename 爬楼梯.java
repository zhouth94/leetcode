package com.leetcode;

public class 爬楼梯 {
	public static int climbStairs(int n) {
		if(n <= 1)
			return n;
		
		//dp[i]表示 爬到i级台阶有几种不同的方法 
		//0级台阶dp[0]、1级台阶...3级台阶dp[3]
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
		int out = 爬楼梯.climbStairs(3);
		System.out.println(out);
	}
	

}

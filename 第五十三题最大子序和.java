package com.leetcode;

public class 第五十三题最大子序和 {
	public int maxSubArray(int[] nums) {
		if(nums==null || nums.length==0)
			return -1;
		
		int n = nums.length;
		int[] dp = new int[n];
		
		dp[0] = nums[0]; //dp数组表示以此下标结尾的子序列和的最大值
		
		//初始化,以下标为0结尾的子序列和最大为dp[0]
		int out = dp[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
			out = Math.max(dp[i], out);
		}
		return out;
		
	}
	
	/**
	 * 动态规划的优化
	 * @param nums
	 * @return
	 */
	public int maxSubArray_2(int[] nums) {
		if(nums==null || nums.length==0)
			return -1;
		
		//由于dp数组只用到前一个计算结果的值，也就是dp[i-1]的值
		int dp = nums[0];
		int max = dp;
		
		for (int i = 1; i < nums.length; i++) {
			dp = Math.max(dp + nums[i], nums[i]);
			max = Math.max(max, dp);
		}
		return max;
	}

}

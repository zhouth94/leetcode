package com.leetcode;

public class ����ʮ������������ {
	public int maxSubArray(int[] nums) {
		if(nums==null || nums.length==0)
			return -1;
		
		int n = nums.length;
		int[] dp = new int[n];
		
		dp[0] = nums[0]; //dp�����ʾ�Դ��±��β�������к͵����ֵ
		
		//��ʼ��,���±�Ϊ0��β�������к����Ϊdp[0]
		int out = dp[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
			out = Math.max(dp[i], out);
		}
		return out;
		
	}
	
	/**
	 * ��̬�滮���Ż�
	 * @param nums
	 * @return
	 */
	public int maxSubArray_2(int[] nums) {
		if(nums==null || nums.length==0)
			return -1;
		
		//����dp����ֻ�õ�ǰһ����������ֵ��Ҳ����dp[i-1]��ֵ
		int dp = nums[0];
		int max = dp;
		
		for (int i = 1; i < nums.length; i++) {
			dp = Math.max(dp + nums[i], nums[i]);
			max = Math.max(max, dp);
		}
		return max;
	}

}

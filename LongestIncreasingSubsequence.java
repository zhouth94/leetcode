package com.leetcode;

public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		if(nums==null || nums.length<1)
			return 0;
		//[10,9,2,5,3,7,101,18]
		int len = nums.length;
		int[] f = new int[len]; //f[i]��ʾ��iΪ���������������LIS���ұ���ѡ��nums[i]
		f[0] = 1;
		
		for(int i = 0;i < len;i ++) {
			f[i] = 1;
			for(int j = 0;j < i;j ++) {
				if(nums[j] < nums[i]) {
					f[i] = Math.max(f[j]+1, f[i]);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < len; i++) {
			if(f[i] > max) max = f[i];
		}
		return max;
	}
}

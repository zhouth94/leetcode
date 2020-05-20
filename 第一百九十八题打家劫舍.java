package com.leetcode;

public class 第一百九十八题打家劫舍 {
	public int rob(int[] nums) {
		int len = nums.length;
		if(len == 0)
			return 0;
		if(len == 1)
			return nums[0];
		//f[i] = max(f[i-1], f[i-2]+nums[i])
		int[] f = new int[len+1]; //f[i]表示打劫前i家 获得的金额
		f[0] = 0;
		f[1] = nums[0];
		int max = 0;
		for (int i = 2; i <= len; i++) {
			
			f[i] = Math.max(f[i-1], f[i-2]+nums[i-1]);
			if(f[i] > max) {
				max = f[i];
			}
		}
		return max;
		
	}

}

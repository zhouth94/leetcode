package com.leetcode;

public class 第三百题最长上升子序列 {
	public int lengthOfLIS(int[] nums) {
		if(nums==null || nums.length<1)
			return 0;
		//f[i]:表示索引为i即以i结尾，且必须选中第i个元素nums[i]
		int len = nums.length;
		int[] f = new int[len]; //[10,9,2,5,3,7,101,18]
		f[1] = 1;
		
		for (int i = 0; i < len; i++) {
			f[i] = 1;
			for(int j = 0;j < i;j ++) {
				if(nums[j] < nums[i]) {
					f[i] = Math.max(f[i], f[j]+1);
				}
			}
		}
		int max = 0;
		for(int tmp : f) {
			if(f[tmp] > max) {
				max = f[tmp];
			}
		}
		return max;
	}

}

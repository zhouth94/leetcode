package com.leetcode;

public class ������������������� {
	public int lengthOfLIS(int[] nums) {
		if(nums==null || nums.length<1)
			return 0;
		//f[i]:��ʾ����Ϊi����i��β���ұ���ѡ�е�i��Ԫ��nums[i]
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

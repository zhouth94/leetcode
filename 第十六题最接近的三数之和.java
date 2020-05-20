package com.leetcode;

import java.util.Arrays;

public class 第十六题最接近的三数之和 {
	public int threeSumClosest(int[] nums,int target) {
		if(nums==null || nums.length<3)
			return Integer.MAX_VALUE;
		
		Arrays.sort(nums);
		
		int min = nums[0] + nums[1] + nums[2];
		//双指针
		for(int i = 0;i < nums.length;i ++) {
			int j = i+1;
			int k = nums.length - 1;
			
			while(j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int abs = Math.abs(sum - target);
				if(abs == 0) {
					return sum;
				}else {
					if(abs < Math.abs(min - target)) {
						min = sum;
					}else if(abs > Math.abs(min - target)) {
						
					}
					if(sum > target) {
						k --;
					}else if(sum < target) {
						j ++;
					}else {
						return min;
					}
				}
 			}
		}
		return min;
		
		
	}

}

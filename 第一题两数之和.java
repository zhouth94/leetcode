package com.leetcode;

public class 第一题两数之和 {
	public int[] twoSum(int[] nums,int target){
		int[] res = new int[2];
		
		if(nums.length ==0)
			return null;
		
		for(int i = 0;i < nums.length-1;i ++){
			int ask = target - nums[i];
			for(int j = i+1;j < nums.length;j ++){
				if(ask == nums[j]){
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return null;
	}

}

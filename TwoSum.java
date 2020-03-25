package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		if(nums==null || nums.length <= 1) 
			return new int[2];
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		// 3 2 7 5 -> 8
		for(int i = 0;i < nums.length;i ++) {
			int value = target - nums[i]; 
			if(!map.containsKey(value)) {
				map.put(nums[i], i);
			}else {
				return new int[]{map.get(value), i};
			}
		}
		return new int[2];
	}

}

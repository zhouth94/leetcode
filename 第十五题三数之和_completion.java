package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 第十五题三数之和 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		
		if(nums==null || nums.length<3)
			return res;
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0)
				break;
			
			if(i > 0 && nums[i] == nums[i-1]) continue;
			int j = i + 1;
			int k = nums.length - 1;
			
			while(j < k) {
				
				if(nums[i] + nums[j] + nums[k] < 0) {
					j ++;
				}else if(nums[i] + nums[j] + nums[k] == 0) {
					//等于0的情况中才需要去重
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					res.add(list);
					while(j<k && nums[j]==nums[j+1]) {
						j ++;
					}
					/*if(nums[j] == nums[j+1]) {
						j ++;
						continue;
					}
					if(nums[k] == nums[k-1]) {
						k --;
						continue;
					}*/
					while(j<k && nums[k]==nums[k-1]) {
						k --;
					}
					j ++;
					k --;
				}else {
					k --;
				}
			}
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		第十五题三数之和 d = new 第十五题三数之和();
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
		List<List<Integer>> out = d.threeSum(nums);
		System.out.println(out);
	}

}

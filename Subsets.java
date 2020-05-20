package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Subsets {
	List<List<Integer>> result = new LinkedList<List<Integer>>();
	
	public List<List<Integer>> subsets(int[] nums) {
		
		if(nums==null || nums.length < 1)
			return result;
		
		List<Integer> list = new LinkedList<>();
		result.add(list);
		
		helper(nums, 0, list);
		return result;
	}
	
	private void helper(int[] nums, int index, List<Integer> list) {
		if(index >= nums.length) {
//			result.add(new LinkedList<>(list));
			return;
		}
		
//		result.add(new ArrayList<Integer>());
		//·Å[1]
		list.add(nums[index]);
		result.add(new LinkedList<Integer>(list));
		helper(nums, index+1, list);
		//²»·Å[1]
		list.remove(list.size()-1);
		helper(nums, index+1, list);
		
	}
	
	public static void main(String[] args) {
		Subsets s = new Subsets();
		List<List<Integer>> out = s.subsets(new int[]{1,2,3});
		System.out.println(out.toString());
	}

}

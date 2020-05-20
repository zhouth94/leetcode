package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Permutations {
	List<List<Integer>> result = new LinkedList<List<Integer>>();
	public List<List<Integer>> permute(int[] nums) {
		if(nums==null || nums.length<1)
			return result;
		
		List<Integer> list = new LinkedList<>();
		boolean[] visited = new boolean[nums.length];
		
		helper(nums, list, visited);
		return result;
	}
	
	private void helper(int[] nums, List<Integer> list, boolean[] visited) {
		if(list.size() >= nums.length) {
			result.add(new LinkedList<>(list));
			return;
		}
		
		for(int i = 0;i < nums.length;i ++) {
			if(visited[i]) continue;
			
			list.add(nums[i]);
			visited[i] = true;
			helper(nums, list, visited);
			visited[i] = false;
			list.remove(list.size()-1);
		}
	}
	
	public static void main(String[] args) {
		Permutations p = new Permutations();
		List<List<Integer>> out = p.permute(new int[]{1,2,3});
		System.out.println(out);
	}

}

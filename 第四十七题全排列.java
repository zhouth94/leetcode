package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ����ʮ����ȫ���� {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		List<Integer> list = new LinkedList<>();
		boolean[] visited = new boolean[nums.length];
		
		Arrays.sort(nums);
		helper(nums, result, list, visited);
		return result;
	}

	private void helper(int[] nums, List<List<Integer>> result, List<Integer> list, boolean[] visited) {
		if(list.size() == nums.length) {
			result.add(new LinkedList<>(list));
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(visited[i]) continue;  
			
			if(i > 0 && !visited[i-1] && nums[i-1]==nums[i]) continue;
			
			list.add(nums[i]);
			visited[i] = true;
			helper(nums, result, list, visited);
			visited[i] = false; //�ָ��ֳ�
			list.remove(list.size()-1); //�ָ��ֳ�
		}
	}
	
	public static void main(String[] args) {
		����ʮ����ȫ���� d = new ����ʮ����ȫ����();
		List<List<Integer>> out = d.permuteUnique(new int[]{1,1,2});
		System.out.println(out);
	}
}

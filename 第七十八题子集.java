package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ����ʮ�����Ӽ� {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums==null || nums.length==0)
			return new ArrayList<List<Integer>>();
		
		result.add(new ArrayList<>()); //[[]]
		System.out.println(result); 
		
		for(int i = 0;i < nums.length;i ++) {
			int size = result.size();
//			System.out.println(size);
			for(int j = 0;j < size;j ++) {
				List<Integer> tmp = new ArrayList<>(result.get(j));
//				System.out.println(tmp.toString());
				tmp.add(nums[i]);
//				System.out.println(tmp);
				result.add(tmp);
//				System.out.println(result);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		����ʮ�����Ӽ� d = new ����ʮ�����Ӽ�();
//		List<List<Integer>> out = d.subsets(new int[]{1, 2, 3});
		
		List<Integer> tmp = new ArrayList<>(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		System.out.println(tmp);
	}

}

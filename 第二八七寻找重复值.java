package com.leetcode;

public class 第二八七寻找重复值 {
	public int findDuplicate(int[] nums) {
		int n = nums.length - 1;

        //找出这个重复的数。答案在1-n 之间

        //抽屉个数n个
        int l = 1, r = n;
        while(l < r) {
            int mid = l + r >> 1;

            int cnt = 0;
            for(int i : nums) {
            	System.out.println(i);
            }
        }
        return 0;
	}
	
	public static void main(String[] args) {
		第二八七寻找重复值 d = new 第二八七寻找重复值();
		d.findDuplicate(new int[]{1,3,4,2,2});
	}
}

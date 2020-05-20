package com.leetcode;

public class 第三百题最长上升子序列_二分查找 {
	int res = 0;
	public int lengthOfLIS(int[] nums) {
		if(nums==null || nums.length<1)
			return 0;
		//[10,9,2,5,3,7,101,18]
		int len = nums.length;
		int[] arr = new int[len];
		arr[0] = nums[0];
		for (int i = 1; i < len; i++) { //10,9,2,5,3,7,101,18
			if(nums[i] > arr[res]) {
				res ++;
				arr[res] = nums[i];
			}else {
				System.out.println("nums[" + i + "]:" + nums[i]);
					int index = helper(arr, nums[i]);
					System.out.println("index:" + index);
					arr[index] = nums[i];
					System.out.println("res:" + res);
				}
				
			}
		return res+1;
	}

	private int helper(int[] arr, int num) {
		int left = 0;
		int right = res;
		while(left < right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == num) continue;
			else if(arr[mid] > num) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		System.out.println("left:" + left);
		return left;
	}
	
	public static void main(String[] args) {
		第三百题最长上升子序列_二分查找 d = new 第三百题最长上升子序列_二分查找();
		int out = d.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
		System.out.println(out);
	}

}

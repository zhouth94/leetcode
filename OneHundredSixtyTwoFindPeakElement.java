package com.leetcode;

public class OneHundredSixtyTwoFindPeakElement {
	public int findPeakElement(int[] nums) {
		if(nums.length == 1)
			return 0;
		
		//只需要判断当前元素和笑一个元素
		for (int i = 0; i < nums.length - 1; i++) {
			if(nums[i] > nums[i+1]) {
				return i;
			}
		}
		return nums.length - 1;
	}
	
	/**
	 * 使用二分查找法 时间复杂度  O(logn)
	 * @param nums
	 * @return
	 */
	public int findPeakElement_2(int[] nums) {
		int len = nums.length;
		int out = findEle(nums, 0, len-1);
		return out;
	}

	private int findEle(int[] nums, int i, int j) {
		//
		if(i == j)
			return i;
		
		while(i < j) {
			int mid = i + (j - i)/2;
			if(nums[mid] > nums[mid+1]) { //说明峰值在左边，并且包含nums[mid]
				return findEle(nums, i, mid);
			}else {
				return findEle(nums, mid + 1, j); //说明峰值在右边，不包含nums[mid]
			}
		}
		return i;
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{5, 6, 9, 8, 7, 1};
		OneHundredSixtyTwoFindPeakElement o = new OneHundredSixtyTwoFindPeakElement();
		int out = o.findPeakElement_2(arr);
		System.out.println(out);
	}

}

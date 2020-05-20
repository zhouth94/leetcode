package com.leetcode;

public class ��һ������Ѱ�ҷ�ֵ {
	/**
	 * ��������
	 * @param nums
	 * @return
	 */
	public int findPeakElement(int[] nums) {
		if(nums.length == 0 || nums == null)
			return -1;
		int l = 0, r = nums.length - 1;
		while(l < r) {
			int mid = l + r >> 1;
			if(nums[mid] > nums[mid + 1]) {
				mid = r;
			}else
				l = mid + 1;
		}
		return l;
    }
}

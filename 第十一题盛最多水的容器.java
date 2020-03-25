package com.leetcode;

public class 第十一题盛最多水的容器 {
	//双指针法
	public int maxArea(int[] height) {
		if(height==null || height.length<2)
			return 0;
		
		int len = height.length;
		int max = 0;
		
		//定义左右两边的指针
		int left = 0;
		int right = len - 1;
		while(left < right) {
			int h = (height[left] > height[right])?height[right] : height[left];
			int area = h * (right - left);
			if(area > max) {
				max = area;
			}
			if(height[left] > height[right]) {
				right --;
			}else {
				left ++;
			}
		}
		return max;
	}

}

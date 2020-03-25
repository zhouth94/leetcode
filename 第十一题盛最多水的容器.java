package com.leetcode;

public class ��ʮһ��ʢ���ˮ������ {
	//˫ָ�뷨
	public int maxArea(int[] height) {
		if(height==null || height.length<2)
			return 0;
		
		int len = height.length;
		int max = 0;
		
		//�����������ߵ�ָ��
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

package com.leetcode;

public class 第十二题整数转罗马数字_贪心算法 {
	public String intToRoman(int num) {
		if(num < 1 || num > 3999) 
			return "";
		
		int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romanNun = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int len = romanNun.length;
		
		StringBuilder sb = new StringBuilder();
		
		//贪心，每次取数组中的一个与目标值差距最小的
//		int index = 0;
		/*while(index < len) {
			while(nums[index] <= num) {
				sb.append(romanNun[index]);
				num -= nums[index];
			}
			index ++;
		}*/
		
		for (int index = 0; index < len; index++) {
			while(nums[index] <= num) {
				sb.append(romanNun[index]);
				num -= nums[index];
			}
		}
		
		return sb.toString();
	}

}

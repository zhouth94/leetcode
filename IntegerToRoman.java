package com.leetcode;

public class IntegerToRoman {
	public String intToRoman(int num) {
		String[] one = {"", "I", "II", "III","IV", "V", "VI", "VII", "VIII", "IX"};
		String[] two = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] thr = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] fou = {"", "M", "MM", "MMM"};
		
		int q = num / 1000;
		int b = num % 1000 / 100;
		int s = num % 100 / 10;
		int g = num % 10;
		
		return fou[q] + thr[b] + two[s] + one[g];
	}

}

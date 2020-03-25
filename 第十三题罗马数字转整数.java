package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class 第十三题罗马数字转整数 {
	public static int romanToInt(String s) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int n = s.length();
		int pre = map.get(s.charAt(0));
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			int cur = map.get(s.charAt(i));
			if(cur > pre) {
				sum = sum - pre;
			}else {
				sum = sum + pre;
			}
			pre = cur;
			System.out.println("sum:" + sum);
		}
		sum += pre;
		return sum;
		
	}
	
	public static void main(String[] args) {
		int out = 第十三题罗马数字转整数.romanToInt("LVIII");
		System.out.println(out);
	}

}

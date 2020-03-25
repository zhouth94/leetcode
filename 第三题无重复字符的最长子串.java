package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class 第三题无重复字符的最长子串 {
	public  static int lengthOfLongestSubstring(String s){
		if(s == null  || s.equals(""))
			return 0;
		if(s.equals(" "))
			return 1;
		if(s.length() == 1)
			return 1;
		
		Set<Character> set = new HashSet<>();
		boolean flag = false;
		int max = 0;
		//"qrsvbspk"
		for (int i = 0; i < s.length(); i++) {
			System.out.println("i:" + i);
			for(int j = i;j < s.length();j ++){
				char ch = s.charAt(j);
				if(!set.contains(ch)){
					System.out.println("ch:" + ch);
					set.add(ch);
				}else{
					int size = set.size();
					if(size > max){
						max = size;
						System.out.println("max:" + max);
					}
					set.clear();
					break;
				}
			}
				
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int res = 第三题无重复字符的最长子串.lengthOfLongestSubstring("qrsvbspk");
		System.out.println(res);
	}

}

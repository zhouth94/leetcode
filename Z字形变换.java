package com.leetcode;

public class Z×ÖÐÎ±ä»» {
	public String convert(String s,int numRows){
		if(null==s || s.length()<=1 || numRows==1)
			return s;
		
		StringBuilder[] array = new StringBuilder[numRows];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = new StringBuilder();
		}
		
		int flag = 1;
		int index = 0;
		char[] chars = s.toCharArray();
		
		for(Character c : chars){
			array[index].append(c);
			index += flag;
			if(index==numRows-1 || index==0){
				flag = -flag;
			}
		}
		
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			res.append(array[i]);
		}
		return res.toString();
	}

}

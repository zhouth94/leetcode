package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {
	private StringBuilder sb = new StringBuilder();
	List<String> result = new ArrayList<>();
	
	public List<String> letterCombinations(String digits) {
		
		if(digits==null || digits.length()==0)
			return result;
		
		Map<Character,String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		dfs(map, digits, 0);
		
		return result;
	}

	private void dfs(Map<Character,String> map, String digits, int index) { //"23"
		if(index == digits.length()) {
			result.add(sb.toString());
			return;
		}
		
		char number = digits.charAt(index);
		String s = map.get(number);
		char[] charArray = s.toCharArray();
		for(char c : charArray) {
			sb.append(c);
			dfs(map, digits, index + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
		
	}
	
	public static void main(String[] args) {
		LetterCombinationsofaPhoneNumber l = new LetterCombinationsofaPhoneNumber();
		List<String> list = l.letterCombinations("23");
		System.out.println(list.toString());
	}

}

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 第十七题电话号码的字母组合_DFS { //递归
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		
		if(digits.length() == 0)
			return result;
		
		String[] letterStr = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		StringBuilder sb = new StringBuilder();
		dfs(digits, result, letterStr,  0, sb);
		
		return result;
	}

	private void dfs(String digits,List<String> result, String[] letterStr, int start, StringBuilder letter) {
		if(start >= digits.length()) {
			result.add(letter.toString());
			return ;
		}
		
		//第一次 start==0
		char ch = digits.charAt(start); //第一次获得digits的第一个字符数字
		int index = ch - '0'; //得到letterStr数组中的下标
		for(int i = 0;i < letterStr[index].length(); i ++) { 
			dfs(digits, result, letterStr, start + 1,letter.append(letterStr[index].charAt(i)));
			//["ad","ade","adef","adefbd","adefbde","adefbdef","adefbdefcd","adefbdefcde","adefbdefcdef"]
			letter.deleteCharAt(letter.length()-1);
		}
	}
	
	public static void main(String[] args) {
		第十七题电话号码的字母组合_DFS d = new 第十七题电话号码的字母组合_DFS();
		List<String> list = d.letterCombinations("23");
		System.out.println(list);
	}
	
}

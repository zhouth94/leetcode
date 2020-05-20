package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ��ʮ����绰�������ĸ���_DFS { //�ݹ�
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
		
		//��һ�� start==0
		char ch = digits.charAt(start); //��һ�λ��digits�ĵ�һ���ַ�����
		int index = ch - '0'; //�õ�letterStr�����е��±�
		for(int i = 0;i < letterStr[index].length(); i ++) { 
			dfs(digits, result, letterStr, start + 1,letter.append(letterStr[index].charAt(i)));
			//["ad","ade","adef","adefbd","adefbde","adefbdef","adefbdefcd","adefbdefcde","adefbdefcdef"]
			letter.deleteCharAt(letter.length()-1);
		}
	}
	
	public static void main(String[] args) {
		��ʮ����绰�������ĸ���_DFS d = new ��ʮ����绰�������ĸ���_DFS();
		List<String> list = d.letterCombinations("23");
		System.out.println(list);
	}
	
}

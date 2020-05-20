package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 第二十二题括号生成 {
	List<String> result = new ArrayList<>();		
	StringBuilder sb = new StringBuilder();
	String str = "";
	
	public List<String> generateParenthesis(int n) {
		if(n <= 0)
			return result;
		
		dfs(0, 0, n, sb);
		return result;
	}

	/*
	 * n表示括号的对数
	 * left表示左括号的个数
	 * */
	private void dfs(int left, int right, int n, StringBuilder sb) {
		if(left==n && right==n) {
			result.add(sb.toString());
			return;
		}
		if(left < n) { //可以在加左括号
			dfs(left + 1, right, n, sb.append("(") );
			sb.deleteCharAt(sb.length() - 1);
		}
		if(right < n && left > right) { //剪枝
			dfs(left, right + 1, n, sb.append(")") );
			sb.deleteCharAt(sb.length() - 1);
		}
	}
	
	public static void main(String[] args) {
		第二十二题括号生成 d = new 第二十二题括号生成();
		List<String> out = d.generateParenthesis(3);
		System.out.println(out);
	}

}

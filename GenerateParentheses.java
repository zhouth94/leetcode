package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		if(n < 1)
			return result;
		
		StringBuilder sb = new StringBuilder();
		helper(0, 0, n, sb, result);
		return result;
    }

	private void helper(int lCount, int rCount, int n, StringBuilder sb, List<String> result) {
		if(lCount == n && rCount == n) {
			result.add(sb.toString());
			return;
		}
		
//		sb.append("(");
		if(lCount < n) {
			helper(lCount+1, rCount, n, sb.append("("), result);
			sb.deleteCharAt(sb.length()-1);
		}
		if(rCount < n  && rCount < lCount) {
			helper(lCount, rCount+1, n, sb.append(")"), result);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	public static void main(String[] args) {
		GenerateParentheses g = new GenerateParentheses();
		List<String> out = g.generateParenthesis(3);
		System.out.println(out);
	}

}

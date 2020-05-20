package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class �ڶ�ʮ������������ {
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
	 * n��ʾ���ŵĶ���
	 * left��ʾ�����ŵĸ���
	 * */
	private void dfs(int left, int right, int n, StringBuilder sb) {
		if(left==n && right==n) {
			result.add(sb.toString());
			return;
		}
		if(left < n) { //�����ڼ�������
			dfs(left + 1, right, n, sb.append("(") );
			sb.deleteCharAt(sb.length() - 1);
		}
		if(right < n && left > right) { //��֦
			dfs(left, right + 1, n, sb.append(")") );
			sb.deleteCharAt(sb.length() - 1);
		}
	}
	
	public static void main(String[] args) {
		�ڶ�ʮ������������ d = new �ڶ�ʮ������������();
		List<String> out = d.generateParenthesis(3);
		System.out.println(out);
	}

}

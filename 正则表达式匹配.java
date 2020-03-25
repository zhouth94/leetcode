package com.leetcode;

public class ������ʽƥ�� {
	public boolean isMatch(String s,String p){
		if(p.length() == 0)
			return s.length()==0;
		
		boolean firstMatch = s.length() > 0 && (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.');
		
		//"emptiness".substring(9) returns "" (an empty string)
		if(p.length() >= 2 && p.charAt(1) == '*'){
			return isMatch(s, p.substring(2)) || (firstMatch&&isMatch(s.substring(1), p));
		}else{
			return firstMatch && isMatch(s.substring(1), p.substring(1));
		}
	}
	
	public static void main(String[] args) {
		������ʽƥ�� z = new ������ʽƥ��();
		boolean res = z.isMatch("", "c*");
		System.out.println(res);
	}

}

package com.leetcode;

/**
 * stror[i][j]��ʾ��i��jλ�õ��ַ����Ƿ��ǻ���s[i,j]
 * ����1��2������������ǣ���������ж�(s[i+1,j-1] && s[i]==s[j])
 * 
 * @author zhou
 *
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s){
		if(s==null || s.length()==0)
			return "";
		
		String max = "";
		for(int i = 0;i < s.length();i ++){
			for(int j = i;j < s.length();j ++){
				if(isPalindrome(s.substring(i, j+1)) && (s.substring(i, j+1).length() > max.length()) ){
					max = s.substring(i, j+1);
				}
			} 	
		}
		return max;
	}
	
	private boolean isPalindrome(String s){
		StringBuilder sb = new StringBuilder(s);
		if(s.equals(sb.reverse().toString())){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		String res = l.longestPalindrome("babad");
		System.out.println(res);
	}

}

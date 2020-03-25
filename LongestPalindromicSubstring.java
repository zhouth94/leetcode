package com.leetcode;

/**
 * stror[i][j]表示从i到j位置的字符串是否是回文s[i,j]
 * 长度1或2的情况单独考虑，其他情况判断(s[i+1,j-1] && s[i]==s[j])
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

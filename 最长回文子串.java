package com.leetcode;

public class 最长回文子串 {
	public String longestPalindrome(String s){
		int len = s.length();
		if(len < 2)
			return s;
		
		boolean[][] dp = new boolean[len][len];
		
		//初始化 单个字符一定是回文
		for (int i = 0; i < len; i++) {
			dp[i][i] = true;
		}
		
		int maxLen = 1;
		int index = 0;
		for (int j = 1; j < len; j++) {
			for (int i = 0; i < j; i++) {
				if(s.charAt(i) == s.charAt(j)){
					if(j - i < 3){
						dp[i][j] = true;
					}else{
						dp[i][j] = dp[i+1][j-1];
					}
				}else{
					dp[i][j] = false;
				}
				
				//记录回文的长度和起始位置
				if(dp[i][j]){
					int length = j - i + 1;
					if(length > maxLen){
						maxLen = length;
						index = i;
					}
				}
			}
			
		}
		
		return s.substring(index, index + maxLen);
		
	}

}

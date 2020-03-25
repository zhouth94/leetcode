package com.leetcode;

/**
 * ��̬�滮
 * @author zhou
 *
 */
public class ThirtySecondLongestVaildParentheses {
	public int longestVaildParentheses(String s){
		if(s==null || s.length() <= 1)
			return 0;
		
		int n = s.length();
		int max = 0;
		//dp[i]��ʾ�Ե�i���ַ���β���ַ��������Ч�����ִ��ĳ���(i >= 1)
		int[] dp = new int[n];
		
		/*for(int i = 1;i < n;i ++){
			if(s.charAt(i) == ')'){ //ֻ�������һ���ַ�Ϊ')'
				if(s.charAt(i-1) == '('){
					dp[i] = (i >= 2)?dp[i-2]+2 : 2;
				}else{ //s.charAt(i-1) == ')'
					if(i-dp[i-1]-1 >= 0 && s.charAt(i-dp[i-1]-1) == '('){ //
						dp[i] = dp[i-1] + ((i-dp[i-1]) >= 2?dp[i-dp[i-1]-2]+2 : 2);
					}
				}
			}
		}*/
		
		for(int i = 1;i < n;i ++){
			if(s.charAt(i) == ')'){
				if(s.charAt(i-1) == '('){
					dp[i] = (i-1 > 0)?dp[i-2]+2 : 2;
				}else{ //s.charAt(i-1) == ')'
					if(i-dp[i-1]-1 >= 0 && s.charAt(i-dp[i-1]-1) == '('){
						if(i-dp[i-1]-2 >= 0){
							dp[i] = dp[i-1] + dp[i-dp[i-1]-2] + 2; 
						}else{
							dp[i] = dp[i-1] + 2;
						}
					}
				}
			}
			max = Math.max(max, dp[i]);
		}
		return max;
		
	}

}

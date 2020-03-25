package com.leetcode;

public class 第四十四题通配符匹配 {
	public boolean isMatch(String s,String p) {
		if (p == null)
			return s == null;
		if (p.length() == 0)
			return s.length() == 0;
		
		int m = s.length();
		int n = p.length();
		
		boolean[][] dp = new boolean[m+1][n+1]; //表示s中前i个字符是否匹配p中前j个字符
		/*for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(dp[i][j]);
			}
		}*/
		//初始化
		dp[0][0] = true;
		for(int j = 1;j <= n;j ++) {
			if(p.charAt(j-1) == '*'){
				dp[0][j] = dp[0][j-1];
			}
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
					dp[i][j] = dp[i-1][j-1];
					/*p的第j个字符为'*'，也就是 p.charAt(j-1) == '*'
					所以，
					1.假设这个*匹配的是空
						判断dp[i][j] 也就等于判断 s中的前i的字符跟p中的前j-1个字符是否匹配的问题  dp[i][j-1]
					2.假设这个*匹配的是s中的字符，也就是非空
						判断dp[i][j] p的第j个字符为'*'肯定是跟s中的第i个字符匹配的。接下来也就要判断s中的前i-1个字符是否匹配p中的前j个字符的问题，
						也就是 dp[i-1][j]
					
					*/
				}else if (p.charAt(j-1) == '*') {
					dp[i][j] = dp[i][j-1] || dp[i-1][j];
				}
			}
		}
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		第四十四题通配符匹配 d = new 第四十四题通配符匹配();
		String s = "adceb";
		String p = "*a*b";
		boolean res = d.isMatch(s, p);
		System.out.println(res);
	}

}

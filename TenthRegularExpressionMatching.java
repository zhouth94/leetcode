package com.leetcode;

public class TenthRegularExpressionMatching {
	public boolean isMatch(String s,String p){
		if(p.length() == 0)
			return s.length()==0;
		if(p == null)
			return s == null;
		
		int m = s.length();
		int n = p.length();
		
		//��ά���������Ǵ�0��ʼ������+1
		boolean[][] dp = new boolean[m+1][n+1];
		
		//��ʼ��
		dp[0][0] = true;
		for(int j = 2;j <= n;j ++){ //����
			if(p.charAt(j-1) == '*'){//����
				dp[0][j] = dp[0][j-2];
			}
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				char cs = s.charAt(i-1);
				char cp = p.charAt(j-1);
				if(cs == cp || cp == '.') { //������*
					dp[i][j] = dp[i-1][j-1];
				}else if(cp == '*'){
					if(dp[i][j-2]){
						dp[i][j] = true;
					}
					else if(cs==p.charAt(j-2) || '.'==p.charAt(j-2)){ //s������һλ��*ƥ��һ�λ��߶��ǰ����ַ�
						dp[i][j] = dp[i-1][j];
					}else{//*������ƥ��ǰ����ַ�
						dp[i][j] = dp[i][j-2];
					}
				}
				
			}
		}
		
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		TenthRegularExpressionMatching t = new TenthRegularExpressionMatching();
		boolean res = t.isMatch("aaa", "ab*a*c*a");
		System.out.println(res);
	}

}














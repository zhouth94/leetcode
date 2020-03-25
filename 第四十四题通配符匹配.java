package com.leetcode;

public class ����ʮ����ͨ���ƥ�� {
	public boolean isMatch(String s,String p) {
		if (p == null)
			return s == null;
		if (p.length() == 0)
			return s.length() == 0;
		
		int m = s.length();
		int n = p.length();
		
		boolean[][] dp = new boolean[m+1][n+1]; //��ʾs��ǰi���ַ��Ƿ�ƥ��p��ǰj���ַ�
		/*for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(dp[i][j]);
			}
		}*/
		//��ʼ��
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
					/*p�ĵ�j���ַ�Ϊ'*'��Ҳ���� p.charAt(j-1) == '*'
					���ԣ�
					1.�������*ƥ����ǿ�
						�ж�dp[i][j] Ҳ�͵����ж� s�е�ǰi���ַ���p�е�ǰj-1���ַ��Ƿ�ƥ�������  dp[i][j-1]
					2.�������*ƥ�����s�е��ַ���Ҳ���Ƿǿ�
						�ж�dp[i][j] p�ĵ�j���ַ�Ϊ'*'�϶��Ǹ�s�еĵ�i���ַ�ƥ��ġ�������Ҳ��Ҫ�ж�s�е�ǰi-1���ַ��Ƿ�ƥ��p�е�ǰj���ַ������⣬
						Ҳ���� dp[i-1][j]
					
					*/
				}else if (p.charAt(j-1) == '*') {
					dp[i][j] = dp[i][j-1] || dp[i-1][j];
				}
			}
		}
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		����ʮ����ͨ���ƥ�� d = new ����ʮ����ͨ���ƥ��();
		String s = "adceb";
		String p = "*a*b";
		boolean res = d.isMatch(s, p);
		System.out.println(res);
	}

}

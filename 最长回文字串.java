package com.leetcode;

public class ������ִ� {
	/**
	 * ˼·���ַ���s��Ϊ������ż��
	 * ��s��ÿһ���ַ�Ϊ���ĵ㣬������������չ
	 * ���������ĵ�ֻ��һ���ַ�
	 * ż�������ĵ������ַ�
	 * ָ��j����k�������α���
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		String res = "";
		//1.����
		for(int i = 0;i < s.length();i ++) {
			int j,k;
			for(j = i,k = i;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j --,k ++) {
				if(res.length() < k-j+1)
					res = s.substring(j, k+1);
				System.out.println("res�棺" + res);
			}
			for(j = i,k = i+1;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j --,k ++) {
				if(res.length() < k-j+1)
					res = s.substring(j, k+1);
				System.out.println("resż��" + res);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		������ִ� z = new ������ִ�();
		String out = z.longestPalindrome("abb");
		System.out.println(out);
	}

}

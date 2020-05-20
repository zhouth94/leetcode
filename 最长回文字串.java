package com.leetcode;

public class 最长回文字串 {
	/**
	 * 思路：字符串s分为奇数和偶数
	 * 以s中每一个字符为中心点，向左右两边扩展
	 * 奇数：中心点只有一个字符
	 * 偶数：中心点两个字符
	 * 指针j往左，k往右依次遍历
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		String res = "";
		//1.奇数
		for(int i = 0;i < s.length();i ++) {
			int j,k;
			for(j = i,k = i;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j --,k ++) {
				if(res.length() < k-j+1)
					res = s.substring(j, k+1);
				System.out.println("res奇：" + res);
			}
			for(j = i,k = i+1;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j --,k ++) {
				if(res.length() < k-j+1)
					res = s.substring(j, k+1);
				System.out.println("res偶：" + res);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		最长回文字串 z = new 最长回文字串();
		String out = z.longestPalindrome("abb");
		System.out.println(out);
	}

}

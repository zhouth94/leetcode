package com.leetcode;

import java.util.Scanner;

public class 第九题回文数 {
	public static boolean isPalindrome(int x) {
		StringBuilder sb = new StringBuilder(String.valueOf(x));
		StringBuilder reverseStr = sb.reverse();
		
		boolean flag = true;
		int len = sb.length();
//		System.out.println(len);
		for (int i = 0; i <= (len - 1)/2; i++) {
			if (sb.charAt(i) != reverseStr.charAt(len-1-i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while (sin.hasNext()) {
			int num = sin.nextInt();
			boolean res = 第九题回文数.isPalindrome(num);
			System.out.println(res);
		}
	}

}

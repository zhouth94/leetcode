package com.leetcode;

import java.util.Scanner;

public class NinthPalindromeNumber {
	public static boolean isPalindrome(int x) {
		if(x == 0)
			return true;
		if(x < 0 || x % 10 == 0&&x != 0)
			return false;
		int xCopy = x;
		int res = 0;
		while(x != 0) {
			int n = res;
			n *= 10;
			int p = x % 10;
			/*if(p=='+' || p=='-') {
				return false;
			}*/
			n += p;
			if(n / 10 != res) {
				return false;
			}
			x /= 10;
			res = n;
		}
		Integer i1 = new Integer(res);
		Integer i2 = new Integer(x);
		return res == xCopy;
	}

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while (sin.hasNext()) {
			int num = sin.nextInt();
			boolean flag = NinthPalindromeNumber.isPalindrome(num);
			System.out.println(flag);
			
		}
	}
}

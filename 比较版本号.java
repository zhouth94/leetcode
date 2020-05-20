package com.leetcode;

public class 比较版本号 {
	/**
	 * 思路：比较数字分隔符之间数字的大小
	 * @param version1
	 * @param version2
	 * @return
	 */
	public int compareVersion(String s1, String s2) {
		int i = 0,j = 0;
		while(i < s1.length() || j < s2.length()) { //条件
			int x = i, y = j;
			while(x < s1.length() && s1.charAt(x)!='.') {
				x ++;
			}
			while(y < s2.length() && s2.charAt(y)!='.') {
				y ++;
			}
			//排除前导零
			int num1 = 0,num2 = 0;
			num1 = (i == x) ? 0:Integer.parseInt(s1.substring(i, x));
			System.out.println("num1: " + num1);
			num2 = (j == y) ? 0:Integer.parseInt(s2.substring(j, y));
			System.out.println("num2: " + num2);
			if(num1 > num2) return 1;
			if(num1 < num2) return -1;
			i = x + 1;
			j = y + 1;
		}
		return 0;
    }
	
	public static void main(String[] args) {
		比较版本号 b = new 比较版本号();
		int out = b.compareVersion("1.1", "1");
		System.out.println(out);
	}

}

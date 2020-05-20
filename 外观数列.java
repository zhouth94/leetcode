package com.leetcode;

public class 外观数列 {
	public String countAndSay(int n) {
		if(n == 1) return "1";
		//求出第n项 0~n-1，也就是下标为n-1的那项
        //s保存的是第n项的字符串
        //String s = "1"; //初始化，第一项为"1"
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n - 1;i ++) { 
            //对于每一项都有一个新对象
            String res = "";	
            for(int j = 0;j < sb.length();j ++) {
                int k = j;
                while(k < sb.length() && sb.charAt(j) == sb.charAt(k)) {
                        k ++;
                }
                res += sb.append(k - j).append(sb.charAt(j));
                j = k - 1;
            }
            sb = new StringBuilder(res);
        }
        return sb.toString();
	}
	
	public static void main(String[] args) {
		外观数列 w = new 外观数列();
		String out = w.countAndSay(2);
		System.out.println(out);
	}

}

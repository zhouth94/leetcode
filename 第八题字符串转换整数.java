package com.leetcode;

public class 第八题字符串转换整数 {
	public int myAtoi(String str){
		int begin = 0; //表示数字字符是否开始
		int negative = 0; //表示是否为负数
		
		int len = str.length();
		int index;
		int out = 0;
		
		for(index = 0;index < len;index ++) {
			System.out.println(str.charAt(index));
			System.out.println( Character.isDigit(str.charAt(index)) );
			if (begin == 0){
				if(str.charAt(index) == ' '){
					continue;
				}else if(str.charAt(index) == '-'){
					negative = 1; //标识负数
					begin = 1; //表示接下来要检查数字字符
					continue;
				}else if(str.charAt(index) == '+'){
					begin = 1;
					continue;
				}
			}
			if(Character.isDigit(str.charAt(index))){ //是数字字符
				/**
				 * public static boolean isDigit(char ch)确定指定字符是否为数字。 
				 */
				begin = 1;
				char c = str.charAt(index);
				// 判断溢出
				if (negative == 1){ // 负数
					if(out > Integer.MAX_VALUE/10 || (out == Integer.MAX_VALUE/10 && (c-'0' >= 8))){
						System.out.println(out);
						out = Integer.MIN_VALUE;
						break;
					}
				}else{
					if (out > Integer.MAX_VALUE/10 || (out == Integer.MAX_VALUE/10 && (c-'0' > 7))){
						out = Integer.MAX_VALUE;
						break;
					}
				}
				
				out = out * 10 + c - '0';
				continue;
			}else {
				break;
			}
		}
		
		if(negative == 1 && out != Integer.MIN_VALUE){
			out = -1 * out;
		}
		return out;
		
	}
	
	public static void main(String[] args) {
		第八题字符串转换整数 d = new 第八题字符串转换整数();
		int res = d.myAtoi("2147483648");
		System.out.println(res);
	}
}




















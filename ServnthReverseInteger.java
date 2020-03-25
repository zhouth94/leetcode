package com.leetcode;

public class ServnthReverseInteger {
	public int reverse(int x){
		int out = 0;
		int flag = 1;
		if(x < 0){
			flag = -1;
			x *= flag;
		}
		
		while(x > 0){
			int pop = x % 10; //若溢出，则 out * 10 > Integer.MAX_VALUE
			x /= 10;
			//判断是否溢出
			if(out > Integer.MAX_VALUE/10 || (out == Integer.MAX_VALUE /10 && pop > Integer.MAX_VALUE % 10)
					|| out < Integer.MIN_VALUE/10 || (out == Integer.MIN_VALUE/10 && pop < Integer.MIN_VALUE%10)){
				return 0;
			}
			out = out * 10 + pop;
		}
		
		return (flag > 0)?out : -1*out;
	}
	
	public int reverse_1(int x){
		int out = 0;
		
		while(x != 0){
			int pop = x % 10; //若溢出，则 out * 10 > Integer.MAX_VALUE
			x /= 10;
			//判断是否溢出
			if(out > Integer.MAX_VALUE/10 || (out == Integer.MAX_VALUE /10 && pop > Integer.MAX_VALUE % 10)
					|| out < Integer.MIN_VALUE/10 || (out == Integer.MIN_VALUE/10 && pop < -8)){
				return 0;
			}
			out = out * 10 + pop;
		}
		
		return out;
	}

}

package com.leetcode;

public class 第七题整数反转 {
	//假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]
	public int reverse(int x){
		if(x == Integer.MIN_VALUE)
			return 0;
		
		int flag = 1;
		if(x < 0)
			flag = -flag; //-1
			x = x * flag;
		
		int res = 0;
		while(x > 0){ // 输入:1534236469
			int n = res;
			n *= 10;
			n += x % 10;	
			x /= 10;
			if(n / 10 != res){ //这一步很关键，判断*10左移一位后是否溢出
				return 0;
			}
			res = n;
		}
		return (flag > 0)? res : res*flag;
	}

}

package com.leetcode;

public class �ڰ����ַ���ת������ {
	public int myAtoi(String str){
		int begin = 0; //��ʾ�����ַ��Ƿ�ʼ
		int negative = 0; //��ʾ�Ƿ�Ϊ����
		
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
					negative = 1; //��ʶ����
					begin = 1; //��ʾ������Ҫ��������ַ�
					continue;
				}else if(str.charAt(index) == '+'){
					begin = 1;
					continue;
				}
			}
			if(Character.isDigit(str.charAt(index))){ //�������ַ�
				/**
				 * public static boolean isDigit(char ch)ȷ��ָ���ַ��Ƿ�Ϊ���֡� 
				 */
				begin = 1;
				char c = str.charAt(index);
				// �ж����
				if (negative == 1){ // ����
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
		�ڰ����ַ���ת������ d = new �ڰ����ַ���ת������();
		int res = d.myAtoi("2147483648");
		System.out.println(res);
	}
}




















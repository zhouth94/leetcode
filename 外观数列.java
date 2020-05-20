package com.leetcode;

public class ������� {
	public String countAndSay(int n) {
		if(n == 1) return "1";
		//�����n�� 0~n-1��Ҳ�����±�Ϊn-1������
        //s������ǵ�n����ַ���
        //String s = "1"; //��ʼ������һ��Ϊ"1"
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n - 1;i ++) { 
            //����ÿһ���һ���¶���
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
		������� w = new �������();
		String out = w.countAndSay(2);
		System.out.println(out);
	}

}

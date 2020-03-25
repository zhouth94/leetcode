package com.leetcode;

public class ��ʮ����������ִ� {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
			return "";
		
		//�ַ�����ĳ���
		int len = strs.length;
		StringBuilder sb = new StringBuilder();
		String prefix = strs[0];
		
		for (int i = 1; i < len; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		String s1 = "flower";
		String s2 = "flight";
		
		int index = s1.indexOf(s2);
		System.out.println(index);
	}

}

package com.leetcode;

public class ��ת�ַ�����ĵ��� {
	/**
	 * ˫ָ�뷨��
	 * ������ָ����ַ�����ĩβ��ǰ����
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		if(s.length()==0 || " ".equals(s)) return "";
		StringBuilder sb = new StringBuilder();
		//1.ȥ��ǰ��ո�
		s = s.trim();
		int n = s.length();
		int i = n - 1,j = n - 1;
		while(i >= 0){
			//2.ָ��i������������
			while(i >= 0 && ' ' != s.charAt(i)){
				i --;
			}
			String word = s.substring(i+1, j+1);
			System.out.println("word: " + word) ;
			sb.append(word);
			if(i > 0){
				sb.append(" ");
			}
			//3.ָ��i�����굥��֮���������пո��ߵ�ǰһ�����ʵ�ĩβ
			while(i >= 0 && ' ' == s.charAt(i)) {
				i --;
			}
			//4.��ָ��j�ƶ���i��λ�ã�Ҳ����ǰһ�����ʵ�ĩβ
			j = i;
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		��ת�ַ�����ĵ��� f = new ��ת�ַ�����ĵ���();
		String out = f.reverseWords_2("a good   example");
		System.out.println(out);
	}
	
	/**
	 * "the sky is blue"
  ��һ����    "eht yks si eulb" ��ÿһ�����ʽ��з�ת
 �ڶ�����      "blue is sky the" ��ת�����ַ���
	 * @param s
	 * @return
	 */
	public String reverseWords_2(String s) {
		if(s.length()==0 || "".equals(s)) return s;
		s = s.trim();
		int n = s.length();
		StringBuilder res = new StringBuilder(); //������
		int i = 0, j = 0;
		while(i < n) {
			StringBuilder word = new StringBuilder();
			while(i < n && s.charAt(i)!=' ') {
				word.append(s.charAt(i));
				i ++;
				j ++;
			}
			word.reverse(); //��������ʷ�תһ��
			System.out.println(word);
			word.append(" ");
			res.append(word);
			while(i < n && s.charAt(i)==' ') {
				i ++;
				//j ++;
			}
		}
		System.out.println(res.toString());
		return res.reverse().toString().trim();
	}

}

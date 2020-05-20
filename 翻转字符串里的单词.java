package com.leetcode;

public class 翻转字符串里的单词 {
	/**
	 * 双指针法：
	 * 将两个指针从字符串的末尾往前搜索
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		if(s.length()==0 || " ".equals(s)) return "";
		StringBuilder sb = new StringBuilder();
		//1.去除前后空格
		s = s.trim();
		int n = s.length();
		int i = n - 1,j = n - 1;
		while(i >= 0){
			//2.指针i从右往左搜索
			while(i >= 0 && ' ' != s.charAt(i)){
				i --;
			}
			String word = s.substring(i+1, j+1);
			System.out.println("word: " + word) ;
			sb.append(word);
			if(i > 0){
				sb.append(" ");
			}
			//3.指针i搜索完单词之间多余的所有空格，走到前一个单词的末尾
			while(i >= 0 && ' ' == s.charAt(i)) {
				i --;
			}
			//4.将指针j移动到i的位置，也就是前一个单词的末尾
			j = i;
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		翻转字符串里的单词 f = new 翻转字符串里的单词();
		String out = f.reverseWords_2("a good   example");
		System.out.println(out);
	}
	
	/**
	 * "the sky is blue"
  第一步：    "eht yks si eulb" 让每一个单词进行反转
 第二步：      "blue is sky the" 反转整个字符串
	 * @param s
	 * @return
	 */
	public String reverseWords_2(String s) {
		if(s.length()==0 || "".equals(s)) return s;
		s = s.trim();
		int n = s.length();
		StringBuilder res = new StringBuilder(); //保存结果
		int i = 0, j = 0;
		while(i < n) {
			StringBuilder word = new StringBuilder();
			while(i < n && s.charAt(i)!=' ') {
				word.append(s.charAt(i));
				i ++;
				j ++;
			}
			word.reverse(); //将这个单词反转一遍
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

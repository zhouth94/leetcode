package com.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class 第二十题有效的括号 {
	public boolean isValid(String s) {
		HashMap<Character,Character> map = new HashMap<>();
		
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		
		char[] chars = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char c : chars) {
			if(map.containsKey(c)) {
				if(stack.isEmpty()) {
					return false;
				}else {
					if(stack.peek() == map.get(c)) {
						stack.pop();
					}else {
						return false;
					}
				}
			}else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
		
	}

}

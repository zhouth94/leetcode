package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ×ÖÄ¸ÒìÎ»´Ê·Ö×é {
	/**
	 * ½«×Ö·û´®°´ÕÕ×ÖµäË³ĞòÅÅĞò
	 * @param s
	 */
	private String stringSort(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return String.valueOf(chars);
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map = new HashMap<>();
		for(String s : strs) {
			String key = s; //±£´æ¸±±¾
			key = stringSort(key);
			if(map.containsKey(key)) {
				List<String> list = map.get(key);
				list.add(s);
			}else{
				map.put(key, new ArrayList<>());
				map.get(key).add(s);
			}
		}
		Collection<List<String>> values = map.values();
		return new ArrayList<>(values);
    }

}

package com.leetcode;

public class 第二七五H指数 {
	public int hIndex(int[] citations) {
		int l = 0, r = citations.length ; // -1??
		while(l < r) {
			int mid = l + r + 1 >> 1;
			if(citations[citations.length - mid] >= mid)
				l = mid;
			else 
				r = mid - 1;
		}
		return l;
	}
	
	public static void main(String[] args) {
		第二七五H指数 d = new 第二七五H指数();
		int out = d.hIndex(new int[]{0,1,3,5,6});
		System.out.println(out);
	}

}

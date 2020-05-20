package com.leetcode;

public class �ڶ�����Hָ�� {
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
		�ڶ�����Hָ�� d = new �ڶ�����Hָ��();
		int out = d.hIndex(new int[]{0,1,3,5,6});
		System.out.println(out);
	}

}

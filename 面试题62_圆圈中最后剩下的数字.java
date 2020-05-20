package com.leetcode;

import java.util.LinkedList;

public class ������62_ԲȦ�����ʣ�µ����� {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			this.val = x;
		}
	}
	
	public int lastRemaining(int n, int m) {
		if(n == 1) return 0;
		if(n < 1 || m < 1) return -1;
		
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0;i < n;i ++) {
			list.add(i);
		}
		
		int idx = 0;
		while(n > 1) {
			for(int i = 1;i < m;i ++) {
				idx = (idx + 1) % n;
			}
			list.remove(idx);
			n --;
		}
		return list.get(0);
    }
	
	public int lastRemaining_2(int n, int m) {
		return f(n, m); //ʣ�µ����һ����
	}
	private int f(int n, int m) {
		if(n == 1) return 0;
		//�ɱ�ţ�0 	1 	2 	... m-1   m m+1 ...  n-1
		//�±�ţ� -m -m+1 -m+2 ...-m+m-1 0  1  ... -m+n-1         
		int x= f(n-1, m);
		//�±�� + m
		return (x + m) % n;
	}

}

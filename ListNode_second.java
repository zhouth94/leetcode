package com.leetcode;

public class ListNode_second {
	int val;
	ListNode_second next;
	ListNode_second(int x) { val = x; }
	
	public static void print(ListNode_second head) {
		while(head != null) {
			System.out.print(head.val + " --");
			head = head.next;
		}
	}

}

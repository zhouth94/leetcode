package com.leetcode;

public class 第二十四题两两交换链表中的节点 {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode pre = dummy; 
		while(pre.next != null && pre.next.next != null) { //判断循环条件
			ListNode cur = pre.next;
			ListNode after = pre.next.next;
			pre.next = after; //1
			cur.next = after.next; //2
			after.next = cur; //3
			
			//pre指针往后移动两个，cur和after会跟随往后移动两位
			pre = pre.next.next;
		}
		return dummy.next;
	}
}

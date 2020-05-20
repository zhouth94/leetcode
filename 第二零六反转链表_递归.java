package com.leetcode;

public class 第二零六反转链表_递归 {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	/**
	 * 递归的思想：
	 * 1.找到子问题求解，
	 * 2.其他问题不考虑内在细节，
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
            return head;
		ListNode follow = head.next;
		ListNode newHead = reverseList(follow);
		follow.next = head;
		head.next = null;
		return newHead;
	}
}

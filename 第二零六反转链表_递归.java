package com.leetcode;

public class �ڶ�������ת����_�ݹ� {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	/**
	 * �ݹ��˼�룺
	 * 1.�ҵ���������⣬
	 * 2.�������ⲻ��������ϸ�ڣ�
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

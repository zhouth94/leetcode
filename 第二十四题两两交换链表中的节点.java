package com.leetcode;

public class �ڶ�ʮ�����������������еĽڵ� {
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
		while(pre.next != null && pre.next.next != null) { //�ж�ѭ������
			ListNode cur = pre.next;
			ListNode after = pre.next.next;
			pre.next = after; //1
			cur.next = after.next; //2
			after.next = cur; //3
			
			//preָ�������ƶ�������cur��after����������ƶ���λ
			pre = pre.next.next;
		}
		return dummy.next;
	}
}

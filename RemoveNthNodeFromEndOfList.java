package com.leetcode;


class ListNode_2{
	private int val;
	ListNode_2 next;
	ListNode_2(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public ListNode_2 getNext() {
		return next;
	}
	public void setNext(ListNode_2 next) {
		this.next = next;
	}
	
}

/**
 * Ë«Ö¸ÕëËã·¨
 * @author zhou
 *
 */
public class RemoveNthNodeFromEndOfList {
	public ListNode_2 removeNthFromEnd(ListNode_2 head, int n) {
		ListNode_2 dummy = new ListNode_2(-1);
		dummy.next = head;
		ListNode_2 first = dummy;
		ListNode_2 second = dummy;
		
		for(int i = 0;i < n+1;i ++) { //n+1
			first = first.next;
			System.out.println(first.getVal());
		}
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		
		return dummy.next;
	}

}

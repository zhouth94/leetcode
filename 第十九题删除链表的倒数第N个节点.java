package com.leetcode;

class ListNode_1{
	private int val;
	ListNode_1 next;
	ListNode_1(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public ListNode_1 getNext() {
		return next;
	}
	public void setNext(ListNode_1 next) {
		this.next = next;
	}
	
}

public class 第十九题删除链表的倒数第N个节点 {
	public ListNode_1 removeNthFromEnd(ListNode_1 head,int n) { 
		ListNode_1 dummy = new ListNode_1(-1);
		dummy.next = head;
		
		ListNode_1 p = head;
		
		int len = 0;
		while(head != null) { //1(head)->2->3->4->5
			len ++;
			head = head.next;
		}
		
		int cur = 0;
		p = dummy;
		while(cur < (len - n)) {
			p = p.next;
			cur ++;
		}
		p.next = p.next.next;
		
		return dummy.next;
	}
	
	public void print(ListNode_1 head) {
		System.out.print(head.getVal());
		if(head.next != null) {
			System.out.print("-->");
			print(head.next);
		}
	}
	
	public void getList(ListNode_1 node) {
		while(node != null) {
			System.out.print(node.getVal());
			node = node.next;
		}
	} 
	
	public static void main(String[] args) {
		ListNode_1 l1 = new ListNode_1(1);
		ListNode_1 l2 = new ListNode_1(2);
		ListNode_1 l3 = new ListNode_1(3);
		ListNode_1 l4 = new ListNode_1(4);
		ListNode_1 l5 = new ListNode_1(5);
		
//		ListNode_1 dummy = new ListNode_1(-1);
//		dummy.setNext(l1);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(null);
		
		第十九题删除链表的倒数第N个节点 s = new 第十九题删除链表的倒数第N个节点();
		s.print(l1);
		System.out.println();
		ListNode_1 head = s.removeNthFromEnd(l1,2);
		s.print(head);
	}

}

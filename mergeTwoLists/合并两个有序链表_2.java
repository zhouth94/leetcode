package com.hwua.mergeTwoLists;

import com.dhu.swapPairs.ListNode;

public class 合并两个有序链表_2 {
	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		ListNode dummy = new ListNode(0);
		ListNode p = new ListNode(0);
		ListNode q = new ListNode(0);
		ListNode head = dummy;
		p = l1;
		q = l2;
		while(p!=null && q!=null){
			int x = p.getVal();
			int y = q.getVal();
			if(x < y){
				//head.setNext(p);
				head.setNext(new ListNode(x));
				p = p.getNext();
			}else{
				head.setNext(q);
				q = q.getNext();
			}
			head = head.getNext();
		}
		while(p != null){
			head.setNext(p);
		}
		while(q != null){
			head.setNext(new ListNode(q.getVal()));
			q = q.getNext();
			head = head.getNext();
		}
		
		return dummy.getNext();
	}

	public static void main(String[] args) {
		ListNode l1_1 = new ListNode(1);
		ListNode l1_2 = new ListNode(2);
		ListNode l1_3 = new ListNode(4);
		l1_1.setNext(l1_2);
		l1_2.setNext(l1_3);
		l1_3.setNext(null);
		l1_1.print();
		ListNode l2_1 = new ListNode(1);
		ListNode l2_2 = new ListNode(3);
		ListNode l2_3 = new ListNode(4);
		l2_1.setNext(l2_2);
		l2_2.setNext(l2_3);
		l2_1.print();
		合并两个有序链表 h = new 合并两个有序链表();
		ListNode list = h.mergeTwoLists(l1_1, l2_2);
		System.out.println();
		list.print();

	}

}

package com.hwua.mergeTwoLists;

import com.dhu.swapPairs.ListNode;

public class 合并两个有序链表 {
	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		ListNode dummy = new ListNode(0);
		ListNode p = new ListNode(0);
		ListNode q = new ListNode(0);
		ListNode cur = dummy;
		//p = l1;
		//q = l2;
		while(l1!=null && l2!=null){
			if(l1.getVal() < l2.getVal()){
				cur.setNext(l1);
				cur = cur.getNext();
				l1 = l1.getNext();
			}else{
				cur.setNext(l2);
				cur = cur.getNext();
				l2 = l2.getNext();
			}
		}
		//当其中一个链表为空时，退出循环
		if(l1==null){
			cur.setNext(l2);
		}else{
			cur.setNext(l1);
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

















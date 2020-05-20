package com.leetcode;

class ListNode_3 {
	 int val;
	 ListNode_3 next;
	 ListNode_3(int x) { val = x; }
}

public class 第二十一题合并两个有序链表 {
	public ListNode_3 mergeTwoLists(ListNode_3 l1, ListNode_3 l2) {
        ListNode_3 head = new ListNode_3(0);
        ListNode_3 dummy = head;
        
        while(l1!= null && l2!= null) {
        	if(l1.val <= l2.val) {
        		head.next = l1;
        		head = l1;
        		l1 = l1.next;
        	}else {
        		head.next = l2;
        		head = l2;
        		l2 = l2.next;
        	}
        	//head = head.next;
        }
        
        if(l1 == null && l2 != null) {
        	head.next = l2;
        }
        if(l2 == null && l1 != null) {
        	head.next = l1;
        }
        return dummy.next;
    }

}

package com.leetcode;

public class 第一四八排序链表 {
	 public ListNode sortList(ListNode head) {
		 //递归终止条件 -> cut 递归终止条件： 当head.next == None时，说明只有一个节点了，直接返回此节点。
		 if(head == null || head.next == null)
			 return head;
		 
		 //快慢指针
		 ListNode fast = head;
		 ListNode slow = head;
		 while(fast.next != null && fast.next.next != null) {
			 fast = fast.next.next;
			 slow = slow.next;
		 }
		 //归并排序 -> 1.分
		 ListNode tmp = slow.next; //从slow断开
		 slow.next = null;
		 ListNode left = sortList(head); //递归分
		 ListNode right = sortList(tmp);
		 
		 ListNode dummy = new ListNode(-1);
		 ListNode p = dummy;
		 //2.治
		 while(left!=null && right!=null) {
			 if(left.val <= right.val) {
				 dummy.next = left;
				 left = left.next;
			 }else {
				 dummy.next = right;
				 right = right.next;
			 }
			 dummy = dummy.next;
		 }
		 dummy.next = (left != null) ? left : right;
		 return p.next;
    }
}

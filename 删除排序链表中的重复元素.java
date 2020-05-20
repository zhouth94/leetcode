package com.leetcode;

class ListNodeS {
	int val;
	ListNodeS next;
	ListNodeS(int x) { val = x; }
}

public class 删除排序链表中的重复元素 {
	public ListNodeS deleteDuplicates(ListNodeS head) {
		ListNodeS first = head;
		ListNodeS second = head;
		if(head == null)
			return second;
		
		while(first != null) {
			if(first != null && first.val != second.val) {
				second.next = first;
				second = second.next;
				first = first.next;
			}else {
				first = first.next;
			}
  		}
		second.next = null;
		return head;
	}
}

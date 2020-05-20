package com.leetcode;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class 删除排序链表中的重复元素二 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null)
			return null;
		
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode cur = head;
		//停止条件：pre的next指针为Null
		while(pre.next != null) { //判断条件需要注意
			int cnt = 0;
			while(cur != null && pre.next.val == cur.val) {
				cnt ++;
				cur = cur.next;
			}
			if(cnt == 1) { //上一步骤需要保留的结点
				pre = pre.next;
			}else { //重复的结点
				pre.next = cur;
			}
		}
		return dummy.next;
    }
	
	public ListNode deleteDuplicates_2(ListNode head) {
		if(head == null)
			return null;
		
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode pre = dummy;
		while(pre.next != null) {
			ListNode cur = pre.next;
			while(cur.next != null && cur.val == cur.next.val) {
				cur = cur.next;
			}
			if(pre.next != cur) { //说明cru指针移动过了，存在重复结点
				pre.next = cur.next;
			}else {
				pre = cur;
			}
		}
		return dummy.next;
	}
}

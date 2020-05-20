package com.leetcode;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class ɾ�����������е��ظ�Ԫ�ض� {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null)
			return null;
		
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode cur = head;
		//ֹͣ������pre��nextָ��ΪNull
		while(pre.next != null) { //�ж�������Ҫע��
			int cnt = 0;
			while(cur != null && pre.next.val == cur.val) {
				cnt ++;
				cur = cur.next;
			}
			if(cnt == 1) { //��һ������Ҫ�����Ľ��
				pre = pre.next;
			}else { //�ظ��Ľ��
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
			if(pre.next != cur) { //˵��cruָ���ƶ����ˣ������ظ����
				pre.next = cur.next;
			}else {
				pre = cur;
			}
		}
		return dummy.next;
	}
}

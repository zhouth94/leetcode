package com.leetcode;

public class ��һ�İ��������� {
	 public ListNode sortList(ListNode head) {
		 //�ݹ���ֹ���� -> cut �ݹ���ֹ������ ��head.next == Noneʱ��˵��ֻ��һ���ڵ��ˣ�ֱ�ӷ��ش˽ڵ㡣
		 if(head == null || head.next == null)
			 return head;
		 
		 //����ָ��
		 ListNode fast = head;
		 ListNode slow = head;
		 while(fast.next != null && fast.next.next != null) {
			 fast = fast.next.next;
			 slow = slow.next;
		 }
		 //�鲢���� -> 1.��
		 ListNode tmp = slow.next; //��slow�Ͽ�
		 slow.next = null;
		 ListNode left = sortList(head); //�ݹ��
		 ListNode right = sortList(tmp);
		 
		 ListNode dummy = new ListNode(-1);
		 ListNode p = dummy;
		 //2.��
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

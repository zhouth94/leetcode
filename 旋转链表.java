package com.leetcode;

/*class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}*/

public class ��ת���� {
	
	public ListNode rotateRight(ListNode head,int k) {
		if(head == null)
			return null;
		ListNode cur = head;
		int len = 1;
		while(cur.next != null) { 
			len ++;
			cur = cur.next;
		}
		k %= len;
		ListNode first = head;
		ListNode second = head;
		for(int i = 0;i < k;i ++) { //first�ƶ�k��
			first = first.next;
		}
		while(first.next != null) { //˫ָ��
			first = first.next;
			second = second.next;
		}
		first.next = head;
		head = second.next; 
		/*head.next = first;*/
		second.next = null;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

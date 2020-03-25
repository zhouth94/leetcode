package com.leetcode;

public class 第二题两数之和 {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		if(l1==null && l2==null)
			return null;
		
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		int carryBit = 0; //进位
		
		//carryBit!=0  这个条件很重要
		while(l1!=null || l2!=null || carryBit!=0){
			int val1 = l1==null? 0:l1.val;
			int val2 = l2==null? 0:l2.val;
			
			int sum = val1 + val2 + carryBit;
//			head.val = sum % 10;
			head.next = new ListNode(sum % 10);
			carryBit = sum / 10;
			
			head = head.next;
			if(l1 != null)
				l1 = l1.next;
			if(l2 != null)
				l2 = l2.next;
//			l1 = l1.next;
//			l2 = l2.next;
		}
		
		return dummy.next;
	}

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			this.val = x;
		}
		
		public static String print(ListNode l){
			StringBuilder sb = new StringBuilder();
			while(l != null){
				sb.append(l.val);
				l = l.next;
			}
			return sb.toString();
		}
	}
	
	
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		
		第二题两数之和 d = new 第二题两数之和();
		ListNode res = d.addTwoNumbers(l1, l2);
		
		System.out.println(ListNode.print(res));
	}
}


















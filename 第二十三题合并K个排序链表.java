package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

class ListNode_23 {
	int val;
	ListNode_23 next;
	ListNode_23(int x) { val = x; }
	
	public static void print(ListNode_23 head) {
		while(head != null) {
			System.out.print(head.val + " --");
			head = head.next;
		}
	}
}
public class 第二十三题合并K个排序链表 {
	public ListNode_23 mergeKLists(ListNode_23[] lists) {
		int len = 0;
		for(int i = 0;i < lists.length;i ++) {
			ListNode_23 p = lists[i]; //每一个链表的首元结点
			while(p != null) {
				len ++;
				p = p.next;
			}
		}
		int[] arr = new int[len];
		int cur = 0;
		for(int i = 0;i < lists.length;i ++) {
			ListNode_23 p = lists[i]; //每一个链表的首元结点
			while(p != null) {
				arr[cur++] = p.val;
				p = p.next;
			}
		}
		
		Arrays.sort(arr);
		ListNode_23 dummy = new ListNode_23(-1);
		for (int i = 0; i < arr.length; i++) {
			ListNode_23 q = new ListNode_23(arr[i]);
			dummy.next = q;
			dummy = q;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		ListNode_23 l1 = new ListNode_23(1);
		l1.next = new ListNode_23(4);
		l1.next.next = new ListNode_23(5);
		
		ListNode_23 l2 = new ListNode_23(1);
		l2.next = new ListNode_23(3);
		l2.next.next = new ListNode_23(4);
		
		ListNode_23 l3 = new ListNode_23(2);
		l3.next = new ListNode_23(6);
		
		ListNode_23.print(l1);
		ListNode_23.print(l2);
		ListNode_23.print(l3);
		
		第二十三题合并K个排序链表 sol = new 第二十三题合并K个排序链表();
		ListNode_23[] lists = new ListNode_23[3];
		ArrayList<ListNode_23> list1 = new ArrayList<ListNode_23>();
		list1.add(l1);
		ArrayList<ListNode_23> list2 = new ArrayList<ListNode_23>();
		list1.add(l2);
		ArrayList<ListNode_23> list3 = new ArrayList<ListNode_23>();
		list1.add(l3);
		
	}

}

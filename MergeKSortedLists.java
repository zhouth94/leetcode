package com.leetcode;

import java.util.PriorityQueue;

class ListNode_23_cpoy {
	int val;
	ListNode_23_cpoy next;
	ListNode_23_cpoy(int x) { val = x; }
	
	public static void print(ListNode_23_cpoy head) {
		while(head != null) {
			System.out.print(head.val + " -- ");
			head = head.next;
		}
	}
}
public class MergeKSortedLists {
	public ListNode_23_cpoy mergeKLists(ListNode_23_cpoy[] lists) {
		PriorityQueue<ListNode_23_cpoy> queue = new PriorityQueue<>((ListNode_23_cpoy o1, ListNode_23_cpoy o2) -> {return o1.val - o2.val;});
		
		for(int i = 0;i < lists.length;i ++) {
			//链表首元结点代表一个链表，每一次将一个链表加入queue
			while(lists[i] != null) {
				queue.add(lists[i]);
				lists[i] = lists[i].next;
			}
		}
		
		for(ListNode_23_cpoy tmp : queue) {
			ListNode_23_cpoy.print(tmp);
		}
		System.out.println();
		
		ListNode_23_cpoy head = new ListNode_23_cpoy(-1);
		ListNode_23_cpoy dummy = head;
		while(!queue.isEmpty()) {
			ListNode_23_cpoy temp = queue.poll();
			head.next = temp;
			head = head.next;
		}
		head.next = null;
		return dummy.next;
    }
	
	public static void main(String[] args) {
		MergeKSortedLists m = new MergeKSortedLists();
		ListNode_23_cpoy[] lists = new ListNode_23_cpoy[3];
		lists[0] = new ListNode_23_cpoy(1);
		lists[0].next = new ListNode_23_cpoy(4);
		lists[0].next.next = new ListNode_23_cpoy(5);
		
		lists[1] = new ListNode_23_cpoy(1);
		lists[1].next = new ListNode_23_cpoy(3);
		lists[1].next.next = new ListNode_23_cpoy(4);
		
		lists[2] = new ListNode_23_cpoy(2);
		lists[2].next = new ListNode_23_cpoy(6);
		
		ListNode_23_cpoy out = m.mergeKLists(lists);
		ListNode_23_cpoy.print(out);
	}
}

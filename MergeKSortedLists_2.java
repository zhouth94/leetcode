package com.leetcode;

/**
 * 分治的思想 归并
 * @author zhou
 *
 */
public class MergeKSortedLists_2 {
	public ListNode_second mergeKLists(ListNode_second[] lists) {
		if(lists==null || lists.length<1)
			return null;
		ListNode_second result = merge(lists, 0, lists.length-1);
		return result;
    }
	
	private ListNode_second merge(ListNode_second[] lists, int left, int right) {
		//用到递归 --> 首先递归终止条件
		if(left >= right)
			return lists[left];
		int mid = left + (right - left) / 2; //右移一位
		ListNode_second l1 = merge(lists, left, mid);
		ListNode_second l2 = merge(lists, mid+1, right);
		return sortTwoLists(l1, l2);
	}

	private ListNode_second sortTwoLists(ListNode_second l1, ListNode_second l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		if(l1.val < l2.val) {
			l1.next = sortTwoLists(l1.next, l2);
			return l1;
		}
		else {
			l2.next = sortTwoLists(l1, l2.next);
			return l2;
		}
	}

	public static void main(String[] args) {
		MergeKSortedLists_2 m = new MergeKSortedLists_2();
		ListNode_second[] lists = new ListNode_second[3];
		lists[0] = new ListNode_second(1);
		lists[0].next = new ListNode_second(4);
		lists[0].next.next = new ListNode_second(5);
		
		lists[1] = new ListNode_second(1);
		lists[1].next = new ListNode_second(3);
		lists[1].next.next = new ListNode_second(4);
		
		lists[2] = new ListNode_second(2);
		lists[2].next = new ListNode_second(6);
		
		ListNode_second out = m.mergeKLists(lists);
		ListNode_second.print(out);
	}
}

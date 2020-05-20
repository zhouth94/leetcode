package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class 相交链表 {
	//HashSet 记录走过的结点
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        	return null;
        Set<ListNode> set = new HashSet<ListNode>();
        while(headA != null || headB != null) {
        	if(headA != null) {
        		if(!set.contains(headA)) {
        			set.add(headA);
            		headA = headA.next;
        		}else { //若set中包含headA，说明存在交点，则返回
        			return headA; 
        		}
        	}else { //headA链表中节点已经全部存入set中
        		if(headB != null) {
        			if(!set.contains(headB)) {
        				set.add(headB);
        				headB = headB.next;
        			}else {
        				return headB;
        			}
        		}
        	}
        }
        return null;
    }
	
	public ListNode getIntersectionNode_2(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)
        	return null;
		ListNode p = headA;
		ListNode q = headB;
		while(p != q) {
			if(p != null) {
				p = p.next;
			}else {
				p.next = headB;
			}
			if(q != null) {
				q = q.next;
			}else {
				q.next = headA;
			}
		}
		return q;
	}

}

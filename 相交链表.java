package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class �ཻ���� {
	//HashSet ��¼�߹��Ľ��
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        	return null;
        Set<ListNode> set = new HashSet<ListNode>();
        while(headA != null || headB != null) {
        	if(headA != null) {
        		if(!set.contains(headA)) {
        			set.add(headA);
            		headA = headA.next;
        		}else { //��set�а���headA��˵�����ڽ��㣬�򷵻�
        			return headA; 
        		}
        	}else { //headA�����нڵ��Ѿ�ȫ������set��
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

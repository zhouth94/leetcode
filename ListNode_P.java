package com.leetcode;

public class ListNode_P {
	private int val;
	private ListNode_P next;
	public ListNode_P(int x){
		this.val = x;
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode_P getNext() {
		return next;
	}

	public void setNext(ListNode_P next) {
		this.next = next;
	}

	public void print(){
		System.out.print(this.val);
		if(this.next != null){
//			System.out.print(this.next.val);
			System.out.print("-->");
			this.next.print();
		}
	}

}

package com.hwua.mergeTwoLists;

public class ListNode {
	private int val;
	private ListNode next;
	
	public ListNode(int x){
		val = x;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public void print(){
		System.out.print(this.val);	//打印首元结点
		if(this.next != null){	//使用this.next
			System.out.print("-->");
			this.next.print();
		}
	}
	
	public void getList(ListNode node){
		if(node != null){
			System.out.print(node.val);
			System.out.print("-->");
			node = node.next;
		}
	}
	
}

package com.hwua.mergerKLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 合并k个链表 {
	public ListNode mergeKLists(ListNode[] lists){
		if(lists==null || lists.length==0)
			return null;
		PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.getVal()-o2.getVal();
			}
		});
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		//遍历Lists
		for (ListNode node : lists) {
			if(node != null){
				queue.add(node);
			}
		}
		
		while(!queue.isEmpty()){
			//poll():获取并移除此队列的头
			p.setNext(queue.poll());
			if(p.getNext()!=null){
				queue.add(p.getNext());
				p = p.getNext();
			}
		}
		
		return dummy.getNext();
	}

	public static void main(String[] args) {
		合并k个链表 h = new 合并k个链表();
		Scanner sc = new Scanner(System.in);
		//System.out.print("请输入一个数字k:");
		//int k = sc.nextInt();
		List<ListNode> list1 = new ArrayList<ListNode>(){{
			add(new ListNode(1));
			add(new ListNode(4));
			add(new ListNode(5));
		}};
		System.out.println(list1);

	}

}






















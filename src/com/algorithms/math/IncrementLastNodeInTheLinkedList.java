package com.algorithms.string;

public class IncrementLastNodeInTheLinkedList {

	public static void main(String[] args) {
		ListNode root = new ListNode(0);
		ListNode x = root;
		x.next = new ListNode(1);
		x = x.next;
		x.next = new ListNode(2);
		System.out.println("Before Increment");
		System.out.println(root.val);
		System.out.println(root.next.val);
		System.out.println(root.next.next.val);		
		ListNode node = root;
		while(node!=null){
			if(node.next == null){
				node.val++;
			}
			node = node.next;
		}
		System.out.println("After Increment");
		System.out.println(root.val);
		System.out.println(root.next.val);
		System.out.println(root.next.next.val);
	}

}

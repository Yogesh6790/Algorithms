package com.algorithms.string;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumbersLinkedList {
    private ListNode parent = new ListNode(0);
    private ListNode parentNode = parent;
    private boolean carry = false;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null){
            parentNode.next = performOp(l1, l2);
            parentNode = parentNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(carry){
        	parentNode.next = new ListNode(1);
        }
        return parent.next;        
    }
    public ListNode performOp(ListNode l1, ListNode l2){
        ListNode node;
        int sum = l1.val + l2.val;
            if(carry){
                sum++;
            }
            String x = String.valueOf(sum);
            if(sum > 9){
                carry = true;
               node = new ListNode(sum%10);  
            }else{
                carry = false;
              node = new ListNode(sum);  
            }
        return node;
    }

	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
//		ListNode x = l1;
//		x.next = new ListNode(4);
//		x = x.next;
//		x.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
//		ListNode y = l2;
//		y.next = new ListNode(6);
//		y = y.next;
//		y.next = new ListNode(4);
//		y = y.next;
		AddTwoNumbersLinkedList x0 = new AddTwoNumbersLinkedList();
		x0.addTwoNumbers(l1,l2);
	}

}

package com.isaacxie.leetcode;

public class RemoveLinkedListElements {
	// https://leetcode.com/problems/delete-node-in-a-linked-list/

	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return head;
		}
		ListNode root = new ListNode(0);
		root.next = head;
		ListNode p = root;
		while (p.next != null) {
			if (p.next.val == val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		return root.next;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}

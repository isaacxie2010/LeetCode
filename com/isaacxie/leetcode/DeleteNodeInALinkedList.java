package com.isaacxie.leetcode;

public class DeleteNodeInALinkedList {
	// https://leetcode.com/problems/delete-node-in-a-linked-list/

	public void deleteNode(ListNode node) {
		ListNode temp = node.next;
		node.val = temp.val;
		node.next = temp.next;
		temp = null;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}

package com.isaacxie.leetcode;

public class AddTwoNumbers {
	// http://oj.leetcode.com/problems/add-two-numbers/

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		int val = (l1.val + l2.val) % 10;
		int plus = (l1.val + l2.val) / 10;
		ListNode node = new ListNode(val);
		l1 = l1.next;
		l2 = l2.next;
		ListNode head = node;
		while (l1 != null || l2 != null) {
			int value = 0;
			if (l1 != null && l2 != null) {
				value = l1.val + l2.val + plus;
				l1 = l1.next;
				l2 = l2.next;
			} else if (l1 != null) {
				value = l1.val + plus;
				l1 = l1.next;
			} else {
				value = l2.val + plus;
				l2 = l2.next;
			}
			plus = value / 10;
			node.next = new ListNode(value % 10);
			node = node.next;
		}
		if (plus > 0) {
			node.next = new ListNode(plus);
		}
		return head;
	}

	/**
	 * Definition for singly-linked list.
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}

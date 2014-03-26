package com.isaacxie.leetcode;

public class MergeTwoSortedLists {
	// http://oj.leetcode.com/problems/merge-two-sorted-lists/

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode node = null;
		if (l1.val < l2.val) {
			node = l1;
			l1 = l1.next;
		} else {
			node = l2;
			l2 = l2.next;
		}
		ListNode head = node;
		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					node.next = l1;
					l1 = l1.next;
				} else {
					node.next = l2;
					l2 = l2.next;
				}
			} else if (l1 == null) {
				node.next = l2;
				l2 = l2.next;
			} else {
				node.next = l1;
				l1 = l1.next;
			}
			node = node.next;
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

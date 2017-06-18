package com.isaacxie.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class _AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        int headVal = (l1.val + l2.val) % 10;
        int carry = (l1.val + l2.val) / 10;
        ListNode head = new ListNode(headVal);
        ListNode node = head;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null || l2 != null) {
            int val = carry;
            if(l1 != null && l2 != null) {
                val += l1.val;
                val += l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            } else if(l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode(val % 10);
            carry = val / 10;
            node = node.next;
        }
        if(carry != 0) {
            node.next = new ListNode(carry);
        } 
        return head;
    }
}
package com.isaacxie.leetcode;

import java.util.Random;

public class LinkedListRandomNode {
	// https://leetcode.com/problems/linked-list-random-node/
	ListNode node;
	Random random;
	
	/** @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
        node = head;
        random = new Random();
    }
	
    /** Returns a random node's value. */
    public int getRandom() {
    	ListNode curr = node;
    	int val = curr.val;
    	
    	for(int i = 1; curr != null; i++) {
    		if(random.nextInt(i) == 0) { // the possibility is 1/i each time 
    			val = curr.val; 
    		}
    		curr = curr.next;
    	}
    	return val;
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
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
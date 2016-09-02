package com.isaacxie.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DesignPhoneDirectory {
	// https://leetcode.com/problems/design-phone-directory/
	
	private Queue<Integer> queue = new LinkedList<>();;
	private Set<Integer> set = new HashSet<>();
	
	/** Initialize your data structure here
    @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
	public DesignPhoneDirectory(int maxNumbers) {
		for(int i = 0; i < maxNumbers; i++) {
			queue.add(i);
		}
	}

	/** Provide a number which is not assigned to anyone.
    @return - Return an available number. Return -1 if none is available. */
	public int get() {
		if(!queue.isEmpty()) {
			int num = queue.remove();
			set.add(num);
			return num;
		}
		return -1;
	}

	/** Check if a number is available or not. */
	public boolean check(int number) {
		if(set.contains(number)) {
			return false;
		} else {
			return true;
		}
	}

	/** Recycle or release a number. */
	public void release(int number) {
		if (set.remove(number)) {
			queue.add(number);
		}
	}
}

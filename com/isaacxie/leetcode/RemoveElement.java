package com.isaacxie.leetcode;

public class RemoveElement {
	// https://leetcode.com/problems/remove-element/

	public int removeElement(int[] nums, int val) {
		int i = 0, j = 0;
		while (j < nums.length) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
			j++;
		}
		return i;
	}
}

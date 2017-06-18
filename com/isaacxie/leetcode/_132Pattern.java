package com.isaacxie.leetcode;

public class _132Pattern {
	// https://leetcode.com/problems/132-pattern

	public boolean find132pattern(int[] nums) {
		if (nums.length < 3) {
			return false;
		}
		int start = 0;
		while (start < nums.length - 2) {
			while (start < nums.length - 2 && nums[start] >= nums[start + 1]) {
				start++;
			}
			int m = start + 1;
			while (m < nums.length - 1 && nums[m] <= nums[m + 1]) {
				m++;
			}
			int j = m + 1;
			while (j < nums.length) {
				if (nums[start] < nums[j] && nums[j] < nums[m]) {
					return true;
				}
				j++;
			}
			start = m + 1;
		}
		return false;
	}
}
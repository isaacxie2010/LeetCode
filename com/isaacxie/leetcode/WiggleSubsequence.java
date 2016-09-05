package com.isaacxie.leetcode;

public class WiggleSubsequence {
	// https://leetcode.com/problems/wiggle-subsequence/

	public int wiggleMaxLength(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int countInc = 1;
		int countDec = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				countInc = countDec + 1;
			} else if (nums[i] < nums[i - 1]) {
				countDec = countInc + 1;
			}
		}
		return Math.max(countInc, countDec);
	}
}

package com.isaacxie.leetcode;

public class FirstBadVersion {
	// https://leetcode.com/problems/first-bad-version/

	public int firstBadVersion(int n) {
		if (n == 1) {
			return 1;
		}
		int left = 1;
		int right = n;
		while (left < right) {
			int middle = left / 2 + right / 2;
			if (isBadVersion(middle)) {
				right = middle;
			} else {
				left = middle + 1;
			}
		}
		return right;
	}

	private boolean isBadVersion(int n) {
		return true;
	}
}

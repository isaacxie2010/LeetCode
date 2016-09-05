package com.isaacxie.leetcode;

public class GuessNumberHigherOrLower {
	// https://leetcode.com/problems/guess-number-higher-or-lower/

	public int guessNumber(int n) {
		int high = n;
		int low = 1;
		int middle = 0;
		while (low < high) {
			middle = low + (high - low) / 2;
			int val = guess(middle);
			if (val == 0) {
				return middle;
			}
			if (val == 1) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		return low;
	}

	public int guess(int num) {
		return 0;
	}
}

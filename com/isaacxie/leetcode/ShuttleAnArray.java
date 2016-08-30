package com.isaacxie.leetcode;

import java.util.Random;

public class ShuttleAnArray {
	// https://leetcode.com/problems/shuffle-an-array/
	int[] origin;

	public ShuttleAnArray(int[] nums) {
		origin = nums;
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return this.origin;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		Random random = new Random();
		int[] array = origin.clone();
		for (int i = 0; i < origin.length; i++) {
			int j = random.nextInt(origin.length - i) + i; // find a num between i and length - 1
			swap(array, i, j);
		}
		return array;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */

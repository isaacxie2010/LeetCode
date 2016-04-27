package com.isaacxie.leetcode;

public class MoveZeroes {
	// https://leetcode.com/problems/move-zeroes/

	public void moveZeroes(int[] nums) {
		int i = -1, j = 0;
		while (j < nums.length) {
			if (nums[j] != 0) {
				swap(++i, j, nums);
			}
			j++;
		}
	}

	private void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}

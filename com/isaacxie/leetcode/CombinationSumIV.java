package com.isaacxie.leetcode;

import java.util.Arrays;

public class CombinationSumIV {
	// https://leetcode.com/problems/combination-sum-iv/

	public int combinationSum4(int[] nums, int target) {
		Arrays.sort(nums);
		int[] arr = new int[target + 1];
		arr[0] = 1;
		for (int i = 1; i <= target; i++) {
			for (int num : nums) {
				if (num <= i) {
					arr[i] += arr[i - num];
				}
			}
		}
		return arr[target];
	}

}

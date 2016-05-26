package com.isaacxie.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	// https://leetcode.com/problems/3sum-closest/

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < target) {
					j++;
				} else if (sum > target) {
					k--;
				} else {
					return target;
				}
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
			}
		}
		return result;
	}

}

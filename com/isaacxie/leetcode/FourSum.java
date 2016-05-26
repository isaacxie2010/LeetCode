package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	// https://leetcode.com/problems/4sum/

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for (int a = 0; a < nums.length - 3;) {
			for (int b = a + 1; b < nums.length - 2;) {
				int c = b + 1;
				int d = nums.length - 1;
				while (c < d) {
					int sum = nums[a] + nums[b] + nums[c] + nums[d];
					if (sum > target) {
						d--;
					} else if (sum < target) {
						c++;
					} else {
						ArrayList<Integer> item = new ArrayList<Integer>();
						item.add(nums[a]);
						item.add(nums[b]);
						item.add(nums[c]);
						item.add(nums[d]);
						result.add(item);
						while (item.get(2) == nums[c] && c < nums.length - 1) {
							c++;
						}
						while (item.get(3) == nums[d] && d > 2) {
							d--;
						}
					}
				}
				int prevB = nums[b];
				while (prevB == nums[b] && b < nums.length - 2) {
					b++;
				}
			}
			int prevA = nums[a];
			while (prevA == nums[a] && a < nums.length - 3) {
				a++;
			}
		}
		return result;
	}
}

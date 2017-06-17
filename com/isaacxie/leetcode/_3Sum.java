package com.isaacxie.leetcode;

public class _3Sum {
	// https://leetcode.com/problems/3sum

	public class Solution {
		public List<List<Integer>> threeSum(int[] nums) {
			List<List<Integer>> result = new ArrayList<>();
			// O(nlogn)
			Arrays.sort(nums);
			// O(n^2)
			for (int i = 0; i < nums.length - 2;) {
				int j = i + 1;
				int k = nums.length - 1;
				while (j < k) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == 0) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						result.add(list);

						while (list.get(1) == nums[j] && j < nums.length - 1) {
							j++;
						}
						while (list.get(2) == nums[k] && k > 1) {
							k--;
						}
					}
					if (sum < 0) {
						j++;
					}
					if (sum > 0) {
						k--;
					}
				}
				int num = nums[i];
				while (num == nums[i] && i < nums.length - 2) {
					i++;
				}
			}
			return result;
		}
	}
}
package com.isaacxie.leetcode;

public class _4Sum {
	// https://leetcode.com/problems/4sum
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		// O(nlogn)
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3;) {
			for (int j = i + 1; j < nums.length - 2;) {
				int m = j + 1;
				int n = nums.length - 1;
				while (m < n) {
					int sum = nums[i] + nums[j] + nums[m] + nums[n];
					if (sum == target) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[m]);
						list.add(nums[n]);
						result.add(list);

						while (nums[m] == list.get(2) && m < nums.length - 1) {
							m++;
						}
						while (nums[n] == list.get(3) && n > 2) {
							n--;
						}
					}
					if (sum < target) {
						m++;
					}
					if (sum > target) {
						n--;
					}
				}
				int numJ = nums[j];
				while (numJ == nums[j] && j < nums.length - 2) {
					j++;
				}
			}
			int numI = nums[i];
			while (numI == nums[i] && i < nums.length - 3) {
				i++;
			}
		}
		return result;
	}
}
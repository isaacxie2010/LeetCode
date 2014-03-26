package com.isaacxie.leetcode;

import java.util.HashMap;

public class TwoSum {
	// http://oj.leetcode.com/problems/two-sum/

	public int[] twoSum(int[] numbers, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		// store key value pair, number:index
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				int[] result = new int[2];
				result[0] = map.get(target - numbers[i]) + 1;
				result[1] = i + 1;
				return result;
			} else {
				map.put(numbers[i], i);
			}
		}
		return null;
	}

}
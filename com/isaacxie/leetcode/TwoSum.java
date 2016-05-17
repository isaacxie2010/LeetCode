package com.isaacxie.leetcode;

import java.util.HashMap;

public class TwoSum {
	// http://oj.leetcode.com/problems/two-sum/

	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				int[] result = new int[2];
				result[0] = map.get(target - numbers[i]);
				result[1] = i;
				return result;
			} else {
				map.put(numbers[i], i);
			}
		}
		return null;
	}

}
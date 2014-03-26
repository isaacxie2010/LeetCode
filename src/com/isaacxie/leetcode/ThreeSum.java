package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	// http://oj.leetcode.com/problems/3sum/

	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2;) {
			int j = i + 1;
			int k = num.length - 1;
			while (j < k) {
				if (num[i] + num[j] + num[k] == 0) {
					ArrayList<Integer> element = new ArrayList<Integer>();
					element.add(num[i]);
					element.add(num[j]);
					element.add(num[k]);
					result.add(element);
					while (j < num.length - 1 && num[j] == element.get(1))
						j++;
					while (k > 1 && num[k] == element.get(2))
						k--;
				} else if (num[i] + num[j] + num[k] > 0) {
					k--;
				} else {
					j++;
				}
			}
			int previous = num[i];
			while (i < num.length - 2 && previous == num[i])
				i++;
		}
		return result;
	}
}

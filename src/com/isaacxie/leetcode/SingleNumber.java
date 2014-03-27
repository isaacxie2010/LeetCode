package com.isaacxie.leetcode;

public class SingleNumber {
	// http://oj.leetcode.com/problems/single-number/

	public int singleNumber(int[] array) {
		int value = 0;
		for (int i = 0; i < array.length; i++) {
			value ^= array[i];
		}
		return value;
	}
}

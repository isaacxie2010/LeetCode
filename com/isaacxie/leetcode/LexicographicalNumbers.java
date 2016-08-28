package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
	// https://leetcode.com/problems/lexicographical-numbers/
	public List<Integer> lexicalOrder(int n) {
		List<Integer> result = new ArrayList<>();
		getLexOrder(result, n, 1);
		return result;
	}

	private void getLexOrder(List<Integer> result, int n, int i) {
		if (i > n) {
			return;
		}
		result.add(i);
		getLexOrder(result, n, i * 10);
		if (i + 1 <= (i / 10) * 10 + 9) {
			getLexOrder(result, n, i + 1);
		} else {
			return;
		}
	}
}

package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.List;

public class UglyNumberII {
	// https://leetcode.com/problems/ugly-number-ii/
	
	public int nthUglyNumber(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int a = 0;
		int b = 0;
		int c = 0;
		while (list.size() < n) {
			int next = Math.min(list.get(a) * 2, Math.min(list.get(b) * 3, list.get(c) * 5));
			list.add(next);
			if (next == list.get(a) * 2) {
				a++;
			}
			if (next == list.get(b) * 3) {
				b++;
			}
			if (next == list.get(c) * 5) {
				c++;
			}
		}
		return list.get(n - 1);
	}
}

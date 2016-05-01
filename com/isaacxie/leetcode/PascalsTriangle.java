package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	// https://leetcode.com/problems/pascals-triangle/

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			list.add(0, 1);
			for (int j = 1; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
			result.add(new ArrayList<Integer>(list));
		}
		return result;
	}

}

package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	// https://leetcode.com/problems/pascals-triangle-ii/

	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < rowIndex + 1; i++) {
			list.add(0, 1);
			for (int j = 0; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
		}
		return list;
	}
}

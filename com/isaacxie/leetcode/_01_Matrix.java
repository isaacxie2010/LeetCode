package com.isaacxie.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _01_Matrix {
	// https://leetcode.com/problems/01-matrix/
	
	public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
		// BFS, intial queue with all 0s, and set matrix not-zero element
		// Integer.MAX
		int x = matrix.size();
		int y = matrix.get(0).size();
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (matrix.get(i).get(j) == 0) {
					queue.offer(new int[] { i, j });
				} else {
					matrix.get(i).set(j, Integer.MAX_VALUE);
				}
			}
		}
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		while (!queue.isEmpty()) {
			int[] elements = queue.poll();
			for (int[] dir : directions) {
				int r = elements[0] + dir[0];
				int c = elements[1] + dir[1];
				if (r >= x || r < 0 || c >= y || c < 0) {
					// out of bound
					continue;
				}
				if (matrix.get(r).get(c) <= matrix.get(elements[0]).get(elements[1]) + 1) {
					// means no need to update
					continue;
				}
				queue.offer(new int[] { r, c });
				matrix.get(r).set(c, matrix.get(elements[0]).get(elements[1]) + 1);
			}
		}
		return matrix;
	}
}

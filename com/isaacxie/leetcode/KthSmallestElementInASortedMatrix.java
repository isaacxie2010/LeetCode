package com.isaacxie.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
	// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

	public int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10000, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});
		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (pq.size() == k) {
					if (pq.peek() > matrix[i][j]) {
						pq.poll();
						pq.add(matrix[i][j]);
					}
				} else {
					pq.add(matrix[i][j]);
				}
			}
		}
		return pq.peek();
	}
}

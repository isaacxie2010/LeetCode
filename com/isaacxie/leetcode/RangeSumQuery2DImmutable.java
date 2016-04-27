package com.isaacxie.leetcode;

public class RangeSumQuery2DImmutable {
	// https://leetcode.com/problems/range-sum-query-2d-immutable/

	public class NumMatrix {
		int[][] sum;

		public NumMatrix(int[][] matrix) {
			if (matrix.length == 0 || matrix[0].length == 0) {
				return;
			}
			sum = new int[matrix.length][matrix[0].length + 1];
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j< matrix[0].length; j++) {
					sum[i][j+1] = sum[i][j] + matrix[i][j];
				}
			}
		}

		public int sumRegion(int row1, int col1, int row2, int col2) {
			int result = 0;
			for(int row = row1; row < row2; row ++) {
				result += sum[row][col2 + 1] - sum[row][col1];
			}
			return result;
		}
	}
}

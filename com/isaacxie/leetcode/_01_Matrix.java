package com.isaacxie.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _01_Matrix {
	// https://leetcode.com/problems/01-matrix/
	
	public int[][] updateMatrix(int[][] matrix) {
		// BFS, intial queue with all 0s, and set matrix not-zero element
		// Integer.MAX
        int x = matrix.length;
        int y = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()) {
            int[] item = queue.poll();
            for(int[] dir : directions) {
                int r = item[0] + dir[0];
                int c = item[1] + dir[1];
                if(r >= x || r < 0 || c >= y || c < 0) {
                    continue;  // out of bound
                }
                if(matrix[r][c] <= matrix[item[0]][item[1]] + 1) {
                    continue; // not need to update
                }
                matrix[r][c] = matrix[item[0]][item[1]] + 1;
                queue.offer(new int[]{r, c});
            }
        }
        return matrix;
    }
}

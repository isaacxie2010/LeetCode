package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
	// https://leetcode.com/problems/path-sum-ii/

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
		dfs(result, new ArrayList<Integer>(), root, sum);
		return result;
	}

	private void dfs(List<List<Integer>> result, List<Integer> list, TreeNode node, int sum) {
		if (node.left == null && node.right == null) {
			if (node.val == sum) {
				list.add(node.val);
				result.add(list);
				return;
			}
		}

		if (node.left != null) {
			ArrayList<Integer> left = new ArrayList<Integer>(list);
			left.add(node.val);
			dfs(result, left, node.left, sum - node.val);
		}
		if (node.right != null) {
			ArrayList<Integer> right = new ArrayList<Integer>(list);
			right.add(node.val);
			dfs(result, right, node.right, sum - node.val);
		}
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}

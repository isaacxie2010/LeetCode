package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	// https://leetcode.com/problems/binary-tree-paths/

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		if (root == null) {
			return list;
		}
		dfs(list, new StringBuilder(), root);
		return list;
	}

	private void dfs(List<String> list, StringBuilder sb, TreeNode node) {
		if (node.left == null && node.right == null) {
			sb.append(node.val);
			list.add(sb.toString());
			return;
		}
		sb.append(node.val);
		sb.append("->");
		if (node.left != null) {
			dfs(list, new StringBuilder(sb), node.left);
		}
		if (node.right != null) {
			dfs(list, new StringBuilder(sb), node.right);
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

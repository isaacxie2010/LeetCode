package com.isaacxie.leetcode;

public class LongestAbsoluteFilePath {
	// https://leetcode.com/problems/longest-absolute-file-path/
	
	public int lengthLongestPath(String input) {
        String[] strs = input.split("\n");
        int[] arr = new int[strs.length + 1]; // arr[0] = 0;
        int max = 0;
        for (String str : strs) {
        	int level = str.lastIndexOf("\t") + 1; // if \t not exists, level = 0
        	arr[level + 1] = arr[level] + str.length() + 1 - level; // count the num of \t and \
        	if (str.contains(".")) {
        		max = Math.max(max, arr[level + 1] - 1);
        	}
        }        
        return max;
    }
}

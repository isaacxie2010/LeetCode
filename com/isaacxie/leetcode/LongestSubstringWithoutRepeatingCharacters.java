package com.isaacxie.leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
	// https://leetcode.com/problems/longest-substring-without-repeating-characters/

	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		int j = 0;
		char[] arr = s.toCharArray();
		int[] map = new int[128];
		
		for(int i = 0; i < arr.length; i++) {
			if(map[arr[i]] > 0) {
				j = Math.max(j, map[arr[i]]);
			}
			map[arr[i]] = i + 1;
			max = Math.max(max, i + 1 - j);
		}
		return max;
	}
}

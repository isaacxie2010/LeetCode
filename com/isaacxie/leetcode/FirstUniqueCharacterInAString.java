package com.isaacxie.leetcode;

public class FirstUniqueCharacterInAString {
	// https://leetcode.com/problems/first-unique-character-in-a-string/

	public int firstUniqChar(String s) {
		int[] map = new int[26];
		for (int i = 0; i < s.length(); i++) {
			map[s.charAt(i) - 'a']++;
		} // first pass to calculate the occurrence
		for (int i = 0; i < s.length(); i++) {
			if (map[s.charAt(i) - 'a'] == 1) {
				return i;
			} // second pass to find the first 1 occurrence
		}
		return -1;
	}
}

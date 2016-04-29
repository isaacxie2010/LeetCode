package com.isaacxie.leetcode;

import java.util.Arrays;

public class ValidAnagram {
	// https://leetcode.com/problems/valid-anagram/

	// sort
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	// hash table
	public boolean isAnagramHashtable(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] table = new int[26];
		for (int i = 0; i < s.length(); i++) {
			table[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			table[t.charAt(i) - 'a']--;
			if (table[t.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}

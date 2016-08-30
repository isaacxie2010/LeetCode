package com.isaacxie.leetcode;

public class RansomNote {
	// https://leetcode.com/problems/ransom-note/

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] arr = new int[256];
		for (int i = 0; i < magazine.length(); i++) {
			arr[magazine.charAt(i)]++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (arr[ransomNote.charAt(i)] == 0) {
				return false;
			}
			arr[ransomNote.charAt(i)]--;
		}
		return true;
	}
}

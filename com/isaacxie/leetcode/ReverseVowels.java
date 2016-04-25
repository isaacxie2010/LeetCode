package com.isaacxie.leetcode;

public class ReverseVowels {
	//https://leetcode.com/problems/reverse-vowels-of-a-string/
	
	public String reverseVowels(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		char[] array = s.toCharArray();
		int i = 0, j = array.length - 1;
		while (i < j) {
			if (isVowel(array[i]) && isVowel(array[j])) {
				char temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			} else if (isVowel(array[i])) {
				j--;
			} else {
				i++;
			}
		}
		return String.valueOf(array);
	}

	boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else {
			return false;
		}
	}
}
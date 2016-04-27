package com.isaacxie.leetcode;

public class BullsAndCows {
	// https://leetcode.com/problems/bulls-and-cows/

	public String getHint(String secret, String guess) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int bulls = 0;
		int cows = 0;
		for(int i = 0; i < secret.length(); i++) {
			if(secret.charAt(i) == guess.charAt(i)) {
				bulls++;
			}else {
				arr1[secret.charAt(i) - '0']++;
				arr2[guess.charAt(i) - '0']++;
			}
		}
		for(int i = 0; i < 10; i++) {
			cows += Math.min(arr1[i], arr2[i]);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(bulls).append('A').append(cows).append('B');
		return sb.toString();
	}
}

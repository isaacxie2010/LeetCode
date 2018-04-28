package com.isaacxie.leetcode;

public class _1bitAnd2bitCharacters {
	// https://leetcode.com/problems/1-bit-and-2-bit-characters/description/

	public boolean isOneBitCharacter(int[] bits) {
		boolean flag = false;
		int i = 0;
		while (i < bits.length) {
			if (bits[i] == 0) {
				i++;
				flag = true;
			} else {
				i += 2;
				flag = false;
			}
		}
		return flag;
	}

	public boolean isOneBitCharacter2(int[] bits) {
		int i = 0;
		while (i < bits.length - 1) {
			i += bits[i] + 1; // if 0 then take 1, if 1(0), 1(1), then take 2
		}
		return i == bits.length - 1;
	}
}

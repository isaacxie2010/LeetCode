package com.isaacxie.leetcode;

public class NimGame {
	// https://leetcode.com/problems/nim-game/

	public boolean canWinNim(int n) {
		if (n % 4 == 0) {
			return false;
		} else {
			return true;
		}
	}
}

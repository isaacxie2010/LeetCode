package com.isaacxie.leetcode;

public class CountPrimes {
	// https://leetcode.com/problems/count-primes/

	public int countPrimes(int n) {
		int count = 0;
		boolean[] prime = new boolean[n];
		for (int i = 0; i < n; i++) {
			prime[i] = true;
		}
		for (int i = 2; i < n; i++) {
			if (prime[i]) {
				for (int j = i * 2; j < n; j += i) {
					prime[i] = false;
				}
			}
		}
		for (int i = 2; i < n; i++) {
			if (prime[i]) {
				count++;
			}
		}
		return count;
	}
}

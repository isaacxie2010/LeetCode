package com.isaacxie.leetcode;

public class PowerOfThree {
	//https://leetcode.com/problems/power-of-three/submissions/
	
	public boolean isPowerOfThree(int n) {
		// log3(n) = log10(n) / log10(3) 
        return (Math.log10(n)/Math.log10(3)) % 1 == 0;
    }
	
	public boolean isPowerOfThreeIntuitive(int n) {
		while(n > 1 && n % 3 == 0) {
			n = n / 3;
		}
		return n == 1;
	}
}

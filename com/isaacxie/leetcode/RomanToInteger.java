package com.isaacxie.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	// https://leetcode.com/problems/roman-to-integer/

	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		int num = 0;
		int prev = 0;
		int curr = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			curr = map.get(s.charAt(i));
			if (curr >= prev) {
				num += curr;
			} else {
				num -= curr;
			}
			prev = curr;
		}
		return num;
	}
}

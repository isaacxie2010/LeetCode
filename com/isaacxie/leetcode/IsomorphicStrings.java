package com.isaacxie.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	// https://leetcode.com/problems/isomorphic-strings/

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map1 = new HashMap<Character, Character>();
		Map<Character, Character> map2 = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if (map1.containsKey(c1)) {
				if (map1.get(c1) != c2) {
					return false;
				}
			}
			if (map2.containsKey(c2)) {
				if (map2.get(c2) != c1) {
					return false;
				}
			}
			map1.put(c1, c2);
			map2.put(c2, c1);
		}
		return true;
	}
}

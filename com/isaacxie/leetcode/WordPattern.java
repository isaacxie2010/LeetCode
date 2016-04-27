package com.isaacxie.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
	// https://leetcode.com/problems/word-pattern/
	
	public boolean wordPattern(String pattern, String str) {
		if (pattern == null && str == null) {
			return true;
		}
		if (pattern == null || str == null) {
			return false;
		}
		char[] tokens = pattern.toCharArray();
		String[] values = str.split(" ");
		if (tokens.length != values.length) {
			return false;
		}
		Map<Character, String> map = new HashMap<Character, String>();
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < tokens.length; i++) {
			if (map.containsKey(tokens[i]) && values[i].equals(map.get(tokens[i]))) {
				continue;
			} else if (!map.containsKey(tokens[i]) && !set.contains(values[i])) {
				map.put(tokens[i], values[i]);
				set.add(values[i]);
			} else {
				return false;
			}
		}
		return true;
	}

}

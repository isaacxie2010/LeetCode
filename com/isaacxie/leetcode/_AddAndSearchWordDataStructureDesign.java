package com.isaacxie.leetcode;

public class _AddAndSearchWordDataStructureDesign {
	// https://leetcode.com/problems/add-and-search-word-data-structure-design
	
	class WordDictionary {
		// Use a hashMap to map length, List of Word
		Map<Integer, List<String>> map;

		/** Initialize your data structure here. */
		public WordDictionary() {
			map = new HashMap<>();
		}

		/** Adds a word into the data structure. */
		public void addWord(String word) {
			int len = word.length();
			if (!map.containsKey(len)) {
				map.put(len, new ArrayList<String>());
			}
			map.get(len).add(word);
		}

		/**
		 * Returns if the word is in the data structure. A word could contain
		 * the dot character '.' to represent any one letter.
		 */
		public boolean search(String word) {
			int len = word.length();
			if (!map.containsKey(len)) {
				return false;
			}
			List<String> list = map.get(len);
			for (String str : list) {
				if (isSame(str, word)) {
					return true;
				}
			}
			return false;
		}

		public boolean isSame(String str, String pattern) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != pattern.charAt(i) && pattern.charAt(i) != '.') {
					return false;
				}
			}
			return true;
		}

	}

}
// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
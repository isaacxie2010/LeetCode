package com.isaacxie.leetcode;

import java.util.List;

public class MiniParser {
	// https://leetcode.com/problems/mini-parser/

	public NestedInteger deserialize(String s) {
		if (!s.contains("[")) {
			return new NestedInteger(Integer.valueOf(s));
		}
		NestedInteger result = new NestedInteger();
		if(s.length() <= 2) {
			return result;
		}
		int begin = 1; // starting index
		int count = 0; // use count to make sure the nested part is complete
		for(int i = 1; i < s.length() - 1; i++) { // the first and the last is [ and ]
			if(s.charAt(i) == ',' && count == 0) { // when , & count = 0, means the nested part is complete
				result.add(deserialize(s.substring(begin, i)));
				begin = i + 1;
			}
			if(s.charAt(i) == '[') {
				count++;
			}
			if(s.charAt(i) == ']') {
				count--;
			}
		}
		result.add(deserialize(s.substring(begin, s.length() - 1))); // the remaining part not containing ,
		return result;
	}

	// -------------------------------------------------------------------------------
	// This is the interface that allows for creating nested lists.
	// You should not implement it, or speculate about its implementation
	public class NestedInteger implements NestedIntegerInterface {
		// Constructor initializes an empty nested list.
		public NestedInteger() {
		}

		// Constructor initializes a single integer.
		public NestedInteger(int value) {
		}

		@Override
		public boolean isInteger() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer getInteger() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setInteger(int value) {
			// TODO Auto-generated method stub

		}

		@Override
		public void add(NestedInteger ni) {
			// TODO Auto-generated method stub

		}

		@Override
		public List<NestedInteger> getList() {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public interface NestedIntegerInterface {

		// @return true if this NestedInteger holds a single integer, rather
		// than a nested list.
		public boolean isInteger();

		// @return the single integer that this NestedInteger holds, if it holds
		// a single integer
		// Return null if this NestedInteger holds a nested list
		public Integer getInteger();

		// Set this NestedInteger to hold a single integer.
		public void setInteger(int value);

		// Set this NestedInteger to hold a nested list and adds a nested
		// integer to it.
		public void add(NestedInteger ni);

		// @return the nested list that this NestedInteger holds, if it holds a
		// nested list
		// Return null if this NestedInteger holds a single integer
		public List<NestedInteger> getList();
	}
}

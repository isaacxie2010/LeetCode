package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandomO1 {

	Map<Integer, Integer> map; // store the val and index mapping
	List<Integer> list; // store the val sequence
	int lastIndex;
	Random random;

	/** Initialize your data structure here. */
	public InsertDeleteGetRandomO1() {
		map = new HashMap<>();
		list = new ArrayList<>();
		lastIndex = 0;
		random = new Random();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already
	 * contain the specified element.
	 */
	public boolean insert(int val) {
		if (map.containsKey(val)) {
			return false; // contains the value
		}
		map.put(val, lastIndex);
		list.add(val);
		lastIndex++;
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the
	 * specified element.
	 */
	public boolean remove(int val) {
		if (!map.containsKey(val)) {
			return false;
		}
		int index = map.get(val);
		if (index != list.size() - 1) {
			int lastValue = list.get(list.size() - 1);
			list.set(index, lastValue); // replace the value index position with
										// the last element
			map.put(lastValue, index); // update the mapping of last element
		}
		list.remove(list.size() - 1);
		map.remove(val);
		lastIndex--;
		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		int randomIndex = random.nextInt(lastIndex);
		return list.get(randomIndex);
	}
}

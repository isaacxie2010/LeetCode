package com.isaacxie.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandomO1DuplicatesAllowed {
	// https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
	
	private List<Integer> array;
    private Map<Integer, List<Integer>> map;
    private int lastIndex;
    private Random random; 
    
    /** Initialize your data structure here. */
    public InsertDeleteGetRandomO1DuplicatesAllowed() {
        array = new ArrayList<>();
        map = new HashMap<Integer, List<Integer>>();
        lastIndex = 0;
        random = new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
       boolean flag = false;
       array.add(val);
       if(!map.containsKey(val)) {
    	   map.put(val, new ArrayList<Integer>());
    	   flag = true;
       }
       map.get(val).add(lastIndex);
       lastIndex++;
       return flag;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
	public boolean remove(int val) {
		if (!map.containsKey(val)) {
			return false;
		} 
		int index = map.get(val).get(0);
		int lastElement = array.get(array.size() - 1);
		array.set(index, lastElement);
		int lastElementListIndex = map.get(lastElement).indexOf(array.size() - 1);
		map.get(lastElement).set(lastElementListIndex, index);
		array.remove(array.size() - 1);
		lastIndex--;
		map.get(val).remove(0);
		if (map.get(val).size() == 0) {
			map.remove(val);
		}
		return true;
	}
    
    /** Get a random element from the collection. */
    public int getRandom() {
      int index = random.nextInt(lastIndex);
      return array.get(index);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

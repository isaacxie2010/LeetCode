package com.isaacxie.leetcode;

public class _3SumCloset {
	// https://leetcode.com/problems/3sum-closest
	
    public int threeSumClosest(int[] nums, int target) {
        //O(nlogn)
        Arrays.sort(nums);
        int smallest = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int delta = Math.abs( sum - target);
                if(sum < target) {
                    j++;
                } 
                if(sum > target) {
                    k--;
                }
                if(sum == target) {
                    return target;
                }
                if(delta < Math.abs(smallest - target)) {
                    smallest = sum;
                }
            }
        }
        return smallest;
    }
}
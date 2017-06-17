package com.isaacxie.leetcode;

public class _3SumSmaller {
	// https://leetcode.com/problems/3sum-smaller
	
    public int threeSumSmaller(int[] nums, int target) {
        //O(nlogn)
        Arrays.sort(nums);
        int result = 0;
        // O(n^2)
        for(int i = 0; i < nums.length - 2; i++) {
            result += twoSumSmaller(nums, i + 1, target - nums[i]);
        }
        return result;
    }
    
    public int twoSumSmaller(int[] nums, int index, int target) {
        int start = index;
        int end = nums.length - 1;
        int num = 0;
        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum < target) {
                num += end - start;
                start++;
            }else {
                end--;
            }
        }
        return num;
    }
}
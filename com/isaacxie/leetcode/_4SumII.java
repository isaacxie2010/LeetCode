package com.isaacxie.leetcode;

public class _4SumII {
	// https://leetcode.com/problems/4sum-ii
	
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                if(map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                }else{
                    map.put(sum, 1);
                }
            }
        }
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                if(map.containsKey(-sum)) {
                    result += map.get(-sum);
                }
            }
        }
        return result;
    }
}
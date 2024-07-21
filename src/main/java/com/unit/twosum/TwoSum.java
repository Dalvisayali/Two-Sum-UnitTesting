package com.unit.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Finds two numbers in the array that add up to the target.
     *
     * @param nums   The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers, or an empty array if no solution is found.
     */
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the complement of each number and its index.
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the hashmap.
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the complement and the current number.
                return new int[]{numMap.get(complement), i};
            }
            // If not found, add the current number and its index to the hashmap.
            numMap.put(nums[i], i);
        }
        // Return an empty array if no solution is found.
        return new int[]{};
    }
}

package Sortiert.Leetcode;

public class TwoSum {
    
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int length = nums.length;
            int[] indices = new int[2];
    
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (nums[i] + nums[j] == target) {
                        indices[0] = i;
                        indices[1] = j;
                        return indices; // Return the indices immediately when a pair is found
                    }
                }
            }
    
            // If no such pair is found, return an array with default values (0, 0)
            return indices;
        }
    }
    
}

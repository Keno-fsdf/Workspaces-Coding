package Sortiert.Leetcode;

public class SingleNumber {
    
public static void main(String[] args) {
    
}

    public int singleNumber(int[] nums) {
        int length = nums.length;
        boolean found = false;
        int result = 0;

        for (int i = 0; i < length; i++) {
            found = false; // Reset the switch for each iteration of the outer loop

            for (int j = 0; j < length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break; // Exit the inner loop if a duplicate is found
                }
            }

            if (!found) {
                result = nums[i];
                break; // Exit the outer loop if a non-duplicate is found
            }
        }

        return result;
    } }


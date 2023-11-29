package Sortiert.Leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
     int[] nums = {0,1,2,2,3,0,4,2};
     int val = 2;
    removeElement(nums, val);


    
    }

    public static int removeElement(int[] nums, int val) {
        //Sortieren der Liste
        for (int i = 1; i<nums.length; i++) {
            int j = i-1;
            int zwischenspeicher = nums[i];

            while (j>=0 && nums[j]>zwischenspeicher) {

                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = zwischenspeicher;

        }

        //Jetzt haben wir eine soriterte Liste 
        int zähler = 0;
        int größterWert = nums[nums.length-1]+1;
        
        for (int z = 0; z<nums.length; z++) {
            if (nums[z]==val) {nums[z] = größterWert; System.out.println(nums[z]); }
            if (nums[z]!=val) zähler++;

        }

        System.out.println(java.util.Arrays.toString(nums));
        for (int k = 1; k<nums.length; k++) {
            int m = k-1;
            int zwischenspeicher = nums[k];

            while (m>=0 && nums[m]>zwischenspeicher) {

                nums[m+1] = nums[m];
                m--;
            }
            nums[m+1] = zwischenspeicher;

        }
        return zähler;




    }
    
}



public class testAcht {
    public static void main(String[] args) {
        System.out.println("a");

    }

    public int removeDuplicates(int[] nums) {
        int zähler = 0;
        int zwischenspeicher = nums[nums.length-1]+1;
        for (int i = 0; i+1<nums.length; i++) {
            int j = i +1;
            
            if (nums[i] == nums[j]) {
                nums[i] = zwischenspeicher;
    
            } }
        // upper code checks if the are, and if so eplaces the left value with e.g 5
            
        for (int elemente: nums) {
            if (elemente<zwischenspeicher )zähler++;
        }
        
        return zähler;







    
}
    }
package Sortiert.Leetcode;

public class Top_K_Element_Algo {
    public static void main(String[] args) {
        int[] array = {5, 1, 13, 8};
        int k = 4;

        int[] kLargestElements = topKElements(array, k);

        System.out.print("Die " + k + " größten Elemente sind: ");
        for (int element : kLargestElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] topKElements(int[] nums, int k) {
        // Initialisiere ein Array, um die K größten Elemente zu behalten
        int[] result = new int[k];

        // Fülle das Array mit den ersten K Elementen der Liste
        for (int i = 0; i < k; i++) {
            result[i] = nums[i];
        }

        // Durchlaufe den Rest der Liste
        for (int i = k; i < nums.length; i++) {
            // Finde das kleinste Element im bisherigen Ergebnis
            int minIndex = findMinIndex(result);

            // Wenn das aktuelle Element größer ist als das kleinste Element im Ergebnis
            if (nums[i] > result[minIndex]) {
                // Ersetze das kleinste Element mit dem aktuellen Element
                result[minIndex] = nums[i];
            }
        }

        return result;
    }

    // Hilfsfunktion, um den Index des kleinsten Elements in einem Array zu finden
    private static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
}

package Sortiert.Leetcode;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {-64, 34, 25, 12, 22, 11, 90};

        insertionSort(array);

        System.out.println("Sortiertes Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {  //fängt mit Index 1, an da das erste element bereits als sortiert angessehen wird.
            int key = arr[i];           //key ist der wert bei Index 1    //i = 1
            int j = i - 1;              // j = 0      //j ist der Zeiger der auf das vorherige element gesetzt wird

            // Verschiebe Elemente, die größer als key sind, nach rechts
            while (j >= 0 && arr[j] > key) {   //während 0 größergleich 0 ist  &&  wenn der 0-Index Größen als der 1-Index ist
                arr[j + 1] = arr[j]; // Der zweite Index ist der ersten Index
                j = j - 1;              //j --;
            }
            arr[j + 1] = key;       // //der erste Index ist der zeiger
        }
    }
    
}

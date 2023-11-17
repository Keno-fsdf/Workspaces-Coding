package Sortiert.Leetcode;

public class InsertionsSortSelber {

    public static void main(String[] args) {
        int[] array = {-64, 34, 25, 12, 22, 11, 90};

        insertionSort(array);

        System.out.println("Sortiertes Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    
    //      3          5
    //      5          3
    public static void insertionSort(int[]arr) {
        int länge = arr.length;

        for (int i = 1; i<länge; ++i) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr [j+1] = key;

        }



    }}
    
// public static void insertionSorts (int[] liste) {

//     int länge = liste.length;
//     for( int i = 1; i<länge; ++i) {
//     int zwischenspeicher = liste[i];
    
//     int j = i-1;
 
//     while (j>=0 && liste[j]> zwischenspeicher) {
//     liste [i] = liste[j];
//     //hab das gefühl das ich hier was vergessen habe
//     j--;
    
    
//     }
//     liste[i] = zwischenspeicher;
    




// }}}

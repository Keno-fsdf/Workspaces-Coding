package Sortiert.Leetcode;

public class verschiedeneSortierAlgos {
    public static void main(String[] args) {
        int[] array = {6,3,8,9,-1,8,3,-5545,4,6,87};

        Insertionsortieren(array);

        System.out.println("Sortiertes Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }





    public static void bubbleSort (int[]liste) {
        
        
        for (int i = 0; i<liste.length; i++) {
            // int minimum = liste[i];
            // System.out.println(minimum);  //-->wir benutzen minimum als zwischenspeicher
            for (int j = 1 +i; j<liste.length; j++) { //minimum = 34,  liste[i] = -64, liste[j] = 34
                if (liste[i]>liste[j]) { int minimum = liste[i]; liste [i] = liste[j]; liste[j] = minimum;  //mein bubblesort -->bei dem if statement ">" umändern um andersherum zu sortiern
            }
            
        }
    
    }


    }



        public static void selectionSort(int[] liste) {
        for (int i = 0; i < liste.length - 1; i++) {
            int minIndex = i;
    
            for (int j = i + 1; j < liste.length; j++) {
                if (liste[j] < liste[minIndex]) {
                    minIndex = j;
                }
            }
    
            // Swap liste[j] and liste[minIndex]
            int temp = liste[i];
            liste[i] = liste[minIndex];
            liste[minIndex] = temp;
        }}
    


    








    

    public static void Insertionsortieren (int[]nums ) {
        // int länge = liste.length;

        // for (int i = 1; i<länge; i++) {
        //     int zwischenspeicher = liste[i];
        //     int j = i-1; //zeiger

        //     while (j>=0 && liste[j]> zwischenspeicher) {     //verschiebt die element nach links
        //         liste[j+1] = liste[j];
        //         j--;


        //     }
        //     liste [j+1] = zwischenspeicher;



        // }
        for (int i = 1; i<nums.length; i++) {
            int j = i-1;
            int zwischenspeicher = nums[i];

            while (j>=0 && nums[j]>zwischenspeicher) {

                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = zwischenspeicher;

        }




    }
}

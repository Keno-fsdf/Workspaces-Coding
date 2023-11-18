package Sortiert.Leetcode;

public class verschiedeneSortierAlgos {
    public static void main(String[] args) {
        int[] array = {34, -64, 25, 102, -220, 11, 90};

        bubbleSort  (array);

        System.out.println("Sortiertes Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }





    public static void bubbleSort (int[]liste) {
        
        
        for (int i = 0; i<liste.length; i++) {
            int minimum = liste[i];
            // System.out.println(minimum);  //-->wir benutzen minimum als zwischenspeicher
            for (int j = 1 +i; j<liste.length; j++) { //minimum = 34,  liste[i] = -64, liste[j] = 34
                if (liste[i]>liste[j]) { minimum = liste[i]; liste [i] = liste[j]; liste[j] = minimum;  //mein bubblesort -->bei dem if statement ">" umändern um andersherum zu sortiern
            }
            
        }
    
    }


    }



        public static void selectionSort(int[] liste) {
        for (int j = 0; j < liste.length - 1; j++) {
            int minIndex = j;
    
            for (int i = j + 1; i < liste.length; i++) {
                if (liste[i] < liste[minIndex]) {
                    minIndex = i;
                }
            }
    
            // Swap liste[j] and liste[minIndex]
            int temp = liste[j];
            liste[j] = liste[minIndex];
            liste[minIndex] = temp;
        }}
    


    








    

    public static void Insertionsortieren (int[]liste ) {
        int länge = liste.length;

        for (int i = 1; i<länge; i++) {
            int zwischenspeicher = liste[i];
            int j = i-1; //zeiger

            while (j>=0 && liste[j]> zwischenspeicher) {     //verschiebt die element nach links
                liste[j+1] = liste[j];
                j--;


            }
            liste [j+1] = zwischenspeicher;



        }


    }
}

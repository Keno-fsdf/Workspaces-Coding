package Sortiert.Leetcode;

public class testVier {
    public static void main(String[] args) {
        int[] array = {-64, 34, 25, 102, -220, 11, 90};

        selectionSort(array);

        System.out.println("Sortiertes Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }





    public static void bubbleSort (int[]liste) {
        
        
        for (int i = 0; i<liste.length; i++) {
            int minimum = liste[i];
            for (int j = 1 +i; j<liste.length; j++) {
                if (liste[i]>liste[j]) { minimum = liste[i]; liste [i] = liste[j]; liste[j] = minimum;  //mein bubblesort -->bei dem if statement ">" umändern um andersherum zu sortiern
            }
            
        }}


    }

    public static void selectionSort (int[] liste) {
        for (int j = 0; j<liste.length; j++) {
        int minimum = liste[j];
        int zwischenspeicher = liste[j];
        for (int i = j+1; i<liste.length; i++) {
            if (liste[i]<minimum) { minimum = liste[i];}


        }
        // liste[j] = liste[minimum];
        // liste[minimum] = zwischenspeicher;
    
    }


    }

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

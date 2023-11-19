package Sortiert.Leetcode;

public class bubbleSortÜbung {
    public static void main(String[] args) {
        
    
    int[] liste = {6,3,8,9,-1,8,3,-5545,4,6,87};
    SelectionSort(liste);
    for (int elemente: liste) System.out.print(elemente + " ");
    }
    public static void bubblesort (int[] liste) {
        for (int i = 0; i<liste.length; i++) {
            for (int j = 1+i; j<liste.length; j++) {
                if (liste[i]<liste[j]) { int temp = liste[i]; liste[i] = liste[j]; liste[j] = temp;


                }

            }


        }
        


    }


    public static void bubbleSort(int[] liste) {

        for (int i = 0; i<liste.length; i++) {
        
        for (int j = 1+i; j <liste.length; j++){
            if (liste[i]>liste[j]) {
            int temp = liste[i];
            liste[i] = liste[j];
            liste[j] = temp;
            }
        }
        
        }
        
        
        }

public static void InsertionsSort(int[]array) { //zwei pointers (i und j) = zwei for schleifen
    for (int i = 1; i< array.length; i++) {
        int zwischenspeicher = array[i];
        int j = i-1;
        
        while (j>=0 && zwischenspeicher>array[j] ) {
            array[j+1] = array[j];
            j--; 
        }
        
        array[j+1] = zwischenspeicher; 
    }


}

public static void SelectionSort(int[]array) {
    for (int i = 0; i<array.length; i++) {
        int minIndex = i;
        for (int j = 1+i; j<array.length; j++) {
        if (array[j]>array[minIndex]) {minIndex = j;  }	
        }
        
        //swaping the two values 
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
        
        }

}



  
        
    
}




package Sortiert.Leetcode;

public class bubbleSortÜbung {
    public static void main(String[] args) {
        
    
    int[] liste = {6,3,8,9,-1,8,3,-5545,4,6,87};
    bubbleSort6(liste);
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


public static void bubbleSort3 (int[] liste) {

    for (int i = 0; i<liste.length; i++){
    for (int j = 1+i; j<liste.length; j++) {
    if (liste[i]>liste[j]) {
    int temp = liste[i];
    liste[i] = liste[j];
    liste[j] = temp;
    
    }
    
    }
    
    }
    
    
    }


    public static void insertionssort3 (int[] liste) {

        for (int i = 1; i<liste.length; i++) {
        
        int zwischenspeicher = liste[i];
        int j = i-1;
        
        while (j>=0 && liste[j]>zwischenspeicher) {
        liste[j+1] = liste[j];
        j--;
        
        }
        
        liste [j+1] = zwischenspeicher;
         
        }
        
        
        }


        public static void SelectionSort2 (int[] array){
            for (int i = 0; i<array.length; i++) {
            int minIndex = i;
            
            for (int j = 1+i; j<array.length; j++) {
            if (array[minIndex]<array[j]) minIndex = j;
            
            }
            
            //zwei variablen switchen
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            
            
            
            }
            }

            public static void bubbleSort5 (int[]array) {
                for (int i = 0; i<array.length; i++) {
                for (int j = 1+i; j<array.length; j++) {
                if ( array[i]<array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                
                }
                
                }
                
                }
                
                }

                public static void insertionSort3(int[] liste) {
                    for (int i = 1; i<liste.length; i++) {
                    int temp = liste[i];
                    int j = i-1;
                    
                    while (j>=0 && liste[j] > temp) {
                    liste[j+1] = liste[j];
                    j--;
                    }
                    
                    
                    liste[j+1] = temp;
                    
                    
                    }
                    
                    
                    }
                    
                    public static void selectionSort(int[] liste) {
                        for (int i=0; i<liste.length; i++) {
                        int minIndex = i;
                        
                        for (int j = i+1; j<liste.length; j++) {
                        
                        if (liste[j]<liste[minIndex]) {
                        minIndex = j;
                        
                        }
                        
                        }
                        
                        int temp = liste[minIndex];
                        liste[minIndex] = liste[i];
                        liste[i] = temp;
                        
                        
                        
                        
                        }
                        
                        
                        
                        
                        
                        }
                

                        public static void bubbleSort6 (int[] array) { 
                            for (int i = 0; i< array.length; i++) {
                            for (int j = 1+i; j< array.length; j++) {
                            if (array[i]<array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                            
                            }
                            
                            
                            }
                            
                            
                            
                            }
                            }



  
        
    
}




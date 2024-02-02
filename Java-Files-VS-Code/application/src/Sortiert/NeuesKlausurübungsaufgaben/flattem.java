package Sortiert.NeuesKlausurübungsaufgaben;

public class flattem {
    public static int[] flatten(int[][] array) {
        int length = 0;
        for (int[] a : array) {
            length += a.length;
        }
    
        int[] neuesArray = new int[length];
        int index = 0;
    
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                neuesArray[index] = array[i][j];
                index++;
            }
        }
        return neuesArray;
    }
    




        public static void main(String[] args) {
            // Beispiel 2D-Array
            int[][] testArray = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
    
            // Teste die flatten-Methode
            int[] flattenedArray = flattem.flatten(testArray);
    
            // Ausgabe des Original-Arrays
            System.out.println("Original 2D-Array:");
            for (int[] row : testArray) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
    
            // Ausgabe des flatten-Arrays
            System.out.println("\nFlattened Array:");
            for (int value : flattenedArray) {
                System.out.print(value + " ");
            }
        
        
        
    
}}

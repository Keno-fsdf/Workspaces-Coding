package Sortiert.KlausurÜbungsaufgabenZwe;

public class MergeA2DArrayIntoA1DArray {
    

    public static int[] flattern (int[][]array) {
        int länge = 0;
        
     // Calculate the length of the flattened array
     for (int[] elemente : array) {
        länge += elemente.length;
    }


        int[] neueArray = new int[länge];
        int k = 0;
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                neueArray[k] = array[i][j];
                k++;
            }



        }
        return neueArray;

 

    }

    public static void main(String[] args) {
               int[][] quadratischesArray = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9}
        };

        int [] array = flattern(quadratischesArray);
        for (int is : array) {
            System.out.println(is + " ");
        }

    }
}

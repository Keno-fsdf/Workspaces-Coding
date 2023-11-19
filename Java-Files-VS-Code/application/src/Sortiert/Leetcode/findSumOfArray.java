package Sortiert.Leetcode;

public class findSumOfArray {
    public static void main(String[] args) {
        // int []liste = {3,-5,8};
        // System.out.println(summe(liste));
        int [][] twoDarray = {{-1,1}, {2,2}};
        System.out.println(summeVon2Darray(twoDarray));
    }

    public static int summe(int[] liste) {
        int summe = 0;
        
        for (int elemente:liste) {
            summe+=elemente;



        }
        return summe;
    }
    
    public static int summeVon2Darray (int[][]liste) {
        int summe = 0;
        for (int[] row : liste) {
            for (int  is : row) {
                summe+= is;
                
            }
            
        }
        return summe;

    }
}

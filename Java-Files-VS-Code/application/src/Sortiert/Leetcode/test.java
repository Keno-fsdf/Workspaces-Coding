package Sortiert.Leetcode;

public class test {
    public static void main(String[] args) {
        int[] array = {-64, 34, 25, 12, 22, 11, 90};

        sortieren(array);

        System.out.println("Sortiertes Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }



    public static void sortieren (int[] liste) {
        int länge = liste.length;

        for (int i = 1; i<länge; i++) {
            int zwischenspeicher = liste[i];

            int j = i-1;

            while (j>=0 && liste[j]>zwischenspeicher) {
                liste[j+1] = liste[j];  //wieso ist j+1 nicht das gleiche wie i


                j--;   //deswegen hier -->Deswegen kann man j nicht mit i austauschen   


            }
            liste[j+1] = zwischenspeicher;  //wenn es die while schleife nicht geben würde, dann wären j+1 und i austauschbar



        }


    }



}

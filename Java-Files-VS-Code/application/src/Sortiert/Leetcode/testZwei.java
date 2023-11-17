package Sortiert.Leetcode;

public class testZwei {
    public static void main(String[] args) {
        int[] array = {-64, 34, 25, 12, 22, 11, 90};

        sortieren(array);

        System.out.println("Sortiertes Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    
    public static void sortieren(int[] liste) {

        int länge = liste.length;

        for (int i = 1; i<länge; i++) {
            int zwischenspeicher = liste[i];
            int j = i-1;


            while (j>=0 && liste[j]>zwischenspeicher) {
                liste[j+1] = liste[j];
                j--;

                //ich versteh j nicht wegen der while schleife
            }
            //zweiter durchlauf "j" ist hier 0 und nicht 1
            //ich versteh nicht welcher wert j an diesem punkt hat
            liste [j+1] = zwischenspeicher; //deswegen versteh ich auch nciht wieso j+1 -->Wir wollen halt den linken wert eigentlich erstetzen
            System.out.println(java.util.Arrays.toString(liste));



        }



    }



}

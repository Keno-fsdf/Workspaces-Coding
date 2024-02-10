package Sortiert.SiebteLektion;

public class Sieb {
    public static void main(String[] args) {
        int []zahlenArray = fillArray(30);
        int []primzahlArray = sieve(zahlenArray);
        showContent(primzahlArray);
        // System.out.println("Array: " + java.util.Arrays.toString(primzahlArray));
    }

    public static int[] fillArray (int Obergrenze) {
        int[] liste = new int[Obergrenze];
        int i = 0;
        for (;i<Obergrenze;i++) {
            liste[i] = i+1;

        }

        return liste;


    } 


    public static int[] sieve (int[] zahlenArray) {
        zahlenArray[0] = -1;

        for (int i = zahlenArray.length; i>3; i--) {
            // System.out.println(i);
            int zahlMinus = i-1;
            int berechnung = zahlenArray[zahlMinus]%2;
            int berechnung2 = zahlenArray[zahlMinus]%3;
            if (berechnung==0) {
                zahlenArray [zahlMinus] = -1;
            }
            if (berechnung2==0) {
                zahlenArray [zahlMinus] = -1;
            }
        }

        return zahlenArray;


    }

    public static void showContent (int[]gefilterteArray) {
        int counter = 0;
        while (counter<gefilterteArray.length) {
            if (gefilterteArray[counter]==-1) System.out.println(counter+1 + " ist keine Primzahl");
            else System.out.println(counter+1 + " ist eine Primzahl");



            counter++;


        }


    }
    
}

package Sortiert.KlausuraufgabenÜbung;

public class testLetztesZeichen {
    public static void main(String[] args) {
        
        String a = "Apfel";
        String b = "Bananals";

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        boolean letztesZeichenGleich = arrayA[arrayA.length-1] == arrayB[arrayB.length-1];
        System.out.println(letztesZeichenGleich);
    }
}

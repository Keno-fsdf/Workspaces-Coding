package Sortiert.NeuesKlausurübungsaufgaben;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Testen der fifthy-Methode
        boolean result = fifthy();
        System.out.println("fifthy(): " + result);

        // Testen der sortListee-Methode
        int[] array = {4, 2, 7, 1, 5};
        System.out.println("Unsortiertes Array: " + Arrays.toString(array));
        
        sortListee(array);
        
        System.out.println("Sortiertes Array: " + Arrays.toString(array));

        // Testen der pow-Methode
        double basis = 2.0;
        int potenz = 3;
        double powerResult = pow(basis, potenz);
        System.out.println("pow(" + basis + ", " + potenz + "): " + powerResult);
    }

    public static boolean fifthy() {
        return Math.random() < 0.5;
    }

    public static void sortListee(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static double pow(double basis, int potenz) {
        double ergebnis = 1;
        while (potenz > 0) {
            ergebnis *= basis;
            potenz--;
        }
        return ergebnis;
    }
}

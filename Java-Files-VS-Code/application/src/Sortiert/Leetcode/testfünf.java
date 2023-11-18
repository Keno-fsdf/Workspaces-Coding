package Sortiert.Leetcode;

import java.util.List;

public class testfünf {
    public static void bubbleSort(List<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.size() - 1 - i; j++) {
                if (liste.get(j) > liste.get(j + 1)) {
                    // Tausche Elemente, wenn sie in falscher Reihenfolge sind
                    int temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Beispielaufruf der Methode
        List<Integer> myList = List.of(64, 34, 25, 12, 22, 11, 90);
        bubbleSort(myList);

        // Ausgabe der sortierten Liste
        System.out.println("Sortierte Liste: " + myList);
    }
    
}

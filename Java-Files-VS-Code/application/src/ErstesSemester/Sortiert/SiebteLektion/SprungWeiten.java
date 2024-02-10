package Sortiert.SiebteLektion;

public class SprungWeiten {

    public static void main(String[] args) {
        int distanz = 5;
        int sprungweite1 = 3;
        int sprungweite2 = 2;

        int anzahlMoeglichkeiten = springeInMehrerenSpruengen(distanz, sprungweite1, sprungweite2);

        System.out.println("Anzahl der Möglichkeiten: " + anzahlMoeglichkeiten);
    }

    // Methode zur Berechnung der Anzahl der Möglichkeiten, die Distanz zu überbrücken
    private static int springeInMehrerenSpruengen(int distanz, int sprungweite1, int sprungweite2) {
        // Überprüfung, ob die Sprungweiten nicht negativ oder 0 sind
        if (sprungweite1 <= 0 || sprungweite2 <= 0) {
            throw new IllegalArgumentException("Sprungweiten müssen größer als 0 sein.");
        }

        // Initialisierung des Arrays zur Speicherung der Anzahl der Möglichkeiten für jede Distanz
        int[] moeglichkeiten = new int[distanz + 1];
        moeglichkeiten[0] = 1; // Es gibt eine Möglichkeit, die Distanz 0 zu überbrücken

        // Berechnung der Anzahl der Möglichkeiten für jede Distanz von 1 bis zur gegebenen Distanz
        for (int i = 1; i <= distanz; i++) {
            if (i - sprungweite1 >= 0) {
                moeglichkeiten[i] += moeglichkeiten[i - sprungweite1];
            }

            if (i - sprungweite2 >= 0) {
                moeglichkeiten[i] += moeglichkeiten[i - sprungweite2];
            }
        }

        // Die Anzahl der Möglichkeiten für die gegebene Distanz
        return moeglichkeiten[distanz];
    }
}
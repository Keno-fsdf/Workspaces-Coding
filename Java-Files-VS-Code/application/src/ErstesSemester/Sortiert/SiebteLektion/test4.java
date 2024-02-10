package Sortiert.SiebteLektion;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach der Anzahl der Werte fragen
        System.out.print("Anzahl der einzulesenden Werte: ");
        int anzahlWerte = scanner.nextInt();

        // Fehlermeldung ausgeben und das Programm beenden, wenn die Anzahl ungültig ist
        if (anzahlWerte <= 0) {
            System.out.println("Fehler: Die Anzahl der Werte muss größer als 0 sein.");
            scanner.close();
            return;
        }

        // Array für die Messwerte erstellen
        double[] messwerte = new double[anzahlWerte];

        // Benutzer nach den Messwerten fragen und das Array füllen
        for (int i = 0; i < anzahlWerte; i++) {
            System.out.print((i + 1) + ". Wert: ");
            messwerte[i] = scanner.nextDouble();
        }

        // Arithmetischer Mittelwert, Minimum und Maximum berechnen
        double summe = 0;
        double minimum = messwerte[0];
        double maximum = messwerte[0];

        for (double wert : messwerte) {
            summe += wert;

            if (wert < minimum) {
                minimum = wert;
            }

            if (wert > maximum) {
                maximum = wert;
            }
        }

        double mittelwert = summe / anzahlWerte;

        // Standardabweichung berechnen
        double summeQuadDiff = 0;
        for (double wert : messwerte) {
            summeQuadDiff += Math.pow(wert - mittelwert, 2);
        }
        double standardabweichung = Math.sqrt(summeQuadDiff / anzahlWerte);

        // Ergebnisse ausgeben
        System.out.println("Messwerte: " + Arrays.toString(messwerte));
        System.out.println("Anzahl der Werte: " + anzahlWerte);
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Standardabweichung: " + standardabweichung);

        // Scanner schließen
        scanner.close();
    }
}


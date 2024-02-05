package Sortiert.NeuesKlausurübungsaufgaben;

import java.util.Scanner;



public class Übung {

    public static int liesZahl() {
        boolean gueltigeEingabe = false;
        String eingabe = "";

        while (!gueltigeEingabe) {
            Scanner scanner = new Scanner(System.in);
            eingabe = scanner.nextLine();

            char[] array = eingabe.toCharArray();
            gueltigeEingabe = true; // Setze auf true, es sei denn, die Bedingung im nächsten Schritt trifft zu

            for (char element : array) {
                if (element != ' ' && (element < '0' || element > '9')) {
                    gueltigeEingabe = false; // Setze auf false, wenn ein ungültiges Zeichen gefunden wird
                    // break; // Beende die Schleife, da eine ungültige Eingabe gefunden wurde
                }
            }

            if (!gueltigeEingabe) {
                System.out.println("Ungültige Eingabe. Bitte gib eine Zahl ein.");
            }
        }


        int ergebnis = Integer.valueOf(eingabe);
        return ergebnis;
    }

    public static void main(String[] args) {
        System.out.println("Gib eine Zahl ein:");
        int zahl = Übung.liesZahl();
        System.out.println("Die eingelesene Zahl ist: " + zahl);
    }
}

package Sortiert.SiebteLektion;

import java.util.Arrays;
import java.util.Scanner;

public class arithemtialMittel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte:");
        int anzahlDerWerte = scanner.nextInt();

        if (anzahlDerWerte <= 0) {
            System.out.println("Eingebener Wert ist zu klein. Er muss größer als 0 sein");
            scanner.close();
            return;
        }

        double zahlen[] = new double[anzahlDerWerte];
        int zwischenspeicher = 0;

        while (zwischenspeicher < anzahlDerWerte) {
            System.out.println("Geben Sie den " + (zwischenspeicher + 1) + ". Wert an: ");
            zahlen[zwischenspeicher] = scanner.nextDouble();
            zwischenspeicher++;
        }

        double minimum = zahlen[0];
        double maximum = zahlen[0];
        double summe = zahlen[0]; // Ist für Mittelwert
        double quadDistanz = 0;
        for (int i = 1; i < zahlen.length; i++) {
            summe = summe + zahlen[i];

            if (zahlen[i] < minimum) {
                minimum = zahlen[i];
            }

            if (zahlen[i] > maximum) {
                maximum = zahlen[i];
            }
            // double distanz = zahlen[i] -mittelwert
            
           

        }
        
        double mittelwert = summe / zahlen.length;

        for (int i = 0; i<zahlen.length; i++) {
         double distanz = zahlen[i] -mittelwert;
         quadDistanz = quadDistanz+ (distanz*distanz); }
        double standardabweichung = Math.sqrt(quadDistanz / zahlen.length ); 
        



        System.out.println(Arrays.toString(zahlen));
        System.out.println("Standardsabweichung: " + standardabweichung);
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Summe: " + summe);

        // Scanner schließen
        scanner.close();
    }
}
package Sortiert.SiebteLektion;

import java.util.Arrays;
import java.util.Scanner;

public class arithemtialMittel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte:");
        int anzahlDerWerte = scanner.nextInt();


        // Überprüft ob mehr als 0 Werte vom Benutzer eingeben wurden
        if (anzahlDerWerte <= 0) {
            System.out.println("Eingebener Wert ist zu klein. Er muss größer als 0 sein");
            scanner.close();
            return;
        }


        











        double zahlen[] = new double[anzahlDerWerte];  //array = {3,6; 5,5

        int zwischenspeicher = 0;

        
            

        while (zwischenspeicher < anzahlDerWerte) {  // zwischenspeicher = 1   < anzahlDerWerte = 3
            System.out.println("Geben Sie den " + (zwischenspeicher + 1) + ". Wert an: ");
            zahlen[zwischenspeicher] = scanner.nextDouble();
            zwischenspeicher++;
        }





        double minimum = zahlen[0];  // minimum = 3,6

        double maximum = zahlen[0]; // maximum = 3,6 
        double summe = zahlen[0]; // Ist für Mittelwert
     



        for (int i = 1; i < zahlen.length; i= i+1) {
           
            summe = summe + zahlen[i];  //hier berechene ich die summe aller werte in der array
            // 9,1 = 3,6 + 5,5 
            //summe = 9,1 

            //9,1 = 9,1 + 6,6 
            //summe = 15,7


            if (zahlen[i] < minimum) {  // 2 < 3,6
                minimum = zahlen[i]; //minimum = 2
            }

            if (zahlen[i] > maximum) {
                maximum = zahlen[i];
            }
           
           

        }

        double quadDistanz = 0;
        double mittelwert = summe / zahlen.length;  //  2+ 3, 6 = 9  /3  --> 3

        for (int i = 0; i<zahlen.length; i++) {

         double distanz = zahlen[i] -mittelwert;   // 3,6 - 3,5333 
         quadDistanz = quadDistanz+ (distanz*distanz); }



    double standardabweichung = Math.sqrt(quadDistanz / zahlen.length); 

   
        



        // System.out.println(Arrays.toString(zahlen));
        System.out.println("Standardsabweichung: " + standardabweichung);
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        // System.out.println("Summe: " + summe);

        // Scanner schließen
        scanner.close();
        
    }
}
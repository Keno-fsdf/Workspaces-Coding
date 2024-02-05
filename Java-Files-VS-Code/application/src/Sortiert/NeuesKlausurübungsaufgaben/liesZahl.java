package Sortiert.NeuesKlausurübungsaufgaben;

import java.util.Scanner;

public class liesZahl {
    
 

public static int liesZahl() {
boolean gueltigeEingabe = false;
String eingabe = "";
while (!gueltigeEingabe) {
gueltigeEingabe = true;
Scanner scanner = new Scanner(System.in);
eingabe = scanner.nextLine();


char[] array = eingabe.toCharArray();

for (char element: array) {
if (element!= ' ' &&   (element < '0' || element > '9')) {
gueltigeEingabe =false; 
}
}
}


System.out.println("a");
int ergebnis = Integer.valueOf(eingabe);
return ergebnis;
}




public static void main(String[] args) {
    System.out.println("Bitte geben Sie eine Zahl ein:");
    
    // Aufruf der liesZahl-Methode
    int zahl =liesZahl();

    // Ausgabe des Ergebnisses
    System.out.println("Die eingegebene Zahl ist: " + zahl);
}

 
}



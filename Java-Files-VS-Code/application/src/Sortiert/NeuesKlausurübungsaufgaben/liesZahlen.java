package Sortiert.NeuesKlausurübungsaufgaben;

import java.util.Scanner;

public class liesZahlen {
    public static void main(String[] args) {
       liesZahlens(); 
    }

public static int liesZahlens () {
Scanner scanner = new Scanner (System.in);
while (true) {
try {
String eingabe = scanner.nextLine();

    int NeueEingabe = Integer.valueOf(eingabe);
    return NeueEingabe;

}

catch (Exception e) { System.out.println ("Ungültige Eingabe"); }}}
}

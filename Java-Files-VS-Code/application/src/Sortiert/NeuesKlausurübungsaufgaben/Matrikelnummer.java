package Sortiert.NeuesKlausurübungsaufgaben;

public class Matrikelnummer {


    public static void main(String[] args) {
        // Testfall 1: Gültige Matrikelnummer
        int gueltigeMatrikelnummer = 5123456;
        if (Matrikelnummer.ueberpruefeGueltig(gueltigeMatrikelnummer)) {
            System.out.println("Die Matrikelnummer " + gueltigeMatrikelnummer + " ist gültig.");
        } else {
            System.out.println("Die Matrikelnummer " + gueltigeMatrikelnummer + " ist ungültig.");
        }

        // Testfall 2: Ungültige Matrikelnummer (falsche Länge)
        int ungueltigeMatrikelnummer1 = 123;
        if (Matrikelnummer.ueberpruefeGueltig(ungueltigeMatrikelnummer1)) {
            System.out.println("Die Matrikelnummer " + ungueltigeMatrikelnummer1 + " ist gültig.");
        } else {
            System.out.println("Die Matrikelnummer " + ungueltigeMatrikelnummer1 + " ist ungültig.");
        }

        // Testfall 3: Ungültige Matrikelnummer (falscher Studiengang)
        int ungueltigeMatrikelnummer2 = 6223456;
        if (Matrikelnummer.ueberpruefeGueltig(ungueltigeMatrikelnummer2)) {
            System.out.println("Die Matrikelnummer " + ungueltigeMatrikelnummer2 + " ist gültig.");
        } else {
            System.out.println("Die Matrikelnummer " + ungueltigeMatrikelnummer2 + " ist ungültig.");
        }
    }

    public static boolean ueberpruefeGueltig (int zahl) {

        String a = String.valueOf (zahl);
        if (a.length()!=7) 
        return false;
        
 
        
        if (a.charAt(0) != '5' && a.charAt(0) !='6') 
        return false;
        
        if (a.charAt(1) !='0' && a.charAt(1)!='1') return false;
        
        return true;
        
        
        
        }
}

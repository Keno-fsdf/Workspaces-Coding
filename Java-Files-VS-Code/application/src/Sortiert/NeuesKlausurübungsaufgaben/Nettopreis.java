package Sortiert.NeuesKlausurübungsaufgaben;

public class Nettopreis {

    public static double berechneNettopreis(double bruttopreis, double steuersatz) {
        double ergebnis = bruttopreis / ((steuersatz + 1) * 100);
        return ergebnis;
    }

    public static void main(String[] args) {
        double ausgabe = berechneNettopreis(1.07, 0.07);
        System.out.println(ausgabe);
        // System.out.println("\e");
    }
}

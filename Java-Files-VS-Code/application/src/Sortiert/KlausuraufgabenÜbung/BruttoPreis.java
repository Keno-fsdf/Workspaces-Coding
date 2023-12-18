package Sortiert.KlausuraufgabenÜbung;

public class BruttoPreis {

    public static void main(String[] args) {
        System.out.println(berechneNettopreis(1.07, 0.07));
    }
    


    public static double berechneNettopreis(double bruttoPreis, double steuersatz) {
        steuersatz = steuersatz*100;
        double teiler = 100 + steuersatz;
        double netto = (bruttoPreis/teiler)*100;
        return netto;

    }
    
}

package Sortiert.NeuesKlausurübungsaufgaben;

public class factorial {
    

    public static void main(String[] args) {
        // Beispielaufruf der fac-Methode
        double result = fac(5);
        System.out.println("Fakultät: " + result);
    }


    

    public static double fac(double n) {
        double zwischenergebnis = 0;
        double ergebnis = 1;
        
        for (int i = 1; i<n; i++) {
        zwischenergebnis = i;
        ergebnis *=zwischenergebnis; }
        
        return ergebnis;

    }}


    



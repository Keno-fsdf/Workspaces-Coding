package Sortiert.KlausurÜbungsaufgabenZwe;

public class ProzentBerechnung {
    public static double berechneProzent(double basis, double anteil) {
        if ( basis<=0 || anteil<=0) return -1.0;
        double ergebnis = basis*(anteil/100);
        return ergebnis; }

        public static void main(String[] args) {
            System.out.println(berechneProzent(250, -10));
        }
        
        
}

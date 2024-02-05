package Sortiert.NeuesKlausurübungsaufgaben;

public class Alkohol {
    public static double berechneMasse(int v, double e ) {
        final double DICHTE = 0.8;
        double ergebnis = v*e*DICHTE;
        return ergebnis; }
        
        public static double berechneAlkKonzentration (double A, double m, char geschlecht ) {
        if (geschlecht != 'm' && geschlecht != 'w' && geschlecht !='j') {System.out.println ("ungültiger Geschlechts Parameter") ; return -1.0; }
        

        else {
            
        double r = 0.0;
        if (geschlecht == 'm') r = 0.7;
        if (geschlecht =='w') r = 0.6;
        if (geschlecht =='j') r = 0.5;
        double ergebnis = A/(m*r);
        return ergebnis; }}
        
        
        public static void main (String [] args) {
        double beer = berechneMasse (1000, 0.001);
        System.out.println ("Die Alkoholmasse von beer beträgt: " + beer);
        double konzentration = berechneAlkKonzentration (beer, 70, 'm');
        if (konzentration>=0.5) {
        System.out.println ( "Sie dürfen kein Auto mehr fahren!!!"); }
        else if (konzentration>=0.3) {
        System.out.println ("Sie sollten kein Auto mehr fahren!!!"); }}
}

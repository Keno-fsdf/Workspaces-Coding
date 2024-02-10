package Sortiert.NeuesKlausurübungsaufgaben;

public class berechnung {


    public static void main(String[] args) {
        double result = berechnungs(5);
        System.out.println("Ergebnis der Berechnung: " + result);
    }


public static double berechnungs(double n) {

double zwischenergebnis = 0;
double ergebnis = 0;

for (int u = 3; u <= n; u++) {

zwischenergebnis = 2+2*u;
ergebnis+=zwischenergebnis;
}
return ergebnis; }


}

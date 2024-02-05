package Sortiert.NeuesKlausurübungsaufgaben;

public class Reihe {

    public static void main(String[] args) {
        // Test der reihe-Methode
        int k = 1;
        double result = reihe(k);

        System.out.println("Ergebnis der Reihe für k=" + k + ": " + result);
    }

    public static double reihe (int k) {
        double ergebnis = 0;
        while (k<=10000) {
        double zwischenergebnis = potenz (-1, k+1) / k;
        ergebnis+=zwischenergebnis;
        k++;
    }
            return ergebnis;
    }
        
        public static double potenz (double basis, int potenz) {
        double ergebnis = 1;
        while (potenz>0) {
        ergebnis*=basis; potenz--;}
        return ergebnis;}
}

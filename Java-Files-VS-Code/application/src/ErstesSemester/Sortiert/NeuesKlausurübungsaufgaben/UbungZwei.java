package Sortiert.NeuesKlausurübungsaufgaben;

public class UbungZwei {
    
    public static void main(String[] args) {
        // Test der potenz-Methode
        double basis = 2.0;
        int exponent = 0;

        double ergebnis = potenz(basis, exponent);

        System.out.println(basis + " hoch " + exponent + " ist gleich " + ergebnis);
    }


public static double potenz (double basis, int potenz) {
    double ergebnis = 1;
    
    while ( potenz>0) {
    ergebnis*=basis;
    potenz--;
    }
    return ergebnis; 
}
    

}

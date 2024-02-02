package Sortiert.KlausurÜbungsaufgabenZwe;

public class Log {
    public static double Logs(double x) throws RuntimeException {
        if (x <= 0 || x >= 2) throw new RuntimeException("Ungültige Eingabe");
    
        double temp = 0;  //Könnte man auch Endergebnis nennen
            
        double zwischenergebnis = 1;  // Setzen Sie den Anfangswert auf 1
        double tolerance = 1e-16;
    
        for (int n = 1; zwischenergebnis > tolerance || zwischenergebnis < -tolerance; n++) {
            zwischenergebnis = (power(-1, n + 1)) /  n; //Ich hab die Rechnung in zwei Schritte aufgeteilt, man hätte es auch in einer Zeile machen können
            zwischenergebnis = zwischenergebnis * power((x - 1), n);

            temp = temp + zwischenergebnis;
        }
    
        return temp;


        
    }


    public static double power(double basis, int potenz) {
        double result = 1;
        while (potenz>0) {
            result *=basis;
            potenz--;
        }
        return result;



    }
    




public static void main(String[] args) {
    System.out.println(FifthyFifthy());
    Math.random();
        double x = 1.6; // Beispielwert, Sie können einen anderen Wert wählen
        try {
            double lnValue = Logs(x);
            System.out.println("ln(" + x + ") = " + lnValue);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
}


//test

public static boolean FifthyFifthy () {

    return Math.random() <0.5; }






}
package Sortiert.SiebteLektion;
import java.util.Scanner;
public class SinusBerechnerOhneMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie einen Winkel in Grad ein: "); //Aufforderung an den User
        double winkelGrad = scanner.nextDouble(); //Fragt nach dem double

        // Umwandlung von Grad in Bogenmaß (Radiant)
        double winkelRadiant = gradZuRadiant(winkelGrad);

        // Berechnung des Sinus
        double sinusWert = berechneSinus(winkelRadiant);

        System.out.println("Der Sinus von " + winkelGrad + " Grad ist: " + sinusWert); //Ausgabe vom Ergebnis vom Benutzer

        scanner.close();
    }

    // Funktion zur Umwandlung von Grad in Bogenmaß (Radiant)
    private static double gradZuRadiant(double grad) {
        return grad * Math.PI / 180.0;
    }

    // Eigene Implementierung der Sinusfunktion
    private static double berechneSinus(double winkelRadiant) {
        double result = 0;
        double term = winkelRadiant;

        for (int i = 1; i <= 10; i += 2) {
            result += term;
            term *= -1 * winkelRadiant * winkelRadiant / ((i + 1) * (i + 2));
        }

        return result;
    }
}

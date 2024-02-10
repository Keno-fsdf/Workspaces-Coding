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
        double result = 0;  //Hier wird eine Variable result deklariert und auf 0 gesetzt. Diese Variable wird verwendet, um das Ergebnis der Sinus-Berechnung zu speichern.
        double term = winkelRadiant;  // Eine weitere Variable term wird deklariert und mit dem Eingabewert winkelRadiant initialisiert. 
        //Dieser Term wird in jedem Schleifendurchlauf aktualisiert und zur result-Variable hinzugefügt.


        for (int i = 1; i <= 10000; i += 2) {    //diese 10000 gibt einfach an wie oft die for-Schleife läuft -->Durch jede weitere Berechnung wird das Ergebnis genauer
                                                //man könnte also auch diesen Wert erhöhen um das Ergebnis minimal genauer zu haben -->time complexitiy: O(n)
            result += term;     // Bei der ersten Iteration wird winkelRadiant hinzugefügt, danach immer das Ergebnis von term in der Zeile darunter 
            //dadurch wird auch suzessiv das Ergebnis genauer.                 
            term *= -1 * winkelRadiant * winkelRadiant / ((i + 1) * (i + 2));  //Der Term wird aktualisiert, um den nächsten Beitrag zur Taylor-Reihe zu repräsentieren
            //. Dies geschieht durch Multiplikation mit dem Verhältnis von zwei aufeinanderfolgenden Zahlen
        }

        return result;    //Hier wird das ERgebnis zurückggeben
}}

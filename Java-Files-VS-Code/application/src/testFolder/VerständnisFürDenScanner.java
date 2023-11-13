package testFolder;

import java.io.IOException;
import java.util.Scanner;

public class VerständnisFürDenScanner  {
    public static void main(String[] args) {
        // Erstelle einen Scanner
        Scanner scanner = new Scanner(System.in);

        // Initialisiere die Variable für die Benutzereingabe
        char userInput;

        // Schleife, um sicherzustellen, dass nur ein Zeichen eingegeben wird
        do {
            // Zeige eine Meldung an den Benutzer an
            System.out.println("Gib einen einzelnen Buchstaben ein:");

            // Lies das erste Zeichen von der Benutzereingabe ein
            userInput = scanner.next().charAt(0);

            // Überprüfe, ob die Eingabe mehr als ein Zeichen hat
            if (scanner.hasNextLine()) {
                System.out.println("Bitte gib nur einen einzelnen Buchstaben ein.");
                scanner.nextLine(); // Verbrauche den Rest der Zeile
                userInput = '\0'; // Setze auf einen ungültigen Wert, um die Schleife zu wiederholen
            }

        } while (userInput == '\0');

        // Zeige das eingegebene Zeichen an
        System.out.println("Du hast den Buchstaben eingegeben: " + userInput);

        // Schließe den Scanner
        scanner.close();
    }
}

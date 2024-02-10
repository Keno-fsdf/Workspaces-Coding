package Sortiert.KlausuraufgabenÜbung;

import java.util.Scanner;

public class SpaceInvaders {
    private char[][] spielfeld;
    private int raumschiffPosition;

    public SpaceInvaders() {
        spielfeld = new char[4][8];
        raumschiffPosition = (int) (Math.random() * 8);

        // Initialisierung des Spielfelds
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0) {
                    spielfeld[i][j] = 'o'; // obere Reihe mit Aliens
                } else if (i == 3 && j == raumschiffPosition) {
                    spielfeld[i][j] = 'V'; // Raumschiff am zufälligen Ort
                } else {
                    spielfeld[i][j] = ' '; // Leerzeichen in den anderen Feldern
                }
            }
        }
    }

    public void bewege(char richtung) {
        if (richtung == 'a') {
            // nach links bewegen
            raumschiffPosition = (raumschiffPosition > 0) ? raumschiffPosition - 1 : 0;
        } else if (richtung == 'd') {
            // nach rechts bewegen
            raumschiffPosition = (raumschiffPosition < 7) ? raumschiffPosition + 1 : 7;
        }
        // Bei einem anderen Buchstaben passiert nichts
        
        // Update the spielfeld array based on the new raumschiffPosition
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 3 && j == raumschiffPosition) {
                    spielfeld[i][j] = 'V'; // Raumschiff an neuer Position
                } else {
                    spielfeld[i][j] = ' '; // Leerzeichen in den anderen Feldern
                }
            }
        }
    }
    

    @Override
    public String toString() {
        // Manual concatenation without StringBuilder
        String result = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                result += spielfeld[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        SpaceInvaders spiel = new SpaceInvaders();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(spiel);
            System.out.println("Buchstaben eingeben (a = links, d = rechts, x = Ende): ");
            char eingabe = scanner.next().charAt(0);

            if (eingabe == 'x') {
                System.out.println("Spiel beendet.");
                break;
            }

            spiel.bewege(eingabe);
        }

        scanner.close();
    }
}

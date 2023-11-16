package Sortiert.SiebteLektion;
import java.util.Scanner;
public class umwandlungInGroßbuchstaben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Werte soll deine Array haben:");
        int anzahlDerWerteListe = scanner.nextInt();
        char[] array = new char[anzahlDerWerteListe];

        // Einfügen der einzelnen Array-Werte in die Liste
        for (int i = 0; i < anzahlDerWerteListe; i++) {
            char a;
            do {
                System.out.println("Gib einen einzelnen Buchstaben für Index " + i + " ein:");

                // Lies das erste Zeichen von der Benutzereingabe ein
                a = scanner.next().charAt(0);

                // Überprüfe, ob nur ein Zeichen eingegeben wurde
                if (scanner.hasNextLine() && scanner.nextLine().length() > 0) {
                    System.out.println("Bitte gib nur einen einzelnen Buchstaben ein.");
                    a = '\0'; // Setze auf einen ungültigen Wert, um die Schleife zu wiederholen
                }
            } while (a == '\0');

            array[i] = a;
            
        }

        // System.out.println("Array: " + java.util.Arrays.toString(array));
        umwandlungInGroßbuchstabe(array);

        // Schließe den Scanner
        scanner.close();
    }

    public static void umwandlungInGroßbuchstabe(char[]array) {
        System.out.println();
        //hier morgen weitercoden
        // int i = array.length;
        int b = 0;
        for (char Buchstaben : array) {

            if (97<=Buchstaben && Buchstaben<=122) {
                int asciiWert = (int) Buchstaben;
                asciiWert = asciiWert-32;
                Buchstaben = (char) asciiWert;
            }
            System.out.println(Buchstaben);

            array [b] = Buchstaben;
            
             b++;




        }
         System.out.println("Array: " + java.util.Arrays.toString(array));

    }

}

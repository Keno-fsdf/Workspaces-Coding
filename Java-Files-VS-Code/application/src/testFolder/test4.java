package testFolder;
import java.util.Scanner;
import java.lang.Math;
public class test4 {
   
       
        public static void main(String[] args) {
            // Erstelle einen Scanner
            Scanner scanner = new Scanner(System.in);
    
            // Initialisiere die Variable für die Benutzereingabe
            char userInput;
    
            // Schleife, um sicherzustellen, dass nur ein Zeichen eingegeben wird
            while (true) {
                // Zeige eine Meldung an den Benutzer an
                System.out.println("Gib einen einzelnen Buchstaben ein:");
    
                // Lies das erste Zeichen von der Benutzereingabe ein
                String input = scanner.next();
    
                // Überprüfe, ob die Eingabe genau ein Zeichen hat
                if (input.length() == 1) {
                    userInput = input.charAt(0);
                    break; // Beende die Schleife, wenn ein einzelnes Zeichen eingegeben wurde
                } else {
                    System.out.println("Bitte gib nur einen einzelnen Buchstaben ein.");
                }
            }
    
            // Zeige das eingegebene Zeichen an
            System.out.println("Du hast den Buchstaben eingegeben: " + userInput);
    
            // Schließe den Scanner
            scanner.close();
        }

}       
// 0 -->9, weil es ungenau
//ich will die nachkommastelle auf 1 haben, also bspw. 10000


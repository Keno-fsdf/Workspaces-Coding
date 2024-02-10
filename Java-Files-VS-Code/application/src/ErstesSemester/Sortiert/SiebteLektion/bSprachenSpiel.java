package Sortiert.SiebteLektion;
import java.util.Scanner;
public class bSprachenSpiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte ein Wort ein:");
        String wort = scanner.nextLine();
        spielen(wort);
        scanner.close();
    }

    public static void spielen(String wort) {
        char[] wortliste = wort.toCharArray();
        int zählerfürDieLänge = 0;

        for (char c : wortliste) {
            if (isVowel(c)) {
                zählerfürDieLänge += 3;
            } else {
                zählerfürDieLänge += 1;
            }
        }

        char[] neueArray = new char[zählerfürDieLänge];
        int iNeu = 0;

        for (char c : wortliste) {
            if (isVowel(c)) {
                neueArray[iNeu] = c;
                neueArray[iNeu + 1] = 'b';
                neueArray[iNeu + 2] = c;
                iNeu += 3;
            } else {
                neueArray[iNeu] = c;
                iNeu++;
            }
        }

        System.out.println("Original: " + wort);
        System.out.println("B-Sprache: " + new String(neueArray));
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}
